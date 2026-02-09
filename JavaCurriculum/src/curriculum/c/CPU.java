package curriculum.c;

public class CPU {
	// インスタンスフィールドを生成
	int b;

	public CPU() {
		// インスタンス生成時、0〜2の間で乱数を発生させ、代入
		this.b = new java.util.Random().nextInt(3);
	}

	public String getB() {
		 // bが0なら
		if (b == 0) {
			return "CPUの手:グー";
			// bが1なら
		} else if (b == 1) {
			return "CPUの手:チョキ";
		}
		// それ以外
		return "CPUの手:パー";
	}
}
