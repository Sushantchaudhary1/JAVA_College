package Chaudhary;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("num1 is greatest");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Num2 is Greatest");
		}
		else{
			System.out.println("Num3 is greatest");
		}
		

	}

}
