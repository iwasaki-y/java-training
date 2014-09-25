package chap12;

public class CarTester3 {

	public static void main(String[] args) {
		Car car1 = new ExCar("W140", 1885, 1490, 5220,
				   95.0,
				   new Day(2005, 10, 13));
		
		car1.move(10, 10);
		
//		System.out.println("総走行距離:" + car1.getTotalMilage());
		System.out.println("総走行距離:" + ((ExCar)car1).getTotalMileage());
	}

}
