import java.util.Scanner;


public class Montellanos2732 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String cad = "", fin="", aux;
		int n = sc.nextInt();
		char arr[];
		while (n--!=0) {
			cad = sc.next();
			fin="";
			arr = cad.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				aux = String.valueOf(arr[i]);
				if (aux.equals(aux.toUpperCase())) {
					fin += aux.toLowerCase();
				} else {
					fin += aux.toUpperCase();
				}
			}
			System.out.println(fin);
			
		}
		
		
	}

}
