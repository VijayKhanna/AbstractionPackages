package AbstarctClases;
import java.util.Random;
abstract class compartment {
abstract public void notice();
}
class firstclass extends compartment
{
	public void notice()
	{
		System.out.println("Fisrt class Compartment");
	}
}
class ladies extends compartment
{
	public void notice()
	{
		System.out.println("Ladies Compartment");
	}
}
class general extends compartment
{
	public void notice()
	{
		System.out.println("general Compartment");
	}
}
class luggage extends compartment
{
	public void notice()
	{
		System.out.println("Luggage Compartment");
	}
}
public class S1
{
	public static void main(String args[])
	{
		compartment c[]=new compartment[10];
		Random rn=new Random();
		int num=0;
		for(int i=0;i<10;i++)
		{
			num=rn.nextInt(4);
			if(num==0)
				c[i]=new firstclass();
			else if(num==1)
				c[i]=new ladies();
			else if(num==2)
				c[i]=new general();
			else 
				c[i]=new luggage();
			
			c[i].notice();
			
				
		}
	}
}