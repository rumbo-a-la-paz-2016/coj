using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1840ALAN
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            for (int i = 0; i <= N; i++) 
            {
                string m = Console.ReadLine();
                int b = 0, r = 0, o = 0, k = 0, e = 0, n = 0,  P = 0;
                for ( int u = 0; u < m.Length; u++)
                {
                    if (m[u]=='B')
                    {
                        b++;
                    }
                    else if (m[u]=='R')
                    {
                        r++;
                    }
                    else  if (m[u]=='O')
                    {
                        o++;
                    }
                    else if (m[u]=='K')
                    {
                        k++;
                    }
                    else if (m[u]=='E')
                    {
                        e++;
                    }
                    else if (m[u]=='N')
                    {
                        n++;
                    }
                    
                }
                P = b;
                if (b==P && r==P && o==P && k==P && e==P && n==P)
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
