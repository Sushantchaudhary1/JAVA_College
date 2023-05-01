package Unit2;

class print {
	void display() {
		System.out.println("Print this using inheritance 1");
	}
	
	
}

class prints extends print{
	
	public  void display1() {
		System.out.println("Print this using inheritance 2");
	 }
}
 class print1 extends prints{
	 public void display2() {
		 super.display1();
		 super.display();
		 System.out.println("Print this using inheritance 3");
	 }
 }

public class MiltipleInterface {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1 obj =new print1();
	
			obj.display2();
	}

}
