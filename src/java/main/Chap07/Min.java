package Chap07;

import java.util.Scanner;

public class Min {
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}
	
	static int min(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] < min)
				min = a[i];
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値:"); int x = stdIn.nextInt();
		System.out.print("yの値:"); int y = stdIn.nextInt();
		System.out.print("zの値:"); int z = stdIn.nextInt();
		System.out.print("配列aの要素数:");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("x,yの最小値は" + min(x, y) + "です。");
		
		System.out.println("x,y,zの最小値は" + min(x, y, z) + "です。");
		
		System.out.println("配列aの最小値は" + min(a) + "です。");

	}

}
