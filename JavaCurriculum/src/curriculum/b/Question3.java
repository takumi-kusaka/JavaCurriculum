package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Q1
		System.out.println("Q1");
		// iが10以上になるまで繰り返す
		for (int i = 0; i <= 10; i++) {
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
		for (int i = 0; i <= 5; i++) {
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
			System.out.print("Q10,数値の入力:");
			i = Integer.parseInt(sc.nextLine());
			// iが0じゃないなら繰り返す
		} while (i != 0);
		System.out.println("終了しました");
		System.out.println();

		// Q11 すみませんわかりませんでした。
		//		for (int i = 1; i <= 9; i++) {
		//			System.out.println(i);
		//		}

		Random rand = new Random();
		// Q12
		System.out.print("Q12,商品を入力:");
		// 商品を入力
		//商品一覧
		String[] catalog = { "テレビ", "ディスプレイ", "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", };
		String ward = sc.nextLine();
		// 残りの台数
		i = rand.nextInt(12);
		for (String s : catalog) {
			// switch文で分岐
			switch (s) {
			case "テレビ":
			case "ディスプレイ":
				
				System.out.println(s + "の残りの台数は" + i + "台です");
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(s + "の残りの台数は" + i + "台です");
				break;
			default:
				System.out.println(s + "は指定の商品ではありません");
				break;
			}
		}
	}

}
