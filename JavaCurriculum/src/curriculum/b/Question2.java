package curriculum.b;

public class Question2 {
	public static void main(String[] args) {
		// Q1
		int score = 75;
		// scoreが60以上なら
		if (60 <= score) {
			System.out.println("合格です！");
			System.out.println();

			// Q2
			int age = 25;
			// ageが20以上、30以下なら
			if (20 <= age && 30 >= age ) {
				System.out.println("適正年齢です");
				System.out.println();
			} else {
				System.out.println("対象外です");
				System.out.println();
			}

			// Q3
			age = 18;
			// ageが20以上なら
			if (age >= 20) {
				System.out.println("成人です");
				System.out.println();
				// ageが13以上、19以下なら
			} else if (age >= 13 && age <= 19) {
				System.out.println("ティーンエイジャーです");
				System.out.println();
				// ageが12以下なら
			} else if (age <= 12) {
				System.out.println("子供です");
				System.out.println();
			}

			// Q4
			int x = 30;
			int y = 15;
			int z = 50;
			// zがxとyより大きいなら
			if (x < z && y < z) {
				System.out.println(z);
				System.out.println();
				// yがxとzより大きいなら
			} else if (x < y && z < y) {
				System.out.println(y);
				// それ以外
			} else {
				System.out.println(x);
				System.out.println();
			}

			// Q5
			// 数値を入力させる
			System.out.print("数字の入力をしてください:");
			int num = new java.util.Scanner(System.in).nextInt();
			// numが0より大きい場合
			if (0 < num) {
				System.out.println("正の数です");
				System.out.println();
				// numが0なら
			} else if (num == 0) {
				System.out.println("0です");
				System.out.println();
				// numが0より小さい場合
			} else if (num < 0) {
				System.out.println("負の数です");
				System.out.println();
			}

			// Q6 
			// 数字を乳させる
			System.out.print("数字を入力してください:");
			int value = new java.util.Scanner(System.in).nextInt();
			if (value % 2 == 0) {
				System.out.println("偶数です");
				System.out.println();
			} else if (value % 2 != 0) {
				System.out.println("奇数です");
				System.out.println();

				// Q7
				System.out.print("数字を入力してください:");
				score = new java.util.Scanner(System.in).nextInt();
				// 数字が90以上なら
				if (score >= 90) {
					System.out.println("優");
					System.out.println();
					// 数字が70以上なら
				} else if (score >= 70) {
					System.out.println("良");
					System.out.println();
					// 数字が50以上なら
				} else if (score >= 50) {
					System.out.println("可");
					System.out.println();
					// 数字が50未満なら
				} else if (score < 50) {
					System.out.println("不可");
					System.out.println();

					// Q8	
					System.out.print("文字を入力してください:");
					String ward = new java.util.Scanner(System.in).nextLine();
					// wardがnullまたは空文字の時
					if (ward == null || ward == "") {
						System.out.println("入力が無効です");
						System.out.println();
					}
				}

				// Q9 数値の入力
				System.out.print("1〜7のいずれかを入力:");
				int day = new java.util.Scanner(System.in).nextInt();
				// switch文で分岐
				switch (day) {
				case 1:
					System.out.println("月曜日");
					System.out.println();
					break;
				case 2:
					System.out.println("火曜日");
					System.out.println();
					break;
				case 3:
					System.out.println("水曜日");
					System.out.println();
					break;
				case 4:
					System.out.println("木曜日");
					System.out.println();
					break;
				case 5:
					System.out.println("金曜日");
					System.out.println();
					break;
				case 6:
					System.out.println("土曜日");
					System.out.println();
					break;
				case 7:
					System.out.println("日曜日");
					System.out.println();
					break;
				}

				// Q10
				System.out.print("1〜12のいずれかを入力:");
				int month = new java.util.Scanner(System.in).nextInt();
				switch (month) {
				case 12:
				case 1:
				case 2:
					System.out.println("冬");
					System.out.println();
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("春");
					System.out.println();
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("夏");
					System.out.println();
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("秋");
					System.out.println();
				default:
					System.out.println("無効な月です");
					System.out.println();
				}

			}
		}
	}
}
