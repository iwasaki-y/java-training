package Chap10;

public class Human {
	private static int counter = 0;
	private String name;
	private int height;
	private int weight;
	private int id;
	
	public Human(String name, int height, int weight) {
		this.name = name; this.height = height; this.weight = weight;
		id = ++counter;
	}
	
	public String getName()  { return name; }
	public int getHeight()   { return height; }
	public int getWeight()   { return weight; }
	
	public void gainWeight(int w)   { weight += w; }
	public void reduceWeight(int w) { weight -= w; }
	
	public int getId() { return id; }
	
	public void putData() {
		System.out.println("名前:" + name);
		System.out.println("身長:" + height + "cm");
		System.out.println("体重:" + weight + "kg");
	}

}
