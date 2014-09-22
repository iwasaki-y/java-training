package Chap09;

import java.util.Scanner;

public class HumanArrayTester {
	
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++)
		System.out.printf("No.%d %s %3dcm %3dkg\n",
				           i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		Human[] p = {
				new Human("桑野慎一郎", 170, 70),
				new Human("高原徹也", 160, 59),
		};
		
		System.out.print("■配列qの要素数:");
		n = stdIn.nextInt();
		
		Human[] q = new Human[n];
		for (int i = 0; i < q.length; i++) {
			System.out.println("q[" + i + "]");
			System.out.print("名前:"); String name = stdIn.next();
			System.out.print("身長:"); int height = stdIn.nextInt();
			System.out.print("体重:"); int weight = stdIn.nextInt();
			q[i] = new Human(name, height, weight);
		}
		
		Human[][] x = {
				{ new Human("竹田祥平", 175, 52), new Human("橋川智之", 169, 60) },
				{ new Human("三宅秀樹", 178, 70), new Human("小林佑介", 172, 61) },
				{ new Human("白水祐亮", 168, 59), new Human("田中大喜", 165, 59) },
		};
		
		System.out.print("■配列yの行数:");
		n = stdIn.nextInt();
		
		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "]の列数:");
			n = stdIn.nextInt();
			y[i] = new Human[n];
			for (int j = 0; j < y[i].length; j++) {
				System.out.println("y[" + i + "][" + j + "]");
				System.out.print("名前:"); String name = stdIn.next();
				System.out.print("身長:"); int height = stdIn.nextInt();
				System.out.print("体重:"); int weight = stdIn.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		
		System.out.println("■配列p");
		printHumanArray(p);
		
		System.out.println("■配列q");
		printHumanArray(q);
		
		System.out.println("■配列x");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("第%d行\n", i);
			printHumanArray(x[i]);
		}
			System.out.println("■配列y");
			for (int i = 0; i < y.length; i++) {
				System.out.printf("第%d行\n", i);
				printHumanArray(y[i]);
		}

	}

}
