import java.util.Scanner;

//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 24-07-16

public class PenneyGame1991 {

	static char[] T, P; 
	  static int n, m;
	  static int [] b; 


//algormitmo KMP
	  static void kmpPreprocess() 
	  { 
	    int i = 0, j = -1; b[0] = -1;
	    while (i < m) 
	    { 
	      while (j >= 0 && P[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      b[i] = j; 
	  }
	   }       

	  static int kmpSearch() 
	  {
	    int i = 0, j = 0,cont=0; 
	    while (i < n) { 
	      while (j >= 0 && T[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      if (j == m) { 
	        
	    	  cont++;
	        j = b[j]; 
	      }
	      }
	    return cont;
	    }
//	FIN
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[]secuencias ={"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT" , "HHH"};
		int [] vector;
		int casos = in.nextInt();
		int contador=0;
		while (casos-->0)
		{
			vector= new int[8];
			int num = in.nextInt();
			String cad1 = in.next();
			
			for (int i = 0; i < vector.length; i++)
			{
				String cad2 = secuencias[i];
				T  = cad1.toCharArray();
				P  = cad2.toCharArray();
			    n = T.length;
			    m = P.length;
			    b = new int[400001];
	
			    kmpPreprocess();
				contador = kmpSearch();
				vector[i]= contador;
			}
			System.out.print(num+" ");
			for (int i = 0; i < vector.length; i++) 
			{
				if (i+1==vector.length)
					System.out.print(vector[i]);
				else
				System.out.print(vector[i]+" ");	
			}
System.out.println();

		}
		

	}

}
 
