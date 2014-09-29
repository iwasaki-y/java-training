package chap15;

import java.util.Scanner;

import chap13.ComputerPlayer;
import chap13.HumanPlayer;

public class FingerFlashing3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		HumanPlayer hp = new HumanPlayer();
		ComputerPlayer cp1 = new ComputerPlayer();
		ComputerPlayer cp2 = new ComputerPlayer();
		
		String[] hands = {"グー", "チョキ", "パー"};
		int retry;
		
		do {
			int comp1 = cp1.nextHand();
			int comp2 = cp2.nextHand();
			
			int user = hp.nextHand();
			
			System.out.println("コンピュータ1は" + hands[comp1] + "で、" +
			                   "コンピュータ2は" + hands[comp2] + "で、" +
					           "あなたは" + hands[user] + "です。");
			
			int r1 = (user - comp1 + 3) % 3;
			int r2 = (user - comp2 + 3) % 3;
			
			if (r1 == 2 && r2 == 2)
				System.out.println("あなたの勝ちです。");
			else if (r1 == 1 && r2 == 0)
				System.out.println("コンピュータ1の勝ちです。");
			else if (r1 == 0 && r2 == 1)
				System.out.println("コンピュータ2の勝ちです。");
			else if (r1 == 0 && r2 == 2)
				System.out.println("あなたとコンピュータ1の勝ちです。");
			else if (r1 == 2 && r2 == 0)
				System.out.println("あなたとコンピュータ2の勝ちです。");
			else if (r1 == 1 && r2 == 1)
				System.out.println("コンピュータ1と2の勝ちです。");
			else
				System.out.print("引分けです。");
			
			do {
				System.out.print("もう一度? (0)いいえ  (1)はい:");
				retry = stdIn.nextInt();
			} while (retry != 0 && retry != 1);
		} while (retry == 1);

	}

}
