package curriculum.d;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) throws Exception {
		boolean flag1 = true;
		boolean flag2 = true;

		PrintWriter pw = new PrintWriter(new FileWriter("src/curriculum/d/battle_log.txt"));
		Scanner sc = new Scanner(System.in);

		do {

			// 名前を入力させる
			System.out.print("Playerの名前を入力:");
			// 入力された名前を変数nameに代入
			String name = sc.nextLine();
			// 入力された名前を引数にインスタンスを生成
			Character player = new Character(name);
			// ステータスを表示
			System.out.println("ようこそ" + player.getName() + "さん。\nあなたのステータスは" + "\n"
					+ "HP:" + player.getHP() + "\n"
					+ "AT:" + player.getAT() + "\n"
					+ "SP:" + player.getSP() + "  です。");
			// Daemonインスタンスを生成
			Character daemon = new Character();
			// loadDaemonでステータスを設定
			daemon.loadDaemon("src/curriculum/d/daemon_status.txt");
			// Daemonのステータスを表示
			System.out.println(
					daemon.getName() + "のステータスは" + "\n" +
							daemon.getHP() + "\n" +
							daemon.getAT() + "\n" +
							daemon.getSP() + "  です" + "\n"
							+ "戦いますか？" + "\n"
							+ "0 = 戦う" + "\n"
							+ "1 >= もう一度名前を入力" + "\n" + ":");
			
			
			int fight =0;
			try {
				fight = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください");
				continue;
			}
			
			
			
			if (fight == 0) {
				// ターン数を表示
				int count = 0;
				flag2 = true;
				// compareでSPを比較
				// player > daemon なら1が入る
				// < なら−１、== なら0が入る
				int spJudge = Integer.compare(player.getSP(), daemon.getSP());

				// flag = tureならループ
				while (flag2) {

					// ループごとにターン数を表示
					System.out.println(++count + "ターン目");
					System.out.println();

					// switch文で分岐
					switch (spJudge) {
					//	 spJudgeが1の時
					case 1:
						// 先行player
						daemon.damage(player.getAT());
						if (daemon.getHP() <= 0) {
							flag2 = false;
							break;
						}
						// 後攻daemon
						player.damage(daemon.getAT());
						if (player.getHP() <= 0) {
							flag2 = false;
							break;
						}
						break;
					case 0:
						// 0か1をランダムで発生
						int i = (int) (Math.random() * 2);
						// 0なら
						if (i == 0) {
							// 先行player
							daemon.damage(player.getAT());
							if (daemon.getHP() <= 0) {
								flag2 = false;
								break;
							}
							// 後攻daemon
							player.damage(daemon.getAT());
							if (player.getHP() <= 0) {
								flag2 = false;
								break;
							}
							// それ以外
						} else {
							// 先行daemon
							player.damage(daemon.getAT());
							if (player.getHP() <= 0) {
								flag2 = false;
								break;
							}
							// 後攻player
							daemon.damage(player.getAT());
							if (daemon.getHP() <= 0) {
								flag2 = false;
								break;
							}
						}
						break;
					case -1:
						// 先行daemon
						player.damage(daemon.getAT());
						if (player.getHP() <= 0) {
							flag2 = false;
							break;
						}
						// 後攻player
						daemon.damage(player.getAT());
						if (daemon.getHP() <= 0) {
							flag2 = false;
							break;
						}
						break;
					}
				}

				flag1 = false;
			}

			// doの閉じ
		} while (flag1);

		

	}
}
