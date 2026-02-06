package curriculum.k;

public class Contract extends Employee {

	@Override
	// パート社員給与計算
	protected int calculateSalary() {
		return
	getHours() * 1000;
	}

	
	// インスタンス時、親のコンストラクタが呼ばれる
	public Contract(String name, int hours){
		super(name, hours);
	}
	
	
}
