import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while (num>0)
		{
			int b =0;
			int r =0;
			int o =0;
			int k =0;
			int e =0;
			int n =0;
			String pass = in.next();
			char[] v = new char[pass.length()];
			v = pass.toCharArray();
			for (int i = 0; i < v.length; i++)
			{
				if(v[i]== 'B')
				{
					b++;
				}
				else if(v[i]== 'R')
				{
					r++;
				}
				else if(v[i]== 'O')
				{
					o++;
				}
				else if(v[i]== 'K')
				{
					k++;
				}
				else if(v[i]== 'E')
				{
					e++;
				}
				else if(v[i]== 'N')
				{
					n++;
				}
			}
			if	(b == r && b == o && b == k && b == e && b == n)
			{
				System.out.println("No Secure");
			}
			else
			{
				System.out.println("Secure");
			}
			num--;
		}
	}
}