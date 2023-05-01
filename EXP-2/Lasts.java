package Unit2;


import java.util.Scanner;

class Number{
	
	private double num;
	
	void setData() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
	}
	
	boolean isZero() {
		if(num != 0) {
			return false;
		}
		return true;
	}	
		boolean isNegative() {
			if(num<Integer.MIN_VALUE) {
				return true;
			}
			return false;
		}
	 boolean  isPositive() {
		 if(num>=0) {
			 return true;
		 }
		 return false;
	 }
	 
	 boolean isOdd() {
		 if(num%2!=0) {
			 return true;
		 }
		 return false;
		 
	 }
	 boolean isEven() {
		 if(num%2==0) {
			 return true;
		 }
		 return false;
	 }
	 
	 boolean isPrime() {
		 if(num <=1) {
			 return false;
		 }
		 int c=2;
		 while(c*c<=num) {
			 if (num%c==0) {
				 return false;
			 }
			 c++;
		 }
		 return true;
	 }
//	 boolean isAmstrong() {
//		 if()
//	 }
}
public class Lasts {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Number obj= new Number();
      
      obj.setData();
      System.out.println("Is Zero- " + obj.isZero());
      System.out.println("Is Negative- "+ obj.isNegative());
      System.out.println("Is Positive- "+ obj.isPositive());
      System.out.println("Is Odd- "+ obj.isOdd());
      System.out.println("Is Even- "+ obj.isZero());
      System.out.println("Is prime- "+ obj.isPrime());
	}

}

