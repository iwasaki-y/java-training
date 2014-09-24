package Chap09;

import java.util.Scanner;

public class AccountTester2Other {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("口座情報を入力せよ。");
		System.out.print("名義:");
		String name = stdIn.next();
		System.out.print("番号:");
		String no = stdIn.next();
		System.out.print("残高:");
		long balance = stdIn.nextLong();
		System.out.print("開設年:");  int y = stdIn.nextInt();
		System.out.print("開設月:");  int m = stdIn.nextInt();
		System.out.print("開設日:");  int d = stdIn.nextInt();
		
		Day day = new Day(y, m, d);
		Account2 a = new Account2(name, no, balance, day);
		
		System.out.println("口座基本情報:" + a.toString());
		
		Day temp = a.getOpenDay();
		System.out.println("開設日:" + temp.toString());

	}

}
