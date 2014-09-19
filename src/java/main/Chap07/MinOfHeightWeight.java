package Chap07;

import java.util.Scanner;

public class MinOfHeightWeight {
	
	static int minOf(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("人数は:");
		int ninzu = stdIn.nextInt();
		
		int[] height = new int[ninzu];
		int[] weight = new int[ninzu];
		
		System.out.println(ninzu + "人の身長と体重を入力せよ。");
		
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番目の身長:");
			height[i] = stdIn.nextInt();
			System.out.print((i + 1) + "番目の体重:");
			weight[i] = stdIn.nextInt();
		}
		
		System.out.println("最も背が低い人の身長:" + minOf(height) + "cm");
		System.out.println("最も痩せている人の体重:" + minOf(weight) + "kg");
	}

}
