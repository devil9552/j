import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcHardQuery {
	
	

//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con=DriverManager.getConnection("JDBC:MySql://localhost:3306/MyDatabase","root","9552");
//		System.out.println("Connected");
//		
//		Statement smt =con.createStatement();
//		String QuerySelect="Select * From Student";
//		ResultSet rs=smt.executeQuery(QuerySelect);
//		System.out.println("Select");
//		while(rs.next()) {
//			
//			
//			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
//		}
//		rs.close();
//		System.out.println("\n");
//		
//		
//		String QueryInsert="Insert Into Student Values (1006,'UnKnown',20)";
//		
//		boolean IS=!smt.execute(QueryInsert);
//		System.out.println("Insert="+IS);
//		
//		ResultSet rs1=smt.executeQuery(QuerySelect);
//		System.out.println("After Insert ");
//		while(rs1.next()) {
//			System.out.println(rs1.getInt(1)+rs1.getString(2)+rs1.getInt(3));
//		}
//		rs1.close();
//		System.out.println("\n");
//		
//		String QueryUpdate="Update Student Set S_Name='Extra',Dept=4455 Where S_Id=1006";
//		
//		boolean US=!smt.execute(QueryUpdate);
//		System.out.println("Update="+US);
//		
//		ResultSet rs3=smt.executeQuery(QuerySelect);
//		System.out.println("After Update ");
//		while(rs3.next()) {
//			System.out.println(rs3.getInt(1)+rs3.getString(2)+rs3.getInt(3));
//		}
//		rs3.close();
//		System.out.println("\n");
//		
//		
//		String QueryDel="Delete From Student Where S_Id =1006 ";
//		
//		boolean DS=!smt.execute(QueryDel);
//		System.out.println("deleted="+DS);
//		
//		ResultSet rs2=smt.executeQuery(QuerySelect);
//		System.out.println("After Delete");
//		
//		
////		Scanner sc = new Scanner(System.in);
//		String nm="Nikhil";
//		int dp =10;
//		while(rs2.next()) {
//			
//			if(rs2.getString(2).equalsIgnoreCase(nm) ||rs2.getInt(3)==dp ) {
//			System.out.println(rs2.getInt(1)+rs2.getString(2)+rs2.getInt(3));
//			
//			}
//		}
//		rs2.close();
//		
//		
//		con.close();
//		
//		
//		
//	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("JDBC:MySql://LocalHost:3306/MyDatabase","root","9552");
	
		System.out.println("Get Connected");
		String Sel="Select * From Student where S_Id=? ";
		PreparedStatement ps = con.prepareStatement(Sel);
		ps.setInt(1, 1001);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3));
		}
		
	}
	

}

