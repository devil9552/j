import java.util.ArrayList;
import java.util.HashMap;

public class Student {
int id;
String name;
String course;
Float fee;

public Student(int id, String name, String course, Float fee) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.fee = fee;
}
ArrayList<Student> createArrayList() {
	Student std = new Student(1001,"Rushikesh", "Dac", 106000f);
	Student std1 = new Student(1002,"Shrey", "Dac", 106000f);
	Student std2 = new Student(1003,"Nikhil", "Dac", 106000f);
	Student std3 = new Student(1004,"Aditya", "Dac", 106000f);
	Student std4 = new Student(1005,"Narayan", "Dac", 106000f);
	Student std5 = new Student(1006,"Niraj", "Dac", 106000f);
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(std);
	al.add(std1);
	al.add(std2);
	al.add(std3);
	al.add(std4);
	al.add(std5);
	return al;
}

HashMap<Integer, Student> createHashArray(ArrayList<Student> al) {
	HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
	for(Student st : al) {
		int i =al.indexOf(st);
		hm.put(++i, st);
	}
	
return hm;
	
}

void display() {
	System.out.println(id+" "+name+" "+course+" "+fee);
}

}
