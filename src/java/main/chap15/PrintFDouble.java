package chap15;

import java.util.Scanner;

public class PrintFDouble {
	
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数値:");
		double x = stdIn.nextDouble();
		
		System.out.print("表示全桁数:");
		int w = stdIn.nextInt();
		
		System.out.print("少数部桁数:");
		int p = stdIn.nextInt();
		
		printDouble(x, p, w);
		System.out.println();

	}

}
