package chap12;

public class CarTester1 {

	public static void main(String[] args) {
		Car car1 = new Car("W140", 1885, 1490,5220,
				            95.0,
				            new Day(2005, 10, 13));
		
		ExCar car2 = new ExCar("W221", 1845, 1490, 5205,
				            90.0,
				            new Day(2010, 12, 24));
		
		Car x;
		x = car1;
		x = car2;
		
		System.out.println("xの購入日:" + x.getPurchaseDay());
		
		ExCar y;
//		y = car1;
		y = car2;
		
		System.out.println("yの購入日:" + y.getPurchaseDay());
		System.out.println("yの総走行距離:" + y.getTotalMileage());

	}

}
