import java.util.Scanner;


public class Montellanos1840 {
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt(), pivot[] = new int[6];
		String cad= "", aux="";
		while (n--!=0) {
			cad = sc.next().toUpperCase();
			pivot = new int[6];
			while (cad.length()!=0) {
				aux = cad.substring(0, 1);
				if (aux.equals("B")) {
					pivot[0] += 1;
				} else {
					if (aux.equals("R")) {
						pivot[1] += 1;
					} else {
						if (aux.equals("O")) {
							pivot[2] += 1;
						} else {
							if (aux.equals("K")) {
								pivot[3] += 1;
							} else {
								if (aux.equals("E")) {
									pivot[4] += 1;
								} else {
									if (aux.equals("N")) {
										pivot[5] += 1;
									} 
								}
							}
						}
					}
				}
				cad = cad.substring(1);
			}

			if (pivot[0] == pivot[1] && pivot[1] == pivot[2] && pivot[2] == pivot[3] &&
					pivot[3] == pivot[4] && pivot[4] == pivot[5]) {
				System.out.println("No Secure");
			} else {
				System.out.println("Secure");
			}
		}
	}

	


}
