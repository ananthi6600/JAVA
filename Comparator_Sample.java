import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
      private String name;
      private int age;
     private long number;
 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
public Employee(String name,int age,long number){
     this.name =name;
    this.age =age;
    this.number =number;
     
 }

}
class comparatorDemo implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge()-o2.getAge();
	}
	
}
public class Comparator_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Employee> A=new ArrayList<>();

	      Employee a=new Employee("praveena",22,778866554);
	      Employee a1=new Employee("kalai",21,998899779);
	      Employee a2=new Employee("Zero",25,77223344);
	      Employee a3=new Employee("ananthi",20,990044556);
	      A.add(a);
	      A.add(a1);
	      A.add(a2);
	      A.add(a3);
	        for (Object i: A) {
	            System.out.println(i.toString());
	        }
	       Collections.sort(A, new comparatorDemo());
	       for (Object i: A) {
	            System.out.println(i.toString());
	        }

	}

	@Override
	public java.lang.String toString() {
		return "comparator_Sample [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
