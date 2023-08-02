package testCases;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calc=new Scanner (System.in);
		int num1,num2;
		String ope;
		System.out.println("Enter number1:");
		num1=calc.nextInt();
		System.out.println("Enter the type of operation +,-,*,/,%:");
		ope=calc.next();
		System.out.println("Enter number2:");
		num2=calc.nextInt();
		int result=0;
for (int num=0; num<=10;num++) {
	

	if(ope.equals("+")) {
		System.out.println(result=num1+num2);
		
	}
		else if(ope.equals("-")) {
		
			System.out.println(result=num1-num2);
		}
		else if(ope.equals("*")) {
			
			System.out.println(result=num1*num2);
		}
		else if(ope.equals("/")) {
			
			System.out.println(result=num1/num2);
		}
		else if(ope.equals("%")) {
			
			System.out.println(result=num1%num2);
		}
		}
		}
}
