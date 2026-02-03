package curriculum.b;

public class Question5 {

	// Q1
	// helloWorldメソッドを生成
	// メインメソッドがあるのでstaticメソッド
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	// Q2
	// doubleValueメソッドを生成
	public static int doubleValue(int num) {
		return num * 2;
	}

	// Q3
	// isEvenメソッドを生成
	public static boolean isEven(int num) {
		// 引数numが2で割れるならtrue
		if (num % 2 == 0) {
			return true;
		}
		// それ以外ならfalseが返る
		return false;
	}


	public static void main (String[] args) {
		// Q1
		System.out.println("Q1");
		helloWorld();
		System.out.println();

		// Q2
		System.out.println("Q2");
		int num = 10;
		System.out.println("10を2倍すると" + doubleValue(num) + "です");
		System.out.println();

		// Q3
		System.out.println("Q3");
		int num1 = 7;
		int num2 = 10;
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です");
		} else {
			System.out.println(num1 + "は奇数です");
		}
		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です");
		} else {
			System.out.println(num2 + "は奇数です");
		}
		System.out.println();


	}

}
