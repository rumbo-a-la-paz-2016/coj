using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Coco_string
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = int.Parse(Console.ReadLine());
            string X;
            string Y = "";
            string [] vec = new string[N];
            for (int i = 0; i < N; i++)
            {
                X = Console.ReadLine();
                for (int j = 0; j <X.Length; j=j+1)
                {
                    if (char.IsLower(X[j]))
                    {

                        Y = Y.Insert(j, X[j].ToString().ToUpper());
                    }
                    else {
                        Y = Y.Insert(j, X[j].ToString().ToLower());
                    }
                }
                vec[i] = Y;
                Y = "";
            }
            for (int j = 0; j < N; j++)
            {
                Console.WriteLine(vec[j]);
            }
                Console.ReadKey();
        }
    }
}
