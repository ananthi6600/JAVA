package Interface_Inheritance;
/*
 * child extends parent
 */
public class Child_class extends Parent_class
{
public void play() {
	System.out.println("Playing");
	
}
public void read() {
	System.out.println("Reading");
}
	public static void main(String[] args) {
		Child_class c=new Child_class();
		c.play();
		c.read();
		c.work();
		c.watchTv();
		System.out.println(c.salary);  // access child methods & variables and also access parent class methods & variables
	}

}
