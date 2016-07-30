using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _1991___Penney_Game
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 0;
            string cadena;
            int TTT = 0;
            int TTH = 0;
            int THT = 0;
            int THH = 0;
            int HTT = 0;
            int HTH = 0;
            int HHT = 0;
            int HHH = 0;
            n = int.Parse(Console.ReadLine());
            int p = 0;
            string[] vec = new string[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
            {
                p = int.Parse(Console.ReadLine());
                v[i] = p;
                cadena = Console.ReadLine();
                vec[i] = cadena;
            }
            for (int i = 0; i < n; i++)
            {
                TTT = 0;
                TTH = 0;
                THT = 0;
                THH = 0;
                HTT = 0;
                HTH = 0;
                HHT = 0;
                HHH = 0;
                for (int j = 0; j < 38; j++)
                {

                    if (vec[i][j] == 'T')
                    {
                        if (vec[i][j + 1] == 'T')
                        {
                            if (vec[i][j + 2] == 'T')
                            {
                                TTT++;
                            }
                            else
                            {
                                TTH++;
                            }
                        }
                        else
                        {
                            if (vec[i][j + 2] == 'T')
                            {
                                THT++;
                            }
                            else
                            {
                                THH++;
                            }
                        }
                    }
                    else
                    {
                        if (vec[i][j + 1] == 'T')
                        {
                            if (vec[i][j + 2] == 'T')
                            {
                                HTT++;
                            }
                            else
                            {
                                HTH++;
                            }
                        }
                        else
                        {
                            if (vec[i][j + 2] == 'T')
                            {
                                HHT++;
                            }
                            else
                            {
                                HHH++;
                            }
                        }
                    }
                }
                Console.Write(v[i]);
                Console.WriteLine(" " + TTT + " " + TTH + " " + THT + " " + THH + " " + HTT + " " + HTH + " " + HHT + " " + HHH);

            }
            Console.ReadKey();
        }
    }
}
