using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2789Sum_Order
{
    class main
    {
        static void Main(string[] args)
        {
            string cad = "";
            int aux = 0, j = 0;
            Char split = '+';
            cad = Console.ReadLine();
            string[] vector = cad.Split(split);
            if (vector.Length<=1000)
            {
                for (int i = 0; i < vector.Length; i++)
                {
                    aux = int.Parse(vector[i]);
                    j = i - 1;
                    while (j >= 0 && int.Parse(vector[j]) > aux)
                    {
                        vector[j + 1] = vector[j];
                        j--;
                    }
                    vector[j + 1] = aux.ToString();
                    cad = "";
                }
                for (int i = 0; i < vector.Length; i++)
                {
                    if ((i + 1) == vector.Length)
                    {
                        cad = cad + vector[i];
                    }
                    else
                    {
                        cad = cad + vector[i] + "+";
                    }
                }
                Console.WriteLine(cad);
                Console.ReadKey();
            }
        }
    }
}