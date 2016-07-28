import java.util.Scanner;


public class Montellanos2374 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		long menor = Integer.parseInt(a.replace("6", "5"))+ Integer.parseInt(b.replace("6", "5"));
		long mayor = Integer.parseInt(a.replace("5", "6"))+ Integer.parseInt(b.replace("5", "6"));
		System.out.println(menor + " " + mayor);

		
	}

}
