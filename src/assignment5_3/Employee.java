package assignment5_3;//package name

abstract class Employee {//Employee class
	
	int empId;//emp id attribute
	String empName;//emp name attribute
	int total_leaves;//total leaves attribute
	double total_salary;//total salary attribute
	
	abstract void calculate_balance_leaves();//calculating balance leaves abstract method
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);//available leaves abstract method
	abstract void calculate_salary();//calculating salary abstract method
	
}
