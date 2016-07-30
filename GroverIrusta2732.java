import java.util.Scanner;


//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 24-07-16
public class CocoBitsAndTheCocoStrings2732 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		String nuevaCadena="";
		String aux;
		while (casos-->0)
		{
			String cadena = in.next();
			for (int i = 0; i < cadena.length(); i++)
			{
				if (Character.isUpperCase(cadena.charAt(i)))
				{
					 aux= cadena.charAt(i)+"";
					 aux = aux.toLowerCase();
					 nuevaCadena += aux;
				}
					
				else
				{
					 aux= cadena.charAt(i)+"";
					 aux = aux.toUpperCase();
					 nuevaCadena += aux;
				}
			}
			System.out.println(nuevaCadena);
			nuevaCadena="";
		}

	}

}
