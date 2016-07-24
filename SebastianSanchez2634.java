import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String b;
		String c;
		String aux = "";
		int[] vec = new int[13];
		for (int i = 0; i < a; i++)
		{
			b = in.next();
			c = in.next();
			aux = c.split("/")[1];
			for (int j = 0; j < 13; j++)
			{
				if (j == Integer.valueOf(aux))
				{
					vec[j]++;
				}
			}
		}
		for (int i = 1; i < 13; i++)
		{
			System.out.println(i + " " + vec[i]);
		}
	}
}
