using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2775___LATIN
{
    class Program
    {
        static void Main(string[] args)
        {
            string latin;
            int n = 0;
            n = int.Parse(Console.ReadLine());
            string[] vec = new string[n];
            char c;
            int lim = 0;
            for (int i = 0; i < n; i++)
            {
                latin = Console.ReadLine();
                vec[i] = latin;
            }
            for (int i = 0; i < n; i++)
            {
                if (vec[i][0] == 'a' || vec[i][0] == 'e' || vec[i][0] == 'i' || vec[i][0] == 'o' || vec[i][0] == 'u' || vec[i][0] == 'A' || vec[i][0] == 'E' || vec[i][0] == 'I' || vec[i][0] == 'O' || vec[i][0] == 'U')
                {
                    Console.WriteLine(vec[i]+"cow");
                }
                else
                {
                    c = vec[i][0];
                    lim = vec[i].Length - 1;
                    Console.WriteLine(vec[i].Substring(1,lim) + c + "ow");
                }
            }

           
            
            Console.ReadLine();
        }
    }
}
