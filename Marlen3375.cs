using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LasFrasesdeNaebbirac3375
{
    class main
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine()), cont = 0;
            string[] vector; string cadena;
            Char sep = ' ';
            for (int i = 0; i < n; i++)
            {
                cadena = Console.ReadLine();
                vector = cadena.Split(sep);
                if (vector.Length == 2)
                {
                    for (int j = 0; j < vector[0].Length; j++)
                    {
                        for (int k = 0; k < vector[1].Length; k++)
                        {
                            if (j == k &&(vector[0][j] != vector[1][k]))
                            {
                                cont++;
                            }
                        }
                    }
                }
                Console.WriteLine(cont);
                cont = 0;
            }
            Console.ReadKey();
        }
    }
}