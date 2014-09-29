package chap15;

public class Circle {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		System.out.printf("半径%.2fの円周は%.2fで面積は%.2fです。\n",
				                        r, 2 * Math.PI * r, Math.PI * r * r);

	}

}
