using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Penney_Game
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            string S;
            int j=0;
            int [,] mat = new int [N, 9];
            for (int i = 1; i <=N; i++)
            {
                S = Console.ReadLine();
                S = Console.ReadLine();
                mat[i-1,0] = i;
                for (j = 0; j < 38; j++)
                {
                    if (S[j] == 'T')
                    {
                        if (S[j + 1] == 'T')
                        {
                            if (S[j + 2] == 'T')
                            {
                                mat[i - 1, 1] = mat[i - 1, 1] + 1;
                            }
                            else
                            {
                                mat[i - 1, 2] = mat[i - 1, 2] + 1;
                            }
                        }
                        else {
                            if (S[j + 2] == 'T')
                            {
                                mat[i - 1, 3] = mat[i - 1, 3] + 1;
                            }
                            else
                            {
                                mat[i - 1, 4] = mat[i - 1, 4] + 1;
                            }
                        }
                    }
                    else {
                        if (S[j + 1] == 'T')
                        {
                            if (S[j + 2] == 'T')
                            {
                                mat[i - 1, 5] = mat[i - 1, 5] + 1;
                            }
                            else
                            {
                                mat[i - 1, 6] = mat[i - 1, 6] + 1;
                            }
                        }
                        else
                        {
                            if (S[j + 2] == 'T')
                            {
                                mat[i - 1, 7] = mat[i - 1, 7] + 1;
                            }
                            else
                            {
                                mat[i - 1, 8] = mat[i - 1, 8] + 1;
                            }
                        }
                    }

                }
            }
            for (int i = 0; i < N; i++)
            {
                for (j = 0; j < 9; j++)
                {
                    Console.Write(mat[i,j]+" ");
                }
                Console.WriteLine();
            }
            Console.ReadKey();
        }
    }
}
