import java.util.Scanner;


public class Montellanos3375 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), suma;
		String cad;
		char a[],b[];
		while (n--!=0) {
			cad = sc.next();
			a = cad.toCharArray();
			cad =sc.next();
			b = cad.toCharArray();
			suma = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					suma += 1;
				}
			}
			System.out.println(suma);
		}
	}

}
