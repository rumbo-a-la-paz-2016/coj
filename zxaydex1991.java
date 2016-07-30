import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String game;
		int i = sc.nextInt(),j,k;
		short[] h;
		while (i>0)
		{
			h = new short[9];
			h[0]=sc.nextShort();
			game = sc.nextLine();
			game = sc.nextLine();
			j=0;
			while (j<38)
			{
				k = j+3;
				if (game.substring(j,k).equals("TTT"))
				{h[1]++;}
				if (game.substring(j,k).equals("TTH"))
				{h[2]++;}
				if (game.substring(j,k).equals("THT"))
				{h[3]++;}
				if (game.substring(j,k).equals("THH"))
				{h[4]++;}
				if (game.substring(j,k).equals("HTT"))
				{h[5]++;}
				if (game.substring(j,k).equals("HTH"))
				{h[6]++;}
				if (game.substring(j,k).equals("HHT"))
				{h[7]++;}
				if (game.substring(j,k).equals("HHH"))
				{h[8]++;}
				j++;
			}

			for (k = 0; k < h.length; k++) {
				System.out.print(h[k]);
				if (k!=h.length-1)
				{
					System.out.print(" ");
				}
			}
			if (i>1){System.out.println();}
			i--;
		}
		
	}

}
