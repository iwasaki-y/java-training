package Chap07;

import java.util.Scanner;

public class PrintSeason {
	
	static void printSeason(int m) {
		switch (m) {
			case 3: case 4: case 5: System.out.println("春"); break;
			case 6: case 7: case 8: System.out.println("夏"); break;
			case 9: case 10: case 11: System.out.println("秋"); break;
			case 1: case 2: case 12: System.out.println("冬"); break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("何月ですか(1~12):");
			month = stdIn.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.print("その月の季節は");
		printSeason(month);
		System.out.print("です。");

	}

}
