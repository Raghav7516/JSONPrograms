package org.rise.sun;

public class Employee {
	private int empId;
	private String empName;
	private double sal;
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal="
				+ sal + "]";
	}
	

}
