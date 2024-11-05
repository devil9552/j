
public class Dac extends Cdac  {
	float fee;
	String id_color;
	public Dac(int formNo, String std_Name, String allotedCenter, float fee, String id_color) {
		super(formNo, std_Name, allotedCenter);
		this.fee=fee;
		this.id_color=id_color;
	}
	
	void displayDac() {
		System.out.println(formNo+" "+std_Name+" "+allotedCenter+" "+id_color+" "+fee);
	}

	
}
