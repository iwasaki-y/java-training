package Chap11;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class MathMethods {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.print("実数:");
		double x = stdIn.nextDouble();
		out.println("絶対値:" + abs(x));
		out.println("平方根:" + sqrt(x));
		out.println("面    積:" + PI * x * x);

	}

}
