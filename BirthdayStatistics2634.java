import java.util.Scanner;
import java.util.Vector;
//Author: Grover Irusta
//University: Universidad Privada Domingo Savio - Tarija
//Date: 23-07-16

public class BirthdayStatistics2634{

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int casos = in.nextInt();
	int []v = new int[12];	
	int uno = 0,dos = 0,tres = 0,cuatro=0,cinco=0,seis=0,siete=0,ocho=0,nueve=0,diez=0,once=0,doce=0;
	while (casos-->0)
	{
		int n = in.nextInt();
		String cad= in.next();
		String vector[] = cad.split("/");
		if (Integer.parseInt(vector[1])==1)
		{
			uno++;
			v[0]= uno;
		}
		
		else if (Integer.parseInt(vector[1])==2)
		{
			dos++;
				v[1]=dos;
		}
		else if (Integer.parseInt(vector[1])==3)
		{
			tres++;
			v[2]=tres;
		}
		
		else if (Integer.parseInt(vector[1])==4)
		{
			cuatro++;
			v[3]=	cuatro;
		}
				
		else if (Integer.parseInt(vector[1])==5)
		{
			cinco++;
					v[4]=	cinco;
		}
				
		else if (Integer.parseInt(vector[1])==6)
		{
			seis++;
			v[5]=		seis;
		}
							
		else if (Integer.parseInt(vector[1])==7)
		{
			siete++;
					v[6]=		siete;
		}
						
		else if (Integer.parseInt(vector[1])==8)
		{
			ocho++;
			v[7]=			ocho;
		}
									
		else if (Integer.parseInt(vector[1])==9)
		{
			nueve++;
			v[8]=			nueve;
		}
							
		else if (Integer.parseInt(vector[1])==10)
		{
			diez++;
			v[9]=			diez;
		}
										
		else if (Integer.parseInt(vector[1])==11)
		{
			once++;
			v[10]=			once;
		}
		else if (Integer.parseInt(vector[1])==12)
		{	doce++;
			v[11]=	doce	;
		}
	}
	for (int i = 0; i < v.length; i++) 
		System.out.println((i+1)+" "+ v[i]);

	}

}
