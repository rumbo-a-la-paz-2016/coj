import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		short t;
		int pos,c;
		t = sc.nextShort();
		frase = sc.nextLine();
		while (t>0)
		{
			frase = sc.nextLine();
			pos = frase.length()/2+1;
			c=0;
			while(pos < frase.length())
			{
				if(frase.charAt(pos)!=frase.charAt(pos-frase.length()/2-1)){c++;}
				pos++;
			}
			System.out.println(c);
			t--;
		}
		
	}

}
