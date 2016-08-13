import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n []= new int [in.nextInt()];
		int i;
		for (i = 0; i < n.length; i++) {
			n[i]= in.nextInt();
			}
		Arrays.sort(n);
		for (int j = -1; j < n.length-1; j++) {
			if (j==-1) {
				System.out.print(n[i-1]+" ");
			}else {
				if ((j+1)==n.length+1) {
					System.out.print(n[j]);	
				}else {
					System.out.print(n[j]+" ");
				}
				
			}
		}
	}

}
