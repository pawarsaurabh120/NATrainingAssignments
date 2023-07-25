package com.corejava.intermediateOOP;

class Employee {
	private String eName;
	private double eBaseSalary;

	public Employee(String eName, double eBaseSalary) {
		super();
		this.eName = eName;
		this.eBaseSalary = eBaseSalary;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteBaseSalary() {
		return eBaseSalary;
	}

	public void seteBaseSalary(double eBaseSalary) {
		this.eBaseSalary = eBaseSalary;
	}

	public double totalSalary() {
		return geteBaseSalary();
	}

}

class Manager extends Employee {
	private double mIncentive;

	public double getmIncentive() {
		return mIncentive;
	}

	public void setmIncentive(double mIncentive) {
		this.mIncentive = mIncentive;
	}

	public Manager(String eName, double eBaseSalary, double mIncentive) {
		super(eName, eBaseSalary);
		this.mIncentive = mIncentive;
	}

	public double totalSalary() {
		return super.geteBaseSalary() + mIncentive;
	}
}

class Labour extends Employee {
	private double lOvertime;

	public double getlOvertime() {
		return lOvertime;
	}

	public void setlOvertime(double lOvertime) {
		this.lOvertime = lOvertime;
	}

	public Labour(String eName, double eBaseSalary, double lOvertime) {
		super(eName, eBaseSalary);
		this.lOvertime = lOvertime;
	}

	public double totalSalary() {
		return super.geteBaseSalary() + lOvertime;
	}
}

public class Q2_EmpManagerLab {

	public static void main(String[] args) {
		Employee emp1 = new Manager("Saurabh", 5000, 1000);
		Employee emp2 = new Manager("Hemnat", 4500, 800);
		Employee emp3 = new Labour("Nimesh", 3000, 200);
		Employee emp4 = new Labour("Pranav", 2500, 300);

		System.out.println(emp1.totalSalary());
		System.out.println(emp2.totalSalary());
		System.out.println(emp3.totalSalary());
		System.out.println(emp4.totalSalary());

	}

}
