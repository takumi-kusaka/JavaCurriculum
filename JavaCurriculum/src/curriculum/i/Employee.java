package curriculum.i;
// テキストより引用
public abstract class Employee {

	protected String id;
	protected String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);
}


// FullTimeEmployeeクラス
class FullTimeEmployee extends Employee {
	// 親クラスのコンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}


// ContractEmployeeクラス
class ContractEmployee extends Employee {
	// 親クラスのコンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}

}
