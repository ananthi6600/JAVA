import java.util.Scanner;

class DynamicArrray {
	static final int initialCapacity = 8;
	int[] array;
	int size;
	int capacity;

	public DynamicArrray() {
		size = 0;
		array = new int[initialCapacity];
		capacity = initialCapacity;
	}

	public void expandArray() {
		capacity *= 2;
		array = java.util.Arrays.copyOf(array, capacity);
	}

	public void add(int addindElement) {
		if (size == capacity) {
			expandArray();

		}
		array[size++] = addindElement;

	}

	public void addSpecifiedIndex(int position, int data) {
		if (size == capacity) {
			expandArray();
		}
		System.out.println("Enter position 1 to " + (size - 1));
		if (position > 0 && position < size) {
			for (int i = size - 1; i >= position - 1; i--) {
				array[i + 1] = array[i];
			}
			array[position - 1] = data;
			size++;
		}
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public void deleteSpecifiesIndex(int deletePosition) {
		if (size > 0) {
			for (int i = deletePosition; i < size; i++) {
				array[i] = array[i + 1];
			}
		} else {
			System.out.println("Sorry Array is an empty");
		}
	}

}

public class ArrayIMplementation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		DynamicArrray list = new DynamicArrray();
		System.out.println("Enter your choice\n");
		System.out.println("1.Insert\n2.Display\n3.Specified Index\n4.Delete specified\n5.Exit");
		
		int choice = sc.nextInt();
		while (true) {
			
			switch (choice) {
			case 1:
				System.out.println("Enter data");
				int addindElement = sc.nextInt();
				list.add(addindElement);
				break;
			case 2:
				System.out.println("all elements");
				list.display();
				break;
			case 3:
				System.out.println("Enter position and data");
				int position = sc.nextInt(), data = sc.nextInt();
				list.addSpecifiedIndex(position, data);
				break;
			case 4:
				System.out.println("ENTER POSITION");
				int deletePosition = sc.nextInt();
				list.deleteSpecifiesIndex(deletePosition);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong chioce");

			}
			System.out.println();
			System.out.println("Enter your choice\n");
			System.out.println("1.Insert\n2.Display\n3.Specified Index\n4.Delete specified\n5.Exit");
			choice = sc.nextInt();

		}

	}
}
