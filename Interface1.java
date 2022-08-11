//import java.util.HashSet;
import java.util.LinkedHashSet;

interface Parent
 {
 	public void print();
 	void anau();
 	
 	
 }
 interface vani
 {
 	void van();
 }
 class Child implements Parent , vani
 {
 	public void print()
 	{
 		System.out.println("child");
 	}
 	public void anau()
 	{
 		System.out.println("zsdf");
 	}
 	public void van()
 	{
 		System.out.println("van");
 	}
 }
//  abstract class Kalai implements Parent
// {
// 	public void print()
// 	{
// 		System.out.println("kalai");
// 	}
// }
public class Interface1 {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.print();
		c.van();
		Parent p= new Parent() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void anau() {
				// TODO Auto-generated method stub
				
			}
		};
		p.anau();
		LinkedHashSet<Object> h = new LinkedHashSet<>();
        h.add("String");
        h.add(97);
        h.add(1);
        h.add(41);
        h.add(6);
        h.add(97);// duplicates not allowed
        System.out.println(h);
	}

}
