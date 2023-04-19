package Chaudhary;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321;
		int sum=0;
		int rev=num;
		while(num>0) {
			int rem = num%10;
			sum = sum*10+rem;
			num =num/10;
		}
		if(sum==rev) {
		System.out.println("Num is panlindrome ");
		}
		else{
			System.out.println("Num is not palindrome!");
		}
		

	}

}
