package exceptioncases;
import java.util.*;
class VotingException extends ArithmeticException
{
	public String getvoterError()
	{
		return "Voter is Not eligible";
	}
}
class voter
{
	void verifyVoter(int age)
	{
		if(age<18)
		{
			VotingException ve=new VotingException();
			throw ve;
		}
		else
		{
			System.out.println("Voter is eligible for voting");
		}
	}
}
public class UserDefineExceptionForVotingApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		try
		{
			voter v=new voter();
			v.verifyVoter(15);
		}
		catch(VotingException ve)
		{
			System.out.println(ve.getvoterError());
		}
	}
}
