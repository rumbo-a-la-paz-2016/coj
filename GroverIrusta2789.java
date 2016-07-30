import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 24-07-16

public class sumOrder2789 {

	public static void main(String[] args) 
	{
		Scanner in = new  Scanner(System.in);
		String cad =in.next();
		StringTokenizer tokens = new StringTokenizer(cad,"+");
		int i=0;
		int num []=new int [tokens.countTokens()];
		while(tokens.hasMoreTokens())
		{
			num[i] = Integer.parseInt(tokens.nextToken());
			i++;
		}

		Arrays.sort(num);
		for ( i = 0; i < num.length; i++) {
			if (i+1==num.length)
			{
				System.out.print(num[i]);
			}
			else
				System.out.print(num[i]+"+");
		}
		System.out.println();

	}

}
