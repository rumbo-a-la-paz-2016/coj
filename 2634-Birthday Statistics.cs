using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace acm_2634
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 0;
            n = int.Parse(Console.ReadLine());
            int e = 0;
            int f = 0;
            int m = 0;
            int a = 0;
            int my = 0;
            int jn = 0;
            int jl = 0;
            int ag = 0;
            int sep = 0;
            int oc = 0;
            int nv = 0;
            int dc = 0;

            for (int i = 0; i < n; i++)
            {
                string cadena;
                cadena = Console.ReadLine();
                if (cadena[6] == '/')
                {
                    if (cadena[7] == '1')
                    {
                        if (cadena[8] == '/')
                        {
                            e++;
                        }
                        else if (cadena[8] == '0')
                        {
                            oc++;
                        }
                        else if (cadena[8] == '1')
                        {
                            nv++;
                        }
                        else if (cadena[8] == '2')
                        {
                            dc++;
                        }
                    }
                    else if (cadena[7] == '2')
                    {
                        f++;
                    }
                    else if (cadena[7] == '3')
                    {
                        m++;
                    }
                    else if (cadena[7] == '4')
                    {
                        a++;
                    }
                    else if (cadena[7] == '5')
                    {
                        my++;
                    }
                    else if (cadena[7] == '6')
                    {
                        jn++;
                    }
                    else if (cadena[7] == '7')
                    {
                        jl++;
                    }
                    else if (cadena[7] == '8')
                    {
                        ag++;
                    }
                    else if (cadena[7] == '9')
                    {
                        sep++;
                    }
                }
                else
                {
                    if (cadena[8] == '1')
                    {
                        if (cadena[9] == '/')
                        {
                            e++;
                        }
                        else if (cadena[9] == '0')
                        {
                            oc++;
                        }
                        else if (cadena[9] == '1')
                        {
                            nv++;
                        }
                        else if (cadena[9] == '2')
                        {
                            dc++;
                        }
                    }
                    else if (cadena[8] == '2')
                    {
                        f++;
                    }
                    else if (cadena[8] == '3')
                    {
                        m++;
                    }
                    else if (cadena[8] == '4')
                    {
                        a++;
                    }
                    else if (cadena[8] == '5')
                    {
                        my++;
                    }
                    else if (cadena[8] == '6')
                    {
                        jn++;
                    }
                    else if (cadena[8] == '7')
                    {
                        jl++;
                    }
                    else if (cadena[8] == '8')
                    {
                        ag++;
                    }
                    else if (cadena[8] == '9')
                    {
                        sep++;
                    }
                }
                
            }
            Console.WriteLine(1 + " " + e);
            Console.WriteLine(2 + " " + f);
            Console.WriteLine(3 + " " + m);
            Console.WriteLine(4 + " " + a);
            Console.WriteLine(5 + " " + my);
            Console.WriteLine(6 + " " + jn);
            Console.WriteLine(7 + " " + jl);
            Console.WriteLine(8 + " " + ag);
            Console.WriteLine(9 + " " + sep);
            Console.WriteLine(10 + " " + oc);
            Console.WriteLine(11 + " " + nv);
            Console.WriteLine(12 + " " + dc);

            Console.ReadKey();   
        }
    }
}
