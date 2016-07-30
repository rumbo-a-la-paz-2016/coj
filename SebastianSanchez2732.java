import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String a;
		String b;
		String c;
		for (int j = 0; j < num; j++)
		{
			a = in.next();
			b = "";
			c = "";
			for (int i = 0; i < a.length(); i++)
			{
				if (Character.isLowerCase(a.charAt(i)))
				{
					b = String.valueOf(a.charAt(i));
					b = b.toUpperCase();
				}
				else
				{
					b = String.valueOf(a.charAt(i));
					b = b.toLowerCase();
				}
				c+= b;
			}
			System.out.println(c);
		}
	}
}
