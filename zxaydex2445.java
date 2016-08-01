import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int [] comido = new int[s.length()];
	int i=-1,j;
	while(i++<s.length())
	{
		j=i;
		while (j++<s.length()-1)
		{
			if (Character.isUpperCase(s.charAt(i))&&Character.isLowerCase(s.charAt(j)))
			{
				comido[i]++;
			}
			else
			{
				if ((Character.isUpperCase(s.charAt(i))&&Character.isUpperCase(s.charAt(j)))||
						(Character.isLowerCase(s.charAt(i))&&Character.isLowerCase(s.charAt(j))))
				{
					if (s.charAt(i)>s.charAt(j))
					{
						comido[i]++;
					}
					else 
					{
						j=s.length();
					}
				}
				else
				{
					j=s.length();
				}
			}
		}
	}
	i=0;j=0;
	int mayor=comido[i];
	while(i++<s.length()-1)
	{
		if (mayor<comido[i])
		{
			mayor = comido[i];
			j=i;
		}
		if (mayor==comido[i])
		{
			if (s.charAt(j)<s.charAt(i))
			{
				j=i;
			}
		}
	}
	System.out.println(s.charAt(j));
	}

}