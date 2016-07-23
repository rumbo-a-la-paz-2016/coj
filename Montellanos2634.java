import java.util.Scanner;


public class Montellanos2634 {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), x = 0;
		int mes[] = new int [12];
		String cad = "";
		while (n--!=0) {
			cad = sc.next();
			cad = sc.next();
			x = Integer.parseInt(cad.split("/")[1]);
			mes[x-1] +=1; 
			
		}
		int meses = 1;
		for (int i : mes) {
			System.out.println(meses  + " " + i);
			meses += 1;
		}
	}

}
