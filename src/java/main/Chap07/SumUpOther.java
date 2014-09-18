package Chap07;

import java.util.Scanner;

public class SumUpOther {
	
	static int sumUp(final int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からxまでの和を求めます。");
		int x;
		do {
			System.out.print("xの値:");
			x = stdIn.nextInt();
		} while (x <= 0);
		
		System.out.println("1から" + x +"までの和は" + sumUp(x) + "です。");

	}

}
