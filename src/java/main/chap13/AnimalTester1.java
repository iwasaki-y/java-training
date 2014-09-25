package chap13;

public class AnimalTester1 {

	public static void main(String[] args) {
		Animal2[] a = new Animal2[2];
		a[0] = new Dog2("ハチ公","柴犬");
		a[1] = new Cat2("マイケル", 7);
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
