package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <Billable> billable = new ArrayList<>();
		billable.add(new FullTimeEmployee("E001", "佐藤太郎"));
		billable.add(new ContractEmployee("E002", "田中花子"));
		for (Billable b : billable) {
			System.out.println(b.costForDay(9));
		}

	}

}
