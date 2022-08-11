
public class ByteSample {
	static int i;
	static byte b;
	static {
		i=10;
		b=18;
		System.out.println("Static block");
	}
	ByteSample()
	{
		System.out.println("constructor");
	}
	{
		i=10;
		b=59;
		System.out.println("Instance block");
	}
	public static void main(String[] args) {
		ByteSample bs=new ByteSample();
		System.out.println(bs.i);
		System.out.println(bs.b);
	}

}
