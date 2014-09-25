package chap13;

public abstract class Animal2 {
	private String name;
	public Animal2(String name) { this.name = name; }
	public abstract void bark();
	public String getName() { return name; }
	public abstract String toString();
	public void introduce() {
		System.out.print(toString() + "だ");
		bark();
	}

}

class Dog2 extends Animal2 {
	private String type;
	public Dog2(String name, String type) {
		super(name); this.type = type;
	}
	
	public void bark() { System.out.println("ワンワン!!"); }
	public String toString() {
		return type + "の" + getName();
	}
}

class Cat2 extends Animal2 {
	private int age;
	public Cat2(String name, int age) {
		super(name); this.age = age;
	}
	
	public void bark() { System.out.println("ニャ～ン!!"); }
	public String toString() {
		return age + "歳の" + getName();
	}
}
