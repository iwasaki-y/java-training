package Chap03;

import java.util.Scanner;

public class Diff2digits2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:"); int a = stdIn.nextInt();
		System.out.print("整数B:"); int b = stdIn.nextInt();
		
		int diff = a >= b ? a - b : b - a;
		
		System.out.println("それらの差は" +
		                   (diff <= 10 ? "10以下" : "11以上") + "です。");
	
		

	}

}
