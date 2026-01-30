package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Q1
		System.out.println("Q1");
		// iが10以上になるまで繰り返す
		// iの初期値0を1に変更
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();

		// Q2
		System.out.println("Q2");
		// iが20以上になるまで繰り返す
		for (int i = 2; i <= 20; i++) {
			// 2で割って余り0のものを出力
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		// Q3
		System.out.println("Q3");
		// iが1以上の間繰り返す
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println();

		// Q4
		System.out.println("Q4");
		int sum = 0;
		// iが100以上になるまで繰り返す
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();

		// Q5
		System.out.println("Q5");
		// iが5以上になるまで繰り返す
		// iの初期値0を1に変更
		for (int i = 1; i <= 5; i++) {
			// jがi以上になるまで繰り返す
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 改行
			System.out.println();
		}
		System.out.println();

		// Q6
		System.out.println("Q6");
		int i = 1;
		// aが10以上になるまで繰り返す
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();

		// Q7
		System.out.println("Q7");
		i = 2;
		// aが20以上になるまで繰り返す
		while (i <= 20) {
			// 2で割れるものだけを表示
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println();

		// Q8
		System.out.println("Q8");
		i = 10;
		// iが1以上の間繰り返す
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println();

		// Q9
		System.out.println("Q9");
		i = 1;
		sum = 0;
		// iが100以上になるまで繰り返す
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println();

		// Q10
		Scanner sc = new Scanner(System.in);
		do {
			// try-catch追加、
			try {
				System.out.print("Q10,数値の入力:");
				i = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				// 数値以外の入力の時
				System.out.println("数値が入力されていません");
			}
			// iが0じゃないなら繰り返す
		} while (i != 0);
		System.out.println("終了しました");
		System.out.println();

		// Q11
		System.out.println("Q11");
		for (int a = 1; a <= 9; a++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d * %02d = %02d || ", a, j, a * j);
			}
			System.out.println();
		}
		System.out.println();

		Random rand = new Random();
		// Q12
		System.out.println("Q12、商品を入力↓");
		boolean flag;
		String[] catalog = { "テレビ", "ディスプレイ", "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", };

		do {
			// テレビとディスプレイの合計を決める
			int stock = rand.nextInt(12);
			// while判定用
			flag = true;
			String input = sc.nextLine();
			String[] inputs = input.split("、");
			for (String s : inputs) {
				s = s.trim();

				switch (s) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					stock = rand.nextInt(12);
					System.out.println(s + "の残り台数は" + stock + "台です");
					break;
				case "テレビ":
				case "ディスプレイ":
					int TVstock = s.equals("テレビ") ? stock : 11 - stock;
					System.out.println(s + "の残りの台数は" + TVstock);
					break;
				default:
					System.out.println("「 " + s + " 」" + "は指定の商品ではありません");
					break;
				case "end":
					System.out.println("終了します");
					flag = false;
				}

			}

			System.out.println();
		} while (flag);
	}
}
