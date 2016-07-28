using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LATIN2775
{
    class main
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string cad, aux = "";
            for (int i = 0; i < n; i++)
            {
                cad = Console.ReadLine();
                for (int j = 0; j < cad.Length; j++)
                {
                    if (j==0 && (cad[j].ToString() == "a" ||cad[j].ToString() == "e" ||cad[j].ToString() == "i" ||cad[j].ToString() == "o" ||cad[j].ToString() == "u") )
                    {
                        cad = cad + "cow";                        
                    }
                    else if (j == 0)
                    {
                        aux = cad[j].ToString();
                        cad = cad.Remove(j=0,j=1);
                        cad = cad + aux + "ow";
                    }
                }
                Console.WriteLine(cad);
            }
            Console.ReadKey();
        }
    }
}