package curriculum.h;

// abstract, 抽象クラス
public abstract class Employee {
	// フィールドを生成
	String employeeId;
	String name;

	// コンストラクタを定義
	Employee(){
		this.employeeId = employeeId;
		this.name = name;
	}
	// getterの生成
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	// abstract, 抽象メソッドの生成
	public abstract int calculateDailyWage(int hoursWorked);

}
