package Chap05;

import java.util.Scanner;

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x :");
		float x = stdIn.nextFloat();
		System.out.print("y :");
		double y = stdIn.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
