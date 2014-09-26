package chap14;

public class DVDPlayerTester {

	public static void main(String[] args) {
		DVDPlayer a = new DVDPlayer();
		Player    b = new DVDPlayer();
		ExPlayer  c = new DVDPlayer();
		
		System.out.println("DVDPlayer型変数a");
		a.play();
		a.stop();
		a.slow();
		
		System.out.println("Player型変数b");
		b.play();
		b.stop();
		
		System.out.println("ExPlayer型変数c");
		c.play();
		c.stop();
		c.slow();

	}

}
