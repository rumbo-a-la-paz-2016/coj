import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 24-07-16
public class NaebbiracPhrases3375 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos=in.nextInt();
		int c=0;
		while (casos-->0)
		{
			c=0;
			String cadena1 = in.next();
			String cadena2 = in.next();
			for (int i = 0; i < cadena1.length(); i++)
			{
				if (cadena1.charAt(i)!= cadena2.charAt(i))
				{
					c++;
				}
			}
			System.out.println(c);
		}

	}

}
