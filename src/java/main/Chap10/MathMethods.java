package Chap10;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数:");
		double x = stdIn.nextDouble();
		
		System.out.println("絶対値:" + Math.abs(x));
		System.out.println("平方根:" + Math.sqrt(x));
		System.out.println("面    積:" + Math.PI * x * x);

	}

}
