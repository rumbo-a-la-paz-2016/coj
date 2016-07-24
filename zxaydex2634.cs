using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class main
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int i = 0;
            int[] v = new int[12];

            String date;
            while (n-- != 0)
            {
                date = Console.ReadLine();
                i = date.IndexOf('/');
                date = date.Remove(0, i+1);
                i = date.IndexOf('/');
                date = date.Remove(i);
                i = int.Parse(date);
                v[i - 1]++;
                

            }
            i = 0;
            while (i != 12)
            {
                Console.WriteLine(i+1+" "+v[i]);
                i++;
                
            }
            Console.ReadKey();
        }
            
    }
}
