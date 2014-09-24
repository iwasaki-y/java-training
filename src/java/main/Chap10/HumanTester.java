package Chap10;

public class HumanTester {

	public static void main(String[] args) {
		Human suzuki = new Human("鈴木二郎", 170, 60);
		Human takada = new Human("高田龍一", 166, 72);
		
		suzuki.putData();
		System.out.println("番:" + suzuki.getId());
		
		System.out.println();
		
		takada.putData();
		System.out.println("番号:" + takada.getId());

	}

}
