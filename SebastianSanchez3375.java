import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String pal1;
		String pal2;
		int cont = 0;
		for (int i = 0; i < num; i++)
		{
			pal1 = in.next();
			pal2 = in.next();
			cont = 0;
			for (int j = 0; j < pal1.length(); j++)
			{
				if (pal1.charAt(j) != pal2.charAt(j))
				{
					cont++;
				}
			}
			System.out.println(cont);
		}	
	}
}
