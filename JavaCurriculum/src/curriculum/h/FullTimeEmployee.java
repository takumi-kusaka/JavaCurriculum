package curriculum.h;

public class FullTimeEmployee extends Employee {

	// 定数フィールド
	private static final int HOURLY_RATE = 1200;

	@Override
	public int calculateDailyWage(int hoursWorked) {
		// hoursWorkedが8以上なら
		if (hoursWorked > 8) {
			//
			return (HOURLY_RATE * 8) + ((hoursWorked - 8) * HOURLY_RATE ) * 125 / 100  ;
			// それ以外
		} else {
			// 1200 * hoursWorkedで返す
			return HOURLY_RATE * hoursWorked ;
		}
	}
	FullTimeEmployee(String employeeId, String name){
		super(employeeId, name);
	}
	
}
