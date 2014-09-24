package Chap10;

class Id2 {
	private static int counter = 0;
	private int id;
	
	public Id2() {
		id = ++counter;
	}
	
	public int getId2() {
		return id;
	}
	
	public static int getMaxId() {
		return counter;
	}
}

public class IdTester2 {

	public static void main(String[] args) {
		Id2 a = new Id2();
		Id2 b = new Id2();
		
		System.out.println("aの識別番号:" + a.getId2());
		System.out.println("bの識別番号:" + b.getId2());
		
		System.out.println("最後に与えた識別番号 = " + Id2.getMaxId());
		System.out.println("最後に与えた識別番号 = " + a.getMaxId());
		System.out.println("最後に与えた識別番号 = " + b.getMaxId());

	}

}
