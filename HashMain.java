import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMain {
	public ArrayList <Student> setRemove(ArrayList <Student> al) {
		int index=-1;
		for(Student st :al) {
			
			 if (st.id==1005) {
				al.set(4, new Student(1005, "Extra", "Dac", 106000f));
				
			}
			 
			 else if(st.id==1006 ) {
					index=al.indexOf(st);
					
					
				}
		}
		try{
			al.remove(index);
		}catch (Exception e) {
			System.out.println(e);
			}
		finally 
		{
				System.out.println("finally");
				
		}
		
		return al;
	}
	void displayAl(ArrayList<Student> al) {
		for (Student std : al) {
			std.display();
		}
		System.out.println("-----------------------------------------------------------");
	}
	void displayHm(HashMap<Integer, Student> hm) {
		
		
		for (Map.Entry<Integer, Student> st : hm.entrySet()) {
			int i=st.getKey();
			System.out.print(i+" , ");
			Student s =hm.get(i);
			s.display();
		}
	}
	HashMap<Integer, Student> updateHm(HashMap<Integer, Student> hm) {
		int id=1005;
		for (Map.Entry<Integer, Student> me : hm.entrySet()) {
			int i=me.getKey();
			Student s =hm.get(i);
			if (s.id==id) {
				hm.put(i, new Student(id, "Unknown", "N/A", 0.0f));
				
			}	
		}
	
		return hm;
		
	}
	
	
	HashMap<Integer, Student> removeHm(HashMap<Integer, Student> hm) {
		for(Map.Entry<Integer, Student> h:hm.entrySet()) {
			int i=h.getKey();
			Student s =hm.get(i);
			if(s.id==1006) {
				hm.remove(i);
				System.out.println("Done");
			}
			
		}
		return hm;
	}
	
	public static void main(String[] args) {
		Student std = new Student(0, null, null, null);
		ArrayList<Student> al=std.createArrayList();
		
		HashMap<Integer, Student> hm=std.createHashArray(al);
		
		HashMain hmain =new HashMain();
//		hmain.setRemove(al);
		hmain.displayAl(al);
		hmain.displayHm(hm);
		hm=hmain.removeHm(hm);
		hmain.displayHm(hm);
		System.out.println("-------------------------------------------------------------------");
		hm=hmain.updateHm(hm);
		hmain.displayHm(hm);
		System.out.println("-------------------------------------------------------------------");
		Student s1= hm.get(1);
		s1.display();
		
		
	
	}

}
