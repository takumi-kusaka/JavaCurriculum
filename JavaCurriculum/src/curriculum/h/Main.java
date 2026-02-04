package curriculum.h;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E001", "佐藤太郎");
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("E002", "田中花子");
		// 労働時間
		int  hoursWorked = 9;

		System.out.println(
		fullTimeEmployee.name + ":" +
		fullTimeEmployee.calculateDailyWage(hoursWorked) + "円" + "\n"
				+ partTimeEmployee.name + ":" + partTimeEmployee.calculateDailyWage(hoursWorked) + "円"
		);
	}

}
