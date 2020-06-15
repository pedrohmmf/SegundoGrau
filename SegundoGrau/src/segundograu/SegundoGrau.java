/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundograu;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class SegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite A:");
        double A = entrada.nextDouble();
        
        System.out.println("Digite B:");
        double B = entrada.nextDouble();
        
        System.out.println("Digite C:");
        double C = entrada.nextLong();
        double DT = Math.pow(B, 2) - 4*A*C;
        double X1 =((-B)+Math.sqrt(DT)/(2*A));
        double X2 = ((-B)-Math.sqrt(DT)/(2*A));
       
        if(DT>0)
        {
            System.out.println(X1);
            System.out.println(X2);
        }
        else if(DT == 0)
            System.out.println(X1);
        else if(DT<0)
            System.out.println("Essa equação não possui resultados reais");
        
                
        
        // TODO code application logic here
    }
    
}
