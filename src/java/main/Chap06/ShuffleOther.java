package Chap06;

import java.util.Random;
import java.util.Scanner;

public class ShuffleOther {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		for (int i = n - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			if (i != j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		
		System.out.println("要素をかき混ぜました。");
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
