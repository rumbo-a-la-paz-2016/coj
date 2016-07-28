import java.util.Scanner;


public class Montellanos2775 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String cad = sc.nextLine(), arr[], fin="";
		int s = Integer.parseInt(cad);
		while (s--!=0) {
			cad = sc.nextLine();
			arr = cad.split(" ");
			fin = "";
			for (String aux : arr) {
				if (aux.startsWith("a")||aux.startsWith("e")||aux.startsWith("i")||aux.startsWith("o")||aux.startsWith("u")) {
					fin += (aux+"cow "); 
				} else {
					fin += (aux.substring(1)+aux.substring(0,1) + "ow ");
				}
			}
			System.out.println(fin.trim());
			cad = "";
		}
	}

}
