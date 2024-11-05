import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcPreferedQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("JDBC:MySql://LocalHost:3306/MyDatabase","root","9552");
		
		System.out.println("Connected");
		
		
		Statement smt = con.createStatement();
		
		String sel="Select * From Student";
		
		ResultSet rs = smt.executeQuery(sel);
		
		while (rs.next()) {
			System.out.println("\n"+rs.getInt("S_Id")+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		rs.close();
		
		
		
		String Insert="Insert Into Student Values (?,?,?)";
		PreparedStatement psmt=con.prepareStatement(Insert);
		
		int id=1006;
		String Name="Unknown";
		int Dept=45;
		psmt.setInt(1,id);
		psmt.setString(2,Name);
		psmt.setInt(3,Dept);
		
		int IS = psmt.executeUpdate();
		
		System.out.println("Insert Line "+IS);
		
		
		ResultSet rs1 = smt.executeQuery(sel);
		
		while (rs1.next()) {
			System.out.println("\n"+rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+"\n");
			
		}
		rs1.close();
		
		String Update="Update Student Set S_Name=?,Dept=? Where S_Id=?";
		PreparedStatement Upsmt = con.prepareStatement(Update);
		String UName="Extra";
		int UDept=4569;
		Upsmt.setInt(3, id);
		Upsmt.setString(1, UName);
		Upsmt.setInt(2, UDept);
		int UpdLine=Upsmt.executeUpdate();
		System.out.println("Update Line "+UpdLine);
		System.out.println("---After Update---");
		ResultSet rs3 = smt.executeQuery(sel);
		
		while (rs3.next()) {
			System.out.println("\n"+rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3)+"\n");
			
		}
		rs3.close();
		
		String Del="Delete From Student Where S_Id=?";
		PreparedStatement Dpsmt = con.prepareStatement(Del);
		Dpsmt.setInt(1, id);
		int DelLine=Dpsmt.executeUpdate();
		System.out.println("Deleted Line "+DelLine);
		System.out.println("---After Delete---");
		ResultSet rs2 = smt.executeQuery(sel);
		
		while (rs2.next()) {
			System.out.println("\n"+rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+"\n");
			
		}
		rs2.close();
		
		
		
		con.close();
		
		
		
	}

}
