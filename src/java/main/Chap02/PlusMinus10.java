package Chap02;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値:");
		int x = stdIn.nextInt();
		
		System.out.println("10を加えた値は" + (x + 10) + "です。");
		System.out.println("10を減じた値は" + (x - 10) + "です。");
	}

}
