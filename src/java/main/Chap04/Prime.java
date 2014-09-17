package Chap04;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2以上の整数値:");
			n = stdIn.nextInt();
		} while (n < 2);
		
		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0)
				break;
		
		if (i == n)
			System.out.println("それは素数です。");
		else
			System.out.println("それは素数ではありません。");

	}

}
