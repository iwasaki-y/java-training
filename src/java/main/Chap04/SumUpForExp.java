package Chap04;

import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からnまでの和を求めます。");
		int n;
		do {
			System.out.print("nの値:");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " + ");
			sum += i;
			}
		System.out.print(n + " = ");
		sum += n;
		
		System.out.println(sum);

	}

}
