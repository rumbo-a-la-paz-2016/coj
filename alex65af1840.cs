using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Acm_1840
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 0;
            x = int.Parse(Console.ReadLine());
            for (int i = 0; i < x; i++)
            {
                string cadena;
                cadena = Console.ReadLine();
                int b = 0;
                int r=0;
                int o = 0;
                int k = 0;
                int e = 0;
                int n = 0;
                int aux = 0;

                for (int j = 0; j < cadena.Length; j++)
                {
                    if (cadena[j] == 'B')
                    {
                        b = b + 1;
                    }
                    else if (cadena[j] == 'R')
                    {
                        r = r + 1;
                    }
                    else if (cadena[j] == 'O')
                    {
                        o++;
                    }
                    else if (cadena[j] == 'K')
                    {
                        k++;
                    }
                    else if (cadena[j] == 'E')
                    {
                        e++;
                    }
                    else if (cadena[j] == 'N')
                    {
                        n++;
                    }
                }
                aux = b;
                if (b == aux && r == aux && o== aux && k== aux && e== aux && n== aux)
                {
                    Console.WriteLine("No Secure");
                }
                else 
                {
                    Console.WriteLine("Secure");
                }
            }
            

            Console.ReadKey();
        }
    }
}
