package exceptioncases;
import java.util.*;
class Div
{
	int a,b;
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int getdiv()throws Exception
	{
		return a/b;
	}
}
public class throwsClause
{
	public static void main(String x[])
	{
		Div d=new Div();
		try
		{
			d.setvalue(10, 0);
			int result=d.getdiv();
			System.out.println("Division is:"+result);
		}
		catch(Exception ex)
		{
			System.out.println("Error is:"+ex);
		}
	}
}
