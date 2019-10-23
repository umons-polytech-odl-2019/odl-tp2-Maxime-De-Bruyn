package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private int baseSalary = 0;
	private int comission = 0;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int comission){
		super(name);
		this.baseSalary = baseSalary;
		this.comission = comission;
	}
	@Override
	public int computeSalary(){
		return baseSalary + comission*getSales();
	}
}
