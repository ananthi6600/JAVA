
public class Anonymous_class {
	public static void main(String[] args) {
		Demo1 d=new Demo1() {
			public void run() {
				System.out.println("Running");
			}

			@Override
			public void walk() {
				System.out.println("Walking");
				
			}
			
		};
		d.run();
		d.walk();
		
	}
}
