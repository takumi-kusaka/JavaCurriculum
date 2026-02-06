package curriculum.k;

// abstractクラス
public abstract class Employee {
	private String name;
	private int hours;
	

	// コンストラクタを定義
	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	

	// getter
	public String getName() {
		return name;
	}
	
	public int getHours() {
		return hours;
	}
	// 給料を計算するabstractメソッド
	abstract protected int calculateSalary();
	
}
