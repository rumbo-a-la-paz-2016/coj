import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 23-07-16

public class BrokenStrings1840 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		int b=0,r=0,o=0,k=0,e=0,n=0;
		while (casos-->0)
		{
			String cad = in.next();
			b=r=o=k=e=n=0;
			cad= cad.toUpperCase();
			for (int i = 0; i < cad.length(); i++)
			{
				if (cad.charAt(i)=='B')
					b++;
				else if (cad.charAt(i)=='R')
					r++;
				else if (cad.charAt(i)=='O')
					o++;
				else if (cad.charAt(i)=='K')
					k++;
				else if (cad.charAt(i)=='E')
					e++;
				else if (cad.charAt(i)=='N')
					n++;					
			}
			if (b == r && r == o && o == k && k == e && e == n) 
				System.out.println("No Secure");
			else
				System.out.println("Secure");
		}
		
	}

}
