package curriculum.b;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		// Q1
		int score = 75;
		// scoreが60以上なら
		if (60 <= score) {
			System.out.println("Q1:合格です！");
			System.out.println();
			// }閉じ忘れ
		}
		// Q2
		int age = 25;
		// ageが20以上、30以下なら
		if (20 <= age && 30 >= age) {
			System.out.println("Q2:適正年齢です");
			System.out.println();
		} else {
			System.out.println("Q2:対象外です");
			System.out.println();
		}

		// Q3
		age = 18;
		// ageが20以上なら
		if (age >= 20) {
			System.out.println("Q3:成人です");
			System.out.println();
			// ageが13以上、19以下なら
		} else if (age >= 13 && age <= 19) {
			System.out.println("Q3:ティーンエイジャーです");
			System.out.println();
			// ageが12以下なら
		} else if (age <= 12) {
			System.out.println("Q3:子供です");
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
		System.out.print("Q5:数字の入力をしてください:");
		// 入力の窓口を用意
		Scanner sc = new Scanner(System.in);
		// 入力されたscをint型にしnumに代入
		int num = Integer.parseInt(sc.nextLine());
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
		// 数字を入力させる
		System.out.print("Q6:数字を入力してください:");
		// 入力されたscをint型にしvalueに代入
		int value = Integer.parseInt(sc.nextLine());
		if (value % 2 == 0) {
			System.out.println("偶数です");
			System.out.println();
		} else if (value % 2 != 0) {
			System.out.println("奇数です");
			System.out.println();
			// }閉じ忘れ
		}

		// Q7
		System.out.print("Q7:数字を入力してください:");
		// 入力されたscをint型にしscoreに代入
		score = Integer.parseInt(sc.nextLine());
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
			// }閉じ忘れ
		}

		// Q8	
		System.out.print("Q8:文字を入力してください:");
		// 入力されたscをString型にし、wardに代入
		String ward = sc.nextLine();
		// wardがnullまたは空文字の時
		// 修正
		if (ward == null || ward.equals("")) {
			System.out.println("入力が無効です");
			System.out.println();

		}

		// Q9 数値の入力
		System.out.print("Q9:1〜7のいずれかを入力:");
		// 入力されたscをint型にしdayに代入
		int day = Integer.parseInt(sc.nextLine());
		// switch文で分岐
		switch (day) {
		// 1の場合
		case 1:
			System.out.println("月曜日");
			System.out.println();
			break;
		// 2の場合
		case 2:
			System.out.println("火曜日");
			System.out.println();
			break;
		// 3の場合
		case 3:
			System.out.println("水曜日");
			System.out.println();
			break;
		// 4の場合
		case 4:
			System.out.println("木曜日");
			System.out.println();
			break;
		// 5の場合
		case 5:
			System.out.println("金曜日");
			System.out.println();
			break;
		// 6の場合
		case 6:
			System.out.println("土曜日");
			System.out.println();
			break;
		// 7の場合
		case 7:
			System.out.println("日曜日");
			System.out.println();
			break;
		// default忘れ
		default:
			System.out.println("無効な月です");
			System.out.println();
		}

		// Q10
		System.out.print("Q10:1〜12のいずれかを入力:");
		int month = Integer.parseInt(sc.nextLine());
		switch (month) {
		// 12,1,2の場合
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			System.out.println();
			break;
		// 3,4,5の場合
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			System.out.println();
			break;
		// 6,7,8の場合
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			System.out.println();
			break;
		// 9,10,11の場合
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			System.out.println();
			// break忘れ
			break;
		// それ以外
		default:
			System.out.println("無効な月です");
			System.out.println();
			break;
		}

	}
}
