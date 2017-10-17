package assignment5_3;//package name

class PermanentEmp extends Employee{//Class Permanentemp extends Employee
	
	int paid_leave, sick_leave, casual_leave;//declaring pad,sick and casual leave variables
	double basic, hra,pfa;//declaring basic,hra,pfa variables
	//permanent employee constructor
	public PermanentEmp(int empId,String empName,double basic,int total_leaves,int paid_leave,int sick_leave,int casual_leave){
		this.empId=empId;
		this.empName=empName;
		this.total_leaves=total_leaves;
		this.basic=basic;
		//assigning values to paid_leave,sick_leave,casual_leave
		this.paid_leave=paid_leave;
		this.casual_leave=casual_leave;
		this.sick_leave=sick_leave;
	}
	
	public void print_leave_details(){//printing leave details
		System.out.println("Permanent Emp Leave Details are paid leaves :"+paid_leave+" sick leaves :"+sick_leave+" casual leaves :"+casual_leave);
		
	}
	void calculate_balance_leaves(){//method for calculating balance leaves
		System.out.println("Total balance leaves of Permanent Employee are  :"+(paid_leave+sick_leave+casual_leave));
		
		
	}

	
	boolean avail_leave(int no_of_leaves,char type_of_leave){
		//paid leave
			if(type_of_leave=='p'){//for leave type paid leave
				if(paid_leave>no_of_leaves){//if leaves are available
					paid_leave=paid_leave-no_of_leaves;
					total_leaves=total_leaves-no_of_leaves;//calculate total leaves
					return true;//returns true
					
				}
				else{
					System.out.println("Leave balance is less for Permanent Emp");
					return false;//returns false
				}
			}
			else if(type_of_leave=='c'){//for leave type casual leave
				if(casual_leave>no_of_leaves){//if leaves are available
					casual_leave=casual_leave-no_of_leaves;
					total_leaves=total_leaves-no_of_leaves;//calculate total leaves
					return true;
				}
				
				else{
					System.out.println("casual Leave balance is less for Permanent Emp");
					return false;
				}
							
			}
			else if(type_of_leave=='s'){//for the leave type sick leave
				if(sick_leave>no_of_leaves){//if leaves are available
					sick_leave=sick_leave-no_of_leaves;
					total_leaves=total_leaves-no_of_leaves;//calculate total leaves
					return true;
					
				}
				else{
					System.out.println("Leave balance is less for Permanent Emp");
					return false;
				}
				
			}
		
			System.out.println("Leave balance is less");
			return false;
			
			
			
		}
		


	
	void calculate_salary(){//method to calculate salary
		pfa = .12*basic;//calculating pf
		hra = .5 *basic;//calculating hra
		total_salary = basic + hra-pfa;//calculating total salary
		System.out.println("Total salary of permanent employee "+this.empName+ "'s is :"+ total_salary);//printing total salary
	}
	
}
