public class Gen3
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = b;
		for (int i=1; i<=3; i++)
		{
			int num1 = (int)((Math.random()*(a-b+1))+b);
			System.out.println(num1);
			min = Math.min(num1,min);
		}
		 System.out.println("The minimal generates numbar was " + min);

	}
}
