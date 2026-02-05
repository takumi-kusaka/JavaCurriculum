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
		return (int)(8 * 1250 + (hoursWorked - 8) * 1250 * 1.25);
}
	// インスタンス時親クラスのコンストラクタが呼ばれる
	FullTimeEmployee (String id, String name){
		super(id, name);
	}
}

 class ContractEmployee extends Employee{
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * 1000;
	}
	// インスタンス時親クラスのコンストラクタが呼ばれる
	ContractEmployee (String id, String name){
	super(id, name);
	}
	
}
