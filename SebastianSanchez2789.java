
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String aux = "";
		int[] num = new int[(a.length() / 2) + 1];
		int x = 0;
		for (int i = 0; i < a.length(); i = i + 2)
		{
			num[x] = Integer.valueOf(String.valueOf(a.charAt(i)));
			x++;
		}
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++)
		{
			aux += String.valueOf(num[i]);
			if (i != num.length - 1)
			{
				aux += "+";
			}
		}
		System.out.println(aux);
	}
}
