package Interface_Inheritance;



/*
 * 
 * interface
 *    set of rules or contract
 * class: template
 * 
 * 
 * complete rules followed by new employees -> this is known as interface
 * 40 hours
 * monday-friday
 * relocation
 * report
 * documents
 * dress code
 * 
 * by default methods are abstract
 * 
 * this is not parent child class relationShip , it is HAS-A relationship 
 * IS-A relationShip-->parent child class
 * HAS-A relationship--->interface class
 * zohoEmployee has EmployeeRules
 * interface is not a class
 * 
 */

public class zohoEmployee implements EmployeeRules,FamilyRules
{

	public static void main(String[] args) {
		zohoEmployee z=new zohoEmployee();
		z.maintainHours();
		z.report();
		System.out.println(z.salary);
		System.out.println(z.leaves);
		z.eatTogether();
		z.helpMembers();
		z.TakecareParents();
//		z.salary=50000; //--->we cannot change child class fields(variables) , these are by default final and static variables
//		z.leaves=25;
		//The final field EmployeeRules.salary cannot be assigned
		//The final field EmployeeRules.leaves cannot be assigned
		System.out.println(EmployeeRules.salary);//access variable using interface
		System.out.println(EmployeeRules.leaves);
		System.out.println(zohoEmployee.salary);// access variable using implemented class(zohoEmployee)
		System.out.println(zohoEmployee.leaves);
	
		
		
		FamilyRules father=new zohoEmployee();// only access familyrules methods -->dynamic binding
		//FamilyRules father2=new FamilyRules();
		
		father.eatTogether();
		father.helpMembers();
		father.dress();
		// access employeeRules method by using familyRules object
		//father.report();  ----> The method report() is undefined for the type FamilyRules
		
	
		EmployeeRules employee=new zohoEmployee();
		employee.dress();
	}
	

	public void maintainHours() {
		// TODO Auto-generated method stub
		System.out.println("24 hours");
		
	}

	public void relocate() {
		// TODO Auto-generated method stub
		System.out.println("To other City");
		
	}

	public void report() {
		// TODO Auto-generated method stub
		System.out.println("Complaint");
		
	}

	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("Neat dress");
	}
	public void TakecareParents() {
	System.out.println("I am take care my friends");	
	}
	public void helpMembers() {
		System.out.println("helping to family members");	
	}
	public void eatTogether(Object f) {
		System.out.println(f.hashCode());
		System.out.println("we are eating together");	
	}
	public void enjoy() {
		System.out.println("");	
	}

	@Override
	public void eatTogether() {
		// TODO Auto-generated method stub
		
	}

}
