package assignment5_3;//package name

public class Assignment5_3 {//class to test permanent and temporary emp class
	
	public static void main(String[] args){
		
		TemporaryEmp tEmp = new TemporaryEmp(1, "john", 10, 2000);//instantiating TempEmp
		//calling methods
		tEmp.avail_leave(3, 'c');
		tEmp.calculate_balance_leaves();
		tEmp.calculate_salary();
		
		PermanentEmp pEmp= new PermanentEmp(1, "Chai",20000 ,30, 10, 10, 10);//instantiating Perment Emp
		//calling methods
		pEmp.avail_leave(5, 'c');
		pEmp.calculate_balance_leaves();
		pEmp.calculate_salary();
		pEmp.print_leave_details();
		
		
	}

}
