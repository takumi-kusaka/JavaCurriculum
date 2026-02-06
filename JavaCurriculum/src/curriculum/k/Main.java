package curriculum.k;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new FullTime("佐藤太郎", 9);
		Employee e2 = new Contract("田中花子", 8);
		System.out.println(e1.getName() + "は" + e1.calculateSalary() + "円です");
		System.out.println(e2.getName() + "は" + e2.calculateSalary() + "円です");
		
	}

}
