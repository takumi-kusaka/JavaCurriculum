package curriculum.k;

public class FullTime extends Employee {

	@Override
	// 正社員給与計算
	protected int calculateSalary() {
		 int regularHours = 8 * 1250;
		    int overtime = Math.max(0, getHours() - 8) * 1250 * 125 / 100;
		    return regularHours + overtime;
	}
	
	// インスタンス時、親のコンストラクタが呼ばれる
	public FullTime(String name, int hours){
		super(name, hours);
	}
	
}
