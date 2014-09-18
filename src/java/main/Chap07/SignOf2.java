package Chap07;

import java.util.Scanner;

public class SignOf2 {
	
	static int signOf(int n) {
		if (n > 0)
			return 1;
		else if(n < 0)
			return -1;
		return 0;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数x:");
		int x = stdIn.nextInt();
		
		System.out.println("signOf(x)は" + signOf(x) + "です。");
	}

}
