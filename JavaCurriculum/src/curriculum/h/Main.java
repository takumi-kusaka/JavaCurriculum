package curriculum.h;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		// 労働時間
		int  hoursWorked = 9;

		System.out.println(
				"正社員の給与:" +
		fullTimeEmployee.calculateDailyWage(hoursWorked) + "円" + "\n"
				+ "パート社員の給料:" + partTimeEmployee.calculateDailyWage(hoursWorked) + "円"
		);
	}

}
