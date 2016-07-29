using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _3375___Las_Frases_de_Naebbirac
{
    class Program
    {
        static void Main(string[] args)
        {
            string cadena;
            int num = 0;
            int rep = 0;
            int x = 0;
            num = int.Parse(Console.ReadLine());
            int[] vec = new int[num];
            for (int i = 0; i < num; i++)
            {
                cadena = Console.ReadLine();
                x = cadena.Length;
                x = x/2;
                rep = 0;
                for (int j = 0; j < x ; j++)
                {
                    if (cadena[j] != cadena[x + j +1]) 
                    {
                        rep = rep + 1;
                        
                    }
                    vec[i] = rep;
                }
            }
            for (int i = 0; i < num; i++)
            {
                Console.WriteLine(vec[i]);
            }
            Console.ReadKey();
        }
    }
}
