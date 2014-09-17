package Chap05;

import java.util.Scanner;

public class OctHex1Line {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数:");
		int x = stdIn.nextInt();
		
		System.out.printf("8進数では%oで16進数では%xです。 \n", x, x);

	}

}
