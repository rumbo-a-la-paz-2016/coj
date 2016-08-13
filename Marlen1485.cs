using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Marlen1485
{
    class main
    {
        static void Main(string[] args)
        {
            string cadena = Console.ReadLine();
            char[] ar = cadena.ToArray();
            Array.Sort(ar);
            for (int i = 0; i < ar.Length; i++)
            {
                Console.Write(ar[i]);
            }
            Console.ReadKey();
        }
    }
}