package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <Employee> employee = new ArrayList<>();
		employee.add(new FullTimeEmployee("E001", "佐藤太郎"));
		employee.add(new ContractEmployee("E002", "田中花子"));
		for (Employee e : employee) {
			System.out.println(e.calculateDailyWage(9));
		}
		

	}

}
