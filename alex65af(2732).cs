using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2732___Coco_Bits
{
    class Program
    {
        static void Main(string[] args)
        {
            string cadena;
            int n = 0;
            n = int.Parse(Console.ReadLine());
            char x;
            string cad;
            string[] vec = new string[n];
            for (int i = 0; i <n; i++)
            {
                cadena = Console.ReadLine();
                vec[i] = cadena;
            }
            for (int i = 0; i < n; i++)
			{
                for (int j = 0; j < vec[i].Length; j++)
                {

                    x = vec[i][j];
                    cad = x.ToString();
                    if (char.IsLower(x))
                    {
                        Console.Write(cad.ToUpper());
                    }
                    else
                    {
                        Console.Write(cad.ToLower());
                    }
                    
                }
                Console.WriteLine();
            }
            
            Console.ReadKey();
        }
    }
}
