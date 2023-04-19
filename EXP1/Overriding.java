package unit1;


class A{
	int x;
	A(){
		x=10;
	}
	void show() {
		System.out.println("X:"+x);
	}
}
class B extends A{
	int y;
	B()
	{
		y=20;
	}
	void show()
	{
		System.out.println("Y:"+y);
	}
}
public class Overriding {
public static void main(String []arg)
{
	A A1;
	A A2=new A();
	B B1 =new B();
	A1=A2;
	A1.show();
	A1=B1;
	A1.show();
}

	
}

