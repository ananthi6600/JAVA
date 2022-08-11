package InnerOuter_Method_local;

public class AccessStaticOuterClass
{
	int nonStaticVariable=10;
	int staticVariable=100;
	public  void outerMethod() 
	{
		class Inner
		{
			int innerNonStaticVariable=22;
			int innerStatic=77;
				public  void innerMethod() 
				{    // in this case we can access outer class members but, instead of we declare method to static then the method only access outer class static members
					System.out.println(nonStaticVariable);
					System.out.println(staticVariable);
					System.out.println(innerNonStaticVariable);
					System.out.println( innerStatic);
			}
		}
		Inner i=new Inner();
		i.innerMethod();
	}

	public static void main(String[] args) 
	{
		AccessStaticOuterClass out=new AccessStaticOuterClass();
		out.outerMethod();

	}

}
