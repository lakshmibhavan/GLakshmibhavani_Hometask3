
public class Calculator {
	public static int Add(Integer n1,Integer n2)
	{
		return n1+n2;
	}
	public static int sub(Integer n1,Integer n2)
	{
		return n1-n2;
	}
	public static int mul(Integer n1,Integer n2)
	{
		return n1*n2;
	}
	public static double div(double n1,double n2)
	{
		if(n2==0)
		{
			throw new IllegalArgumentException("Number cannot be divide by zero");
		}
		return n1/n2;
	}
	
}
