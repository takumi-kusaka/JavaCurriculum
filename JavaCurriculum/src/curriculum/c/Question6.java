package curriculum.c;

import java.util.Scanner;

public class Question6 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// while判定用
		boolean flag = false;
		
		do {
			// 必ず行う処理
		System.out.print("グー(0),チョキ(1),パー(2)を入力:");
		// 変数を用意
		int a = 0;
		try {
			// 変数に入力された値を入れる
			a = Integer.parseInt(sc.nextLine());
			// 数字じゃなければ終了させる
		} catch (NumberFormatException e) {
			System.out.println("もう一度やり直してください");
			break;
		}
		// 入力された値で分岐
		switch (a) {
		// 0の時
		case 0 :
			System.out.println("あなたの手:グー");
			break;
		// 1の時
		case 1:
			System.out.println("あなたの手:チョキ");
			break;
		// 2の時
		case 2:
			System.out.println("あなたの手:パー");
			break;
		// それ以外
		default :
			System.out.println("0〜2で入力してください");
			continue;
		}
		// インスタンスを生成し
		// 手を決める
		CPU cpu = new CPU();
		// 手を表示
		switch(cpu.getB()) {
		case 0:
			System.out.println("CPUの手:グー");
			break;
		case 1:
			System.out.println("CPUの手:チョキ");
			break;
		case 2:
			System.out.println("CPUの手:パー");
			break;
		}
		
		// 相手の手と差分で出力を分岐
		switch((a - cpu.getB() + 3) %3){
		case 0:
			System.out.println("あいこ");
			break;
		case 1:
			System.out.println("あなたの負け！");
			break;
		case 2:
			System.out.println("あなたの勝ち！");
			flag = true;
			break;
		}
		// flag = false間ループ
		}while (!flag);
	
	}
}
