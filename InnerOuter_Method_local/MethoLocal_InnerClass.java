package InnerOuter_Method_local;

public class MethoLocal_InnerClass
{
	public void outerMethod()
	{
		class Inner
		{
			public void innerMethod()
			{
				System.out.println("Inner class method");
			}
		}
		Inner in=new Inner(); // inside the method we can access inner class , outside the method we can't access
		in.innerMethod();
	}
	
	
		public static void main(String [] args) 
		{
			MethoLocal_InnerClass out=new MethoLocal_InnerClass();
			out.outerMethod();
			//new MethoLocal_InnerClass().new Inner().innerMethod(); ----> cannot access
		}
		
}
