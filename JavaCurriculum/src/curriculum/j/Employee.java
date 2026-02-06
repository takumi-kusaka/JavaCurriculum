package curriculum.j;

public abstract class Employee implements Billable {
	// フィールド
	protected String id;
	protected String name;
	// インスタンス時フィールド初期化
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}
	// 
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}

// サブクラス
class FullTimeEmployee extends Employee {
	@Override
	public int costForDay(int hoursWorked) {
		int regularHours = 8 * 1250;
	    int overtime = Math.max(0, hoursWorked  - 8) * 1250 * 125 / 100;
	    return regularHours + overtime;
}
	// インスタンス時,親クラスのコンストラクタが呼ばれる
	FullTimeEmployee (String id, String name){
		super(id, name);
	}
}

 class ContractEmployee extends Employee{
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1000;
	}
	// インスタンス時,親クラスのコンストラクタが呼ばれる
	ContractEmployee (String id, String name){
	super(id, name);
	}
	
}
