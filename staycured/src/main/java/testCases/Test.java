package testCases;

import java.util.Scanner;

public class Test {

	public void marks() {
		Scanner mark = new Scanner(System.in);
		int a, b;
		System.out.println("Enter External marks");
		a = mark.nextInt();
		System.out.println("Enter Practical marks");
		b = mark.nextInt();
		if ((a > 0 && a <= 24) && (b >= 0 && b <= 9)) {
			System.out.println("Fail");
		} else if ((a >= 25 && a <= 75) && (b >= 10 && b <= 25)) {
			System.out.println("Pass");
		} else if ((a >= 0 && a <= 24) && (b >= 10 && b <= 25)) {
			System.out.println("Fail");
		} else if ((a >= 25 && a <= 75) && (b >= 0 && b <= 9)) {
			System.out.println("Fail");
		} else if ((a > 75) && (b > 25)) {
			System.out.println("Both marks are Invalid");
		} else if (a > 75) {
			System.out.println("Internel marks is <75 so its Invalid");
		} else if (b > 25) {
			System.out.println("Practical marks is <25 so its Invalid");

		}

		mark.close();

	}
	
	public static void main(String[] args) {
		Test testes=new Test();
		testes.marks();
		
		
	}
}
