using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication5
{
    class Program
    {
        static void Main(string[] args)
        {
            short n = short.Parse(Console.ReadLine()),a;
            string cs;
            while (n>0)
            {
                cs = Console.ReadLine();
                a = 0;
                while (a < cs.Length)
                {
                    if (char.ToLower(cs[a])==cs[a])
                    { Console.Write(char.ToUpper(cs[a])); }
                    if(char.ToUpper(cs[a]) == cs[a])
                    { Console.Write(char.ToLower(cs[a])); }
                    a++;
                }
                if (n > 1)
                { Console.WriteLine(); }
                n--;
            }
            Console.ReadKey();
        }
    }
}