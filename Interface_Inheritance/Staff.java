package Interface_Inheritance;

public class Staff implements CEO
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s=new Staff();
		s.work();
		s.display();

	}
	public  void work() {
		System.out.println("In Chennai");
	}
	
	@Override
	public void display() {
		System.out.println("Display in CEO");
		
	}
	
}
