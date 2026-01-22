package curriculum.a;

public class Quession1 {
	
	public static void main(String[] args) {
		
		// Q1
		// 変数宣言と初期化
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;
		
		// Q2
		// 値を入れる
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;

		// Q3
		System.out.println(byteNum);
		System.out.println(shortNum / 5);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / 100);
		System.out.println(byteNum - shortNum);
		System.out.println();

		// Q4
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		System.out.println();

		// Q5
		int age = 25;
		System.out.println("年齢:" + age + "歳");
		System.out.println();

		// Q6
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println();

		// Q7
		int score = 80;
		score += 20;
		System.out.println("最終スコア:" + score);
		System.out.println();

		// Q8
		double price = 99.99;
		// double型からint型への変換
		System.out.println("整数価格:" + (int) price);
		System.out.println();

		// Q9
		String numSt = "123";
		// String型からint型への変換
		System.out.println(Integer.parseInt(numSt) + 10);
		System.out.println();

		// Q10
		int num = 50;
		// int型からString型への変換
		System.out.println("得点:" + String.valueOf(num));
		System.out.println();

		// Q11
		int a = 10;
		int b = 20;
		// aの方が小さければtrue
		boolean result = a < b;
		System.out.println(result);
		System.out.println();

		// Q12
		int x = 15;
		System.out.println(x >= 10 ? "OK" : "NG");
		System.out.println();

		// Q13
		String text = "私はJavaが好きです。Javaは楽しい!";
		System.out.println(text.replace("Java", "Python"));
		System.out.println();

	}

}
