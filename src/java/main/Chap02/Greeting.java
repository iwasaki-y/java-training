package Chap02;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓:"); String firstName = stdIn.next();
		System.out.print("名:"); String lastName = stdIn.next();
		
		System.out.println("こんにちは" + firstName + lastName + "さん");

	}

}
