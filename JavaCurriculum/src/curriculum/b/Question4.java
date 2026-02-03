package curriculum.b;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int a[];
		Scanner sc = new Scanner(System.in);

		// Q1
		a = new int[] { 1, 2, 3, 4, 5 };
		// a[0]から順番に取得し表示
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();

		// Q2
		a = new int[] { 10, 20, 30, 40, 50 };
		// aの末尾の要素から順番に取得
		// i = a.lengthで末尾、i--でa[0]の方へ
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println();

		// Q3
		// 合計値を入れる変数を用意
		int sum = 0;
		a = new int[] { 3, 5, 7, 9, 11 };
		// 取得するたびsumに追加
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum + "\n");

		// Q4
		a = new int[] { 12, 7, 9, 21, 5, 18 };
		// 最大値と最小値を入れる変数を用意
		// 初期値はa[0]
		int max = a[0];
		int min = a[0];
		// a[0]から順番に取得
		for (int i = 0; i < a.length; i++) {
			// 取得したものがa[0]より、大きいまたは小さいなら更新
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("最大値:" + max + "\n" + "最小値:" + min + "\n");

		// Q5
		a = new int[] { 1, 2, 3, 4, 5 };
		// 拡張for文で回す
		for (int i : a) {
			// 結果を2倍して表示
			System.out.println(i * 2);
		}
		System.out.println();

		// Q6
		a = new int[] { 4, 7, 10, 15, 20 };
		// 値があるか判定用
		// 初期値false
		boolean flag = false;
		// 数値を入力させる
		int b = Integer.parseInt(sc.nextLine());
		// 全要素を取得
		for (int i = 0; i < a.length; i++) {
			// bが配列に含まれているなら
			if (b == a[i]) {
				flag = true;
				// 処理を終了
				break;
			}
		}
		// flag = trueなら
		if (flag) {
			System.out.println(b + "は配列に含まれています");
			// それ以外
		} else {
			System.out.println(b + "は配列に含まれていません");
		}
		System.out.println();

		// Q7
		// 2次元配列
		int[][] array = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};
		// a.lengthで縦の長さを求め
		for (int i = 0; i < array.length; i++) {
			// その行の列を順番に取得し表示
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		System.out.println();

		// Q8
		int[][] array1 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		// 合計値を0に設定
		sum = 0;
		// a[0][0]から順番に取得しsumに入れる
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				sum += array1[i][j];
			}
		}
		System.out.println("合計値:" + sum + "\n");

		// Q9
		int[][] array2 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		// 最大値と最小値をa[0][0]に設定
		max = array2[0][0];
		min = array2[0][0];
		// 順番に取得し、最大値と最小値を更新
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				if (max < array2[i][j]) {
					max = array2[i][j];
				}
				if (min > array2[i][j]) {
					min = array2[i][j];
				}
			}
		}
		System.out.println("最大値:" + max + "\n" + "最大値:" + min + "\n");
	
	

		// Q10
		int[][][] array3 = {
				{
						{ 1, 2 },
						{ 3, 4 },
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		};
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				for (int k = 0; k < array3[i][j].length; k++) {
					System.out.println(array3[i][j][k]);
				}
			}
		}

		
		
	}
}
