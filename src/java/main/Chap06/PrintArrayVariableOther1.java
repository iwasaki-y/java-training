package Chap06;

public class PrintArrayVariableOther1 {

	public static void main (String[] args) {
		int[] a = { 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(b = a);
	}

}
