package Unit2;
abstract class  car{
	abstract void run();
}

class FourTyres extends car{
	void run() {
		System.out.println("Your speed is greater then 120 KMPH");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       car obj=new FourTyres();
       obj.run();
	}

}
