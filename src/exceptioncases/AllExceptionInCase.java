package exceptioncases;
import java.util.*;
public class AllExceptionInCase
{	static int d[];
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1:Arithmetic Exception");
			System.out.println("2:Array Index Bound Exception");
			System.out.println("3:Null Pointer Exception");
			System.out.println("4:Number Format Exception");
			System.out.println("5:Input Mismatch Exception");
			System.out.println("6:Class Not Found Exception");
			System.out.println("7:class cast Exception");
			System.out.println("Enter the Choice");
			choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter two values");
					int a=xyz.nextInt();
					int b=xyz.nextInt();
					int c;
					try
					{
						c=a/b;
						System.out.println("Division is:"+c);
					}
					catch(Exception ex)
					{
						System.out.println("Error is:"+ex);
					}
					break;
				case 2:
					int arr[]=new int[] {10,20,30};
					try
					{
						System.out.println(arr[3]);
					}
					catch(Exception ex)
					{
						System.out.println("Error is:"+ex);
					}
					break;
				case 3:
					try
					{
						d[0]=100;
						System.out.println(d[0]);
					}
					catch(Exception ex)
					{
						System.out.println("Error is:"+ex);
					}
					break;
					
				case 4:
					try
					{
						String s="12345@";
						int aa=Integer.parseInt(s);
						System.out.println(aa);
					}
					catch(Exception ex)
					{
						System.out.println("Error is:"+ex);
					}
					break;
					
				case 5:
				      try
				      {
				    	  Scanner sc=new Scanner(System.in);// case madhun baher fekat ahe mhanun navin scanner class ghetla
				    	 System.out.println("Enter the numbers");
				    	 int num=sc.nextInt();
				    	 System.out.println("Square is:"+(num*num));
				    	 
				      }
				      catch(Exception ex)
				      {
				    	  System.out.println("Error is:"+ex);
				      }
					break;
				case 6:
					try
					{
						Class.forName("Shubham");
					}
					catch(Exception ex)
					{
						System.out.println("Error is:"+ex);
					}
					break;
				case 7:
					try {
					    Object obj = new Object();
					    String s = (String) obj; // This line will throw ClassCastException
					} catch(Exception ex) {
					    System.out.println("Error: " + ex);
					}
					break;
				default:
					System.out.println("Wrong choice");
			}
		}
		while(true);
	}
}
