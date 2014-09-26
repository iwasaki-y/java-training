package chap14;

public class WearableComputer implements Wearable {
	
	public void putOn() {
		System.out.println("コンピューターを起動しました。");
	}
	
	public void putOff() {
		System.out.println("コンピューターをシャットダウンしました。");
	}
	
	public void reset() {
		System.out.println("コンピューターを再起動しました。");
	}

}
