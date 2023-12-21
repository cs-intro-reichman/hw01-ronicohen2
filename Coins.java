public class Coins
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int qua, cen;
		qua = x/25;
		cen = x%25;
		System.out.println("Use " + qua + " quarters and " + cen + " cents ");
	}
}