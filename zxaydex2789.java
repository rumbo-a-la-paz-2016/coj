import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String suma = sc.nextLine(),m;
		int []n = new int[3];
		int a=-1,b=0;
		while(b!=suma.length())
		{
			b=suma.indexOf('+',a+1);
			if (b==-1){b=suma.length();}
			m=suma.substring(a+1,b);
			if (m.equals("1")){n[0]++;}
			if (m.equals("2")){n[1]++;}
			if (m.equals("3")){n[2]++;}
			a=suma.indexOf('+',b);
		}
		int i=0,j=2*(n[0]+n[1]+n[2])-2;
		while (i<3)
		{
		while (n[i]>0)
		{
			if (j>0)
			{
			System.out.print(i+1+"+");
			}
			else
			{
			System.out.print(i+1);
			}
			n[i]--;
			j=j-2;
		}
		i++;
		}
	}

}
