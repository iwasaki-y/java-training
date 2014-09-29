package chap15;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("文字列s1:");  String s1 = stdIn.next();
		System.out.print("文字列s2:");  String s2 = stdIn.next();
		
		int balance = s1.compareTo(s2);
		if (balance < 0)
			System.out.println("s1のほうが小さい。");
		else if (balance > 0)
			System.out.println("s2のほうが小さい");
		else
			System.out.println("s1とs2は等しい。");

	}

}
