using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sum_order
{
    class Program
    {
        static void Main(string[] args)
        {
            string S = Console.ReadLine();
            int N = 0;
            int[] vec = new int[3];
            for(int i = 0; i<S.Length; i = i+2)
            { 
                N = (int) (S[i]-48);
                vec[N - 1] = vec[N - 1] + 1;
            }

            for (int i = 0; i < vec[0]; i++)
            {
                if (i == vec[0] - 1 && vec[1] == 0 && vec[2] == 0)
                {
                    Console.Write(1);
                    break;
                }
                Console.Write(1+"+");
            }
            for (int i = 0; i < vec[1]; i++)
            {
                if (i == vec[1] - 1 && vec[2] == 0)
                {
                    Console.Write(2);
                    break;
                }
                Console.Write(2 + "+");
                
            }
            for (int i = 0; i < vec[2]; i++)
            {
                if (i == vec[2] - 1)
                {
                    Console.Write(3);
                    break;
                }
                Console.Write(3 + "+");
            }
            Console.ReadKey();
        }
    }
}
