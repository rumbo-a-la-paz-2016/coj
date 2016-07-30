/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1840;
import java.util.Scanner;
public class Ejercicio1840 {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in) ;  
     
     int n;
     int B,R,O,K,E,N;
     n=in.nextInt();
        
            while(n-->0)
            {
            String cadena=in.next();
            B=R=O=K=E=N=0;
            
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(j)=='B') {
                    B++;
                }
                if (cadena.charAt(j)=='R') {
                    R++;
                }
                if (cadena.charAt(j)=='O') {
                    O++;
                }
                if (cadena.charAt(j)=='K') {
                    K++;
                }
                if (cadena.charAt(j)=='N') {
                    N++;
                   
                }
                if (cadena.charAt(j)=='E') {
                    E++;
                }
            }
        if (B==R && R==O && O==K && K==E && E==N) {
            System.out.println("no secure");
        }
        else
        {
            System.out.println("secure");
        }
        }
    }
    

