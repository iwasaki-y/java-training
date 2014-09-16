package Chap04;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("3桁の正の整数値:");
			x = stdIn.nextInt();
		} while (x < 100 || x > 999);
		
		System.out.println(x + "と入力しましたね。");

	}

}
