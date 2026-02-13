package curriculum.c;

public class CPU {
	// インスタンスフィールドを生成
	private int b;
// インスタンス生成時、0〜2の間で乱数を発生させ、代入
	public CPU() {
		this.b = new java.util.Random().nextInt(3);
	}
	// getter
	public int getB() {
		return b;
	}
	
}
