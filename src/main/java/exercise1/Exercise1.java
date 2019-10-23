package exercise1;

public class Exercise1 {
	public Employee buildEmployee(String name){
		Employee D = new FixedSalaryEmployee(name,1);
		return D;
	}
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		FixedSalaryEmployee A = new FixedSalaryEmployee(name, fixedSalary);
		return A;
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int comission) {
		BaseSalaryPlusCommissionEmployee B = new BaseSalaryPlusCommissionEmployee(name, baseSalary, comission);
		return B;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		WorkHourSalaryEmployee C = new WorkHourSalaryEmployee(name, hourlyRoute);
		return C;
	}
}
