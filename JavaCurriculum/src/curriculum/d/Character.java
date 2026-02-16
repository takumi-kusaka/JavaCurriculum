package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Character {
	Random rand = new Random();

	// フィールドをカプセル化
	private String name;
	private int HP;
	private int AT;
	private int SP;

	// Daemon用の引数なしコンストラクタ
	Character() {
		this.name = name;
		this.HP = HP;
		this.AT = AT;
		this.SP = SP;

	}

	// Player用のコンストラクタを定義
//	Character(String name) {
//		this.name = name;
//		this.HP = rand.nextInt(100) + 1;
//		this.AT = rand.nextInt(30) + 1;
//		this.SP = rand.nextInt(10) + 1;
//
//	}

	// daemonステータスを読み込むメソッド
	public void loadDaemon(String filePath) throws Exception {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			this.name = br.readLine();
			this.HP = Integer.parseInt(br.readLine());
			this.AT = Integer.parseInt(br.readLine());
			this.SP = Integer.parseInt(br.readLine());
		}
	}

	// 攻撃メソッドを生成
	public String damage(int AT) {
		this.HP -= AT;
		if(this.HP <= 0) {
			this.HP = 0;
		}
		String m = this.name + "に" + AT + "のダメージ！" + "\n"
				+ "残りのHP:" + this.HP + " ";
		if (this.HP == 0) {
			m += this.name + "は力尽きた";
		}
		return m;
	}
	



	// getter.setterの生成
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHP() {
		return HP;
	}


	public int getAT() {
		return AT;
	}

	

	public int getSP() {
		return SP;
	}

	// 追加
	public void setStatus() {
		this.HP = rand.nextInt(100) + 1;
		this.AT = rand.nextInt(30) + 1;
		this.SP = rand.nextInt(10) + 1;
	}





}
