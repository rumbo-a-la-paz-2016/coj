import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int n= entrada.nextInt();
	while (n>0) 
	{
		String a = entrada.next();
		char[] vectorCaracteres = new char[a.length()];
		vectorCaracteres= a.toCharArray();	
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		for (int i = 0; i < vectorCaracteres.length; i++) 
		{
			if (vectorCaracteres[i]=='B')
			{
				c1++;
			}
			if (vectorCaracteres[i]=='R')
			{
				c2++;
			}
			if (vectorCaracteres[i]=='O')
			{
				c3++;
			}
			if (vectorCaracteres[i]=='K')
			{
				c4++;
			}
			if (vectorCaracteres[i]=='E')
			{
				c5++;
			}
			if (vectorCaracteres[i]=='N')
			{
				c6++;
			}
			
			
		}
		
			if (c1==c2&&c2==c3&&c3==c4&&c4==c5&&c5==c6)
			{
				System.out.println("No Secure");
			}
		
		
		else {
			System.out.println("Secure");
		}
	
	 n --;	
	}
	}

}