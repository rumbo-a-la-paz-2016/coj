import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int cant = in.nextInt();
		String aux = "";
		int[] vector = new int[13];
		for (int i = 0; i < cant; i++)
		{
			String aux1 = in.next();
			String aux2 = in.next();
			aux = aux2.split("/")[1];
			for (int j = 0; j < 13; j++)
			{
				if (j == Integer.valueOf(aux))
				{
					vector[j]++;
				}
			}
		}
		for (int i = 1; i < 13; i++)
		{
			System.out.println(i + " " + vector[i]);
		}
	}
}