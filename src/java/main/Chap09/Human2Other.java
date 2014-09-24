package Chap09;

public class Human2Other {
	private String name;
	private int height;
	private int weight;
	private Day birthday;
	
	public Human2Other(String name, int height, int weight, Day birthday) {
		this.name = name;      this.height = height;
		this.weight = weight;  this.birthday = new Day(birthday);
	}
	
	public String getName()   { return name; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	public Day getBirthday()  { return new Day(birthday); }
	
	public void gainWeight(int w)   { weight += w; }
	public void reduceWeight(int w) { weight -= w; }
	
	public void putData() {
		System.out.println("名前:" + name);
		System.out.println("身長:" + height + "cm");
		System.out.println("体重:" + weight + "kg");
	}
	
	public String toString() {
		return "{" + name + ": " + height + "cm" + weight + "kg"
				   + birthday.toString() + "生まれ}";
	}

}
