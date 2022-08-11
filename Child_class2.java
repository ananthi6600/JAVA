import Interface_Inheritance.Parent_class;

/*
 * 
 * access another package class , we need to import parent class package
 * access variables , we need to give public modifiers to parent class variables
 */
public class Child_class2 extends Parent_class{

		public void play() {
			System.out.println("Playing");
			
		}
		public void read() {
			System.out.println("Reading");
		}
			public static void main(String[] args) {
				Child_class2 c=new Child_class2();
				c.play();
				c.read();
				c.work();
				c.watchTv();
				System.out.println(c.salary); //The field Parent_class.salary is not visible, so we puy public access modifier to parent class
			}

	}


