package Chap03;

import java.util.Scanner;

public class Diff2B {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();
		System.out.print("整数b:"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		System.out.println("それらの差は" + diff + "です。");

	}

}
