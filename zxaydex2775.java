import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short n = sc.nextShort();
		String lb;
		lb = sc.nextLine();
		while(n>0)
		{
			lb = sc.nextLine();
			if (lb.charAt(0)=='a'||lb.charAt(0)=='e'||lb.charAt(0)=='i'||lb.charAt(0)=='o'||lb.charAt(0)=='u')
			{System.out.println(lb+"cow");}
			else
			{System.out.println(lb.substring(1)+lb.charAt(0)+"ow");}
			n--;
		}
		
	}

}
