import java.rmi.*;
class Clint
{
	public static void main(string args[])throws Exception
	{
		double x,y;
		x=50.4,y=60.3;
		try
		{
			sumaa a=(sumaa)Naming.lookup("");
			System.out.println("Addition="a.add(x,y));
		}
		catch(Exception)
		{
			
		}
	}	
}