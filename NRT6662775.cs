using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LATIN
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            string S;
            string  [] vec = new string [N];
            for (int i = 0; i < N; i++ )
            {
                S = Console.ReadLine();
                if (S[0] == 'a' || S[0] == 'e' || S[0] == 'i' || S[0] == 'o' || S[0] == 'u')
                {
                    S = S.Insert((S.Length), "cow");
                }
                else {
                    S = S.PadRight(S.Length + 1, S[0]).Remove(0, 1);
                    S = S.Insert(S.Length, "ow");
                }
                vec[i] = S;
            }
            for(int j = 0; j<N; j++)
            {
                Console.WriteLine(vec[j]);
            }
            Console.ReadKey();
        }
    }
}
