package Chap04;

import java.util.Random;
import java.util.Scanner;

public class kazuate2digits {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = 10 + rand.nextInt(90);
		
		System.out.println("数当てゲーム開始!!");
		System.out.println("10~99の数を当ててください。");
		
		int x;
		do {
			System.out.print("いくつかな:");
			x = stdIn.nextInt();
			if (x > no)
				System.out.println("もっと小さな数だよ。");
			else if (x < no)
			System.out.println("もっと大きな数だよ");
		} while (x != no);
		
		System.out.println("正解です。");
	}

}
