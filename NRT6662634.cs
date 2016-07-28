using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Birthday
{
    class Program
    {
        static void Main(string[] args)
        {
            int N = 0;
    string X;
    char C;
    int Z = 0;
    N = int.Parse(Console.ReadLine());
    int M = 0;
    int [] vec = new int[12] ;
    for(int j = 0; j<12; j = j+1)
        {
            vec[j] = 0;
        }
    for(int i = 0; i<N; i= i+1)
    {
        X = Console.ReadLine();
        if(X[7] == '/')
        {
            M = 8;
        }
        else{
            M = 7;
        }
        C = X[M];
            Z = (int) (C-48);
            if(Z == 1)
            {
                switch(M)
                {
                case 7:
                    {
                        if(X[8]!= '/')
                        {
                                Z = (Z*10) + ((int) (X[8]-48));
                        }
                    }break;
                    case 8:
                    {
                        if(X[9]!= '/')
                        {
                                Z = (Z*10) + ((int) (X[9]-48));
                        }
                    }break;
                }
            }
            vec[Z-1] = vec[Z-1] +1;
            Z = 0;
        }
            for(int i = 1; i<13; i++)
            {
                Console.WriteLine(i+" "+vec[i-1]);
            }
                    Console.ReadKey();
        }
    }
}
