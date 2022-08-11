package Interface_Inheritance;

public interface CEO {
	public default void work() {
		System.out.println("In USA");
	}
	public void display();
}
