package chap15;

import java.util.Scanner;

public class PrintStringArray1 {
	
	static void printStringArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++)
				System.out.print(a[i].charAt(j));
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("文字列の個数:");
		int n = stdIn.nextInt();
		String[] sx = new String[n];
		
		for (int i = 0; i < sx.length; i++) {
			System.out.print("sx[" + i + "] = ");
			sx[i] = stdIn.next();
		}
		
		printStringArray(sx);

	}

}
