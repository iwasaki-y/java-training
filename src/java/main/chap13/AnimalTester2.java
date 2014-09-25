package chap13;

public class AnimalTester2 {

	public static void main(String[] args) {
		Animal2[] a = {
				new Dog2("ハチ公", "柴犬"),
				new Cat2("マイケル", 7),
		};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i].introduce();
		}

	}

}
