package chap13;

/**
 * クラスShapeは、図形の概念を表す抽象クラスです。
 * 抽象クラスですから、本クラスのインスタンスを生成することはできません。
 * 具体的な図形クラスは、このクラスから派生します。
 * @author iwasaki-y
 * @see    object
 *
 */

public abstract class Shape {
	
	/**
	 * 図形情報を表す文字列を返却する抽象メソッドです。
	 * クラスShapeから派生するクラスで、このメソッドの本体を実装します。
	 * このメソッドは、java.lang.Objectクラスのメソッドを抽象メソッドとしてオーバー
	 * ライドしたメソッドです。
	 */
	public abstract String toString();
	
	/**
	 * メソッドdrawは、図形を描画するための抽象メソッドです。
	 * クラスShapeから派生するクラスで、このメソッドの本体を実装します。
	 */
	
	public abstract void draw();
	
	/**
	 * メソッドprintは、図形情報の表示と図形の描画を行います。
	 * 具体的には、以下の二つのステップを順次行います。<BR>
	 * step 1. メソッドtoStringが返却する文字列を表示して改行。<BR>
	 * step 2. メソッドdrawを呼び出しての図形の描画<BR>
	 */
	
	public void print() {
		System.out.println(toString());
		draw();
	}

}
