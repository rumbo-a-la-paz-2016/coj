using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2789___Sum_Order
{
    class Program
    {
        static void Main(string[] args)
        {
            string cadena;
            int uno = 0;
            int dos = 0;
            int tres = 0;
            cadena = Console.ReadLine();
            for (int i = 0; i < cadena.Length; i++)
            {
                if (cadena[i] == '1')
                {
                    uno++;
                }
                else if (cadena[i] == '2')
                {
                    dos++;
                }
                else if (cadena[i] == '3')
                {
                    tres++;
                }
            }
            if (uno != 0)
            {
                for (int i = 0; i < uno; i++)
                {
                    Console.Write('1');
                    if (i!=uno-1)
                        Console.Write('+');
                    if ( i == uno-1)
                    {
                        if (dos != 0 || tres != 0)
                            Console.Write('+');
                    }
                    
                }
            }
            if (dos != 0)
            {
                for (int i = 0; i < dos; i++)
                {
                    
                    Console.Write('2');
                    if (i != dos - 1)
                        Console.Write('+');
                    if (i==dos-1)
                    {
                        if (tres != 0)
                            Console.Write('+');
                    }
                }
            }
            if (tres != 0)
            {
                for (int i = 0; i < tres; i++)
                {
                    Console.Write('3');
                    if (i != tres - 1)
                        Console.Write('+');
                }
            }
            
            Console.ReadKey();
        }
    }
}
