package curriculum.g;

public class Main {

	public static void main(String[] args) {
		// インスタンスを生成
		Employee employee = new Employee();
		// setterで変数をセット
		employee.setEmployeeId("E002");
		employee.setName("田中花子");

		System.out.println("社員ID:" + employee.getEmployeeId() + "、名前:" + employee.getName());

	}

}
