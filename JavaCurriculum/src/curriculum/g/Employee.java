package curriculum.g;

public class Employee {
	// フィールドをカプセル化
	private String employeeId;
	private String name;


	// getter.setterの生成
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
