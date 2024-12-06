package com.klef.hibernet_example;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="ContractEmployee")
public class Contract_Employee  extends Employee{
	int monthly_salary;
	public int getMonthly_salary() {
		return monthly_salary;
	}
	public void setMonthly_salary(int monthly_salary) {
		this.monthly_salary = monthly_salary;
	}
	public int getTimeperiod() {
		return timeperiod;
	}
	public void setTimeperiod(int timeperiod) {
		this.timeperiod = timeperiod;
	}
	int timeperiod;
	

}
