package Interface_Inheritance;
/*
 * 
 * what is inheritance
 *     An object of one class behaving as an object of another class
 * when use ?
 * 		IS_A relationShip
 * how?
 * 		By using Extends in keyword
 * why?
 * 		Efficiency memory management 
 * 
 */
public class Parent_class {
	public int salary=10000;
	public void work() {
		System.out.println("Working");
	}
	public void watchTv() {
		System.out.println("Watching tv");
	}
	
	public static void main(String[] args) {
		Parent_class p=new Parent_class();
		p.work();
		p.watchTv();
			
	}

}
