package chap15;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("文字列:");
		String s = stdIn.next();
		
		System.out.print("逆から読むと");
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));
		System.out.println("です。");

	}

}
