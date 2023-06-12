package Unit3;
class Admission{
	String name;
	String course;
	float per;
	Admission(String nam, String dom, float mark){
		this.name=nam;
		this.course=dom;
		this.per=mark;
	}//end constructor
	
	boolean Eligibility() throws Exception{
		if(per >= 70) {
			throw new Exception("Congratulation "+name+"! you are not eligible for taking Admission in "+course+" kiet");
		}
		else {
			return false;
		}
	}// end eligibility
	
	void Allow() throws Exception{
		if(Eligibility()) {
			System.out.println("You are allowed!");
	}
	else{
		System.out.println(" yaha ");
		}
	}//end allow
}//end admission
public class Program2
{
	public static void main(String[]args)
	{
		Admission add=new Admission("Mian","MCA",42.2f);
		try {
			add.Allow();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}