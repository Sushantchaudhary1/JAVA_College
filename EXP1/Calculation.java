package Chaudhary;
public class Calculation{
  	int z;
	  public void addition(int x, int y) {
	      z=x+y;
	    System.out.println("The sum of these number is:"+z);
	 }
	  public void subtraction(int x, int y) {
	       z=x-y;
	    System.out.println("The subtraction of these number is:"+z);
	 }
}

class My_Calculation extends Calculation{
	 public void multiplication(int x, int y) {
         z=x*y;
  System.out.println("The multiplication of these number is:"+z);
  	 }


	  public static void main (String[] args) {
    	  int x=20; int y=10;
    	 My_Calculation sc = new My_Calculation();
    	  sc.addition(x, y);
  	      sc.subtraction(x, y);
    	  sc.multiplication(x,y);
    	  			
 	 
	  }
}
