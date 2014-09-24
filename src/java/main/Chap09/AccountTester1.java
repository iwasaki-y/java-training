package Chap09;

public class AccountTester1 {

	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account2 suzuki = new Account2("鈴木一郎", "125768", 100, d);
		
		Day p = suzuki.getOpenDay();
		System.out.println("口座開設日:" + p);
		
		p.set(1999, 12, 31);
		
		Day q = suzuki.getOpenDay();
		System.out.println("口座開設日:" + q);

	}

}
