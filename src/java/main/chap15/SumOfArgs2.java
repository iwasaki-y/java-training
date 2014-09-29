package chap15;

public class SumOfArgs2 {

	public static void main(String[] args) {
		double sum = 0.0;
		for (String s : args)
			sum += Double.parseDouble(s);
		System.out.println("合計は" + sum + "です。");

	}

}
