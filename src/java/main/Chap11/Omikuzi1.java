package Chap11;

import java.util.GregorianCalendar;
import java.util.Random;

public class Omikuzi1 {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(GregorianCalendar.YEAR);
		int m = today.get(GregorianCalendar.MONTH) + 1;
		int d = today.get(GregorianCalendar.DATE);
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		
		Random rand = new Random();
		int k = rand.nextInt(10);
		System.out.print("今日の運勢は");
		switch (k) {
		case 0:                 System.out.print("大吉"); break;
		case 1: case 2: case 3: System.out.print("吉");   break;
		case 4: case 5: case 6: System.out.print("中吉"); break;
		case 7: case 8:         System.out.print("小吉"); break;
		case 9:                 System.out.print("凶");   break;
		}
		
		System.out.println("です。");

	}

}
