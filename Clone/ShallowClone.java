package Ch;
 class Test1{
	 int x; 
	 int y;
 }

 class Test3 implements Cloneable{
	 int a; 
	 int b;
	 Test1 c  =new Test1();
	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }
 }
	 
	public class ShallowClone{ 
        public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
        	Test3 t1 =new Test3();
        	t1.a=10;
        	t1.b=20;
        	t1.c.x=30;
        	t1.c.y=40;
        	
        	Test3 t2= (Test3)t1.clone();
        	
        	t2.a=100;
        	
        	t2.c.x=300;
        	
        	System.out.println(t1.a+" " + t1.b+" "+t1.c.x +" "+t1.c.y);
        	System.out.println(t2.a+" " + t2.b+" "+t2.c.x +" "+t2.c.y);

	}

}
