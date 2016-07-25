import java.util.Arrays;
import java.util.Scanner;


public class Montellanos2789 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String cad = sc.next().replace("+", "");
		char arr[] = cad.toCharArray();
		Arrays.sort(arr);
		String fin = "";
		for (char s : arr) {
			fin += s + "+";
		}
		System.out.println(fin.subSequence(0, fin.length()-1));
	}

}
