package chap13;

public abstract class Animal {
	private String name;
	
	public Animal(String name) { this.name = name; }
	
	public abstract void bark();
	
	public String getName() { return name; }

}

class Dog extends Animal {
	private String type;
	
	public Dog(String name, String type) {
		super(name); this.type = type;
	}
	
	public void bark() { System.out.println("ワンワン!!"); }
}

class Cat extends Animal {
	private int age;
	
	public Cat(String name, int age) {
		super(name); this.age = age;
	}
	
	public void bark() { System.out.println("ニャ～ン!!"); }
}
