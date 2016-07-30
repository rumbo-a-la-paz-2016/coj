import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 24-07-16
public class LATIN2775 {

	public static boolean vowel(char c)
	{
	    return (c == 'a' || c == 'A' || 
	            c == 'e' || c == 'E' ||
	            c == 'i' || c == 'I' ||
	            c == 'o' || c == 'O' ||
	            c == 'u' || c == 'U' 
	            );
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			String cadena = in.next();
			System.out.println(vowel(cadena.charAt(0))?cadena+"cow":cadena.substring(1, cadena.length())+""+cadena.charAt(0)+"ow");
		}
	}

}
