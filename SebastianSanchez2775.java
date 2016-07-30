import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean val;
		String a;
		String b;
		while (n-->0)
		{
			val = false;
			a = in.next();
			b = "";
			if (a.charAt(0) == 'a' || a.charAt(0) == 'e' ||a.charAt(0) == 'i' ||a.charAt(0) == 'o' ||a.charAt(0) == 'u' || a.charAt(0) == 'A' ||a.charAt(0) == 'E' ||a.charAt(0) == 'I' ||a.charAt(0) == 'O' ||a.charAt(0) == 'I')
			{
				val = true;
			}
			if (val == true)
			{
				System.out.println(a + "cow");
			}
			else
			{
				for (int i = 1; i < a.length(); i++)
				{
					b = b + a.charAt(i);
				}
				b = b + a.charAt(0);
				System.out.println(b + "ow");			
			}
		}
	}
}
