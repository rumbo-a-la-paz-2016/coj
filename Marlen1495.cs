using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Marlen1495
{
    class main
    {
        static void Main(string[] args)
        {
            int[] n = new int [int.Parse(Console.ReadLine())];
            for (int i = 0; i < n.Length; i++)
            {
                n[i] = int.Parse(Console.ReadLine());
            }
            Array.Sort(n);
            for (int i = 0; i < n.Length; i++)
            {
                Console.WriteLine(n[i]);
            }
            Console.ReadKey();
        }
    }
}