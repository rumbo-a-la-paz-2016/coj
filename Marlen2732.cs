using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CocoBits
{
    class main
    {
        static void Main(string[] args)
        {
            int CC = int.Parse(Console.ReadLine());
            string cadena, aux ="";
            for (int i = 0; i < CC; i++)
            {
                cadena = Console.ReadLine();
                for (int j = 0; j < cadena.Length; j++)
                { 
                    char c = cadena[j];
                    if (char.IsUpper(c))
                    {
                        aux = aux+(char.ToLower(c));
                    }
                    else
                    {
                        aux = aux + (char.ToUpper(c));
                    }
                }
                Console.WriteLine(aux);
                aux = "";
            }
            Console.ReadKey();
        }
    }
}