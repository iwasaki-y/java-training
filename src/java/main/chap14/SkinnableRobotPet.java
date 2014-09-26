package chap14;

public class SkinnableRobotPet extends RobotPet implements Skinnable {
	private int skin;
	
	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName);
		this.skin = skin;
	}
	
	public void changeSkin(int skin) {
		this.skin = skin;
	}
	
	public void printSkin() {
		switch (skin) {
		case BLACK:    System.out.print("黒");   break;
		case RED:      System.out.print("赤");   break;
		case GREEN:    System.out.print("緑");   break;
		case BLUE:     System.out.print("青");   break;
		case LEOPARD:  System.out.print("豹柄"); break;
		}
	}

}
