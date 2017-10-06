/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EPejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando Scanner
            Scanner sc = new Scanner(System.in);
         int x=0,i,n;
         System.out.println("Ingresae numero: ");
         n=sc.nextInt();
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             x++;
            }
         }
         if(x!=2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
     }
}
    
    


