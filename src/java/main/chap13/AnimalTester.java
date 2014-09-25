package chap13;

public class AnimalTester {

	public static void main(String[] args) {
		
//		Animal x = new Animal();
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("ハチ公", "柴犬");
		a[1] = new Cat("マイケル", 7);
		
		for (Animal s : a) {
			System.out.print(s.getName() + " ");
			s.bark();
			System.out.println();
		}
	}

}
