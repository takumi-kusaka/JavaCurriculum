package curriculum.o;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	// Q4
	double weight;
	// Q7
	int bmi;
	// インスタンスの数を数える
	static int count = 0;


	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		// Q3
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// インスタンス生成ごとに+
		count++;
	}

	// Q6インスタンスメソッドを生成
	//	public double bmi(double height, double weight) {
	//		return weight / (height * height);
	//	}

	// Q7
	public int bmi() {
		bmi = (int) (weight / (height * height));
		return bmi;
	}

	// Q8
	public void print() {
		System.out.println(
				"名前は" + this.name + "です。" + "\n" +
						"年は" + this.age + "歳です" + "\n" +
						"BMIは" + this.bmi + "です"
		);
	}

}
