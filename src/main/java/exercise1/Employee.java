package exercise1;
import java.util.*;

public abstract class Employee {
	private final String name;
	private int workedHours = 0;
	private int sales;

	protected Employee(String name){
		this.name = name;
	}

	public abstract int computeSalary();

	public void sell() {
		sales++;
	}

	protected int getSales(){
		return sales;
	}

	public void workOneHour() {
		workedHours++;
	}

	protected int getWorkedHours(){
		return workedHours;
	}

	public String getName() {
		return name;
	}
}
