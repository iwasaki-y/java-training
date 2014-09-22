package Chap08;

class Human2 {
	private String name;
	private int height;
	private int weight;
	
	Human2(String n, int h, int w) {
		name = n; height = h; weight = w;
	}
	
	String getName() { return name; }
	int getHeight() { return height; }
	int getWeight() { return weight; }
	
	void gainWeight(int w) { weight += w; }
	void reduceWeight(int w) { weight -= w; }
}

public class HumanTester2 {

	public static void main(String[] args) {
	Human2 suzuki = new Human2("鈴木二郎", 170, 60);
	Human2 takada = new Human2("高田龍一", 166, 72);
	
	suzuki.gainWeight(3);
	takada.reduceWeight(5);
	
	System.out.println("名前:" + suzuki.getName());
	System.out.println("身長:" + suzuki.getHeight() + "cm");
	System.out.println("体重:" + suzuki.getWeight() + "kg");
	System.out.println();
	
	System.out.println("名前:" + takada.getName());
	System.out.println("身長:" + takada.getHeight() + "cm");
	System.out.println("体重:" + takada.getWeight() + "kg");

	}

}
