import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int b = 0;
			int r = 0;
			int o = 0;
			int k = 0;
			int e = 0;
			int n = 0;
		String cadena = in.next();
		for (int j = 0; j < cadena.length(); j++) {
			
			
			if (cadena.charAt(j)=='B') {
				b++;
			}
			if (cadena.charAt(j)=='R') {
				r++;
			}
			if (cadena.charAt(j)=='O') {
				o++;
			}
			if (cadena.charAt(j)=='K') {
				k++;
			}
			if (cadena.charAt(j)=='E') {
				e++;
			}
			if (cadena.charAt(j)=='N') {
				n++;
			}
			
		}
		if (b ==r && r==o && o==k && k==e && e==n) {
			System.out.println("No Secure");
		}
		else {
			System.out.println("Secure");
		}
		
		}

	}

}