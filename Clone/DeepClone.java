package Ch;

class test{
	int x;
	int y;
}

class test2 implements Cloneable{
	int a; int b;
	test c = new  test();
	public Object clone() throws CloneNotSupportedException{
		 test2 t=(test2)super.clone();
		 t.c = new test();
		 t.c.x=c.x;
		 t.c.y=c.y;
		 return t;
	}
}

public class DeepClone {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		test2 t1=new test2();
		t1.a=10;
		t1.b=20;
		t1.c.x=30;
		t1.c.y=40;
		
		test2 t3=(test2)t1.clone();
    t3.a=100;
    
    t3.c.x=300;
    
    System.out.println(t1.a+" "+t1.b+" "+t1.c.x+" "+t1.c.y);
    System.out.println(t3.a+" "+t3.b+" "+t3.c.x+" "+t3.c.y);
	}

}
