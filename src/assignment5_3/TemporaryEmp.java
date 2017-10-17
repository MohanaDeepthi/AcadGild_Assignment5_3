package assignment5_3;//package name

class TemporaryEmp extends Employee{//class TemporaryEMP extends Employee
	
	public TemporaryEmp(int empId,String empName,int total_leaves,double total_salary){//Temporary emp constructor
		this.empId=empId;
		this.empName=empName;
		this.total_leaves=total_leaves;
		this.total_salary=total_salary;
	}
	
	void calculate_balance_leaves(){//method to calculate the total leaves
		System.out.println("Total balance leaves of Temp emp :"+total_leaves);
		
	}
	
	boolean avail_leave(int no_of_leaves, char type_of_leave){//method to calculate available leaves
		//Temp emp has casual value
		if(no_of_leaves<total_leaves&&type_of_leave=='c'){ 
			total_leaves-=no_of_leaves;
			System.out.println("Available leaves of Temp Emp "+total_leaves);
			return true;
		}
		else{//return false if no of leaves are more than total leaves
			System.out.println("Leaves are less for Temp employee or invalid leave");
			return false;
		}
		
	}
	
	void calculate_salary(){//method to calculate salary
		
		total_salary = total_salary + (.5 *total_salary)-(.12*total_salary);
		System.out.println("Total salary of Temporary employee "+this.empName+ "'s is :"+ total_salary);//printing salary
		
	}

}
