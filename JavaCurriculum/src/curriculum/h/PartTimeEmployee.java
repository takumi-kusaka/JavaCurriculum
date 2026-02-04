package curriculum.h;

public class PartTimeEmployee extends Employee {
	// 定数フィールド
	private static final int HOURLY_RATE = 1000;

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 時間×時給を返す
		return HOURLY_RATE * hoursWorked;
	}
	PartTimeEmployee (String employeeId, String name){
		super(employeeId, name);
	}
	
}
