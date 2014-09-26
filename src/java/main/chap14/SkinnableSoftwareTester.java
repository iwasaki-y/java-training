package chap14;

class SkinnableSoftware implements Skinnable {
	int skin;
	
	public SkinnableSoftware()          { this.skin = BLACK; }
	public SkinnableSoftware(int skin)  { this.skin = skin; }
	
	public void changeSkin(int skin)  { this.skin = skin; }
	
	public int getSkin() { return skin; }
	
	public String getSkinString() {
		switch (skin) {
		case BLACK:   return "BLACK";
		case RED:     return "RED";
		case GREEN:   return "GREEN";
		case BLUE:    return "BLUE";
		case LEOPARD: return "LEOPARD";
		}
		
		return "";
	}
}

public class SkinnableSoftwareTester {

	public static void main(String[] args) {
		SkinnableSoftware x = new SkinnableSoftware();
		SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);
		
		x.changeSkin(Skinnable.LEOPARD);
		
		System.out.println("xのスキンは" + x.getSkinString() + "です。");
		System.out.println("yのスキンは" + y.getSkinString() + "です。");

	}

}
