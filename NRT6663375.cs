using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Phrases
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            string S;
            int j =0;
            int X = 0;
            int[] vec = new int[N];
            for (int i = 0; i < N; i++)
            {
                S = Console.ReadLine();
                for(j =0; j<S.Length/2; j++)
                {
                    if(S[j]!=S[(S.Length/2)+j+1])
                    {
                        X = X + 1;  
                    }
                }
                vec[i] = X;
                X = 0;
            }
            for (j = 0; j < N; j++)
            {
                Console.WriteLine(vec[j]);
            }
                Console.ReadKey();
        }
    }
}
