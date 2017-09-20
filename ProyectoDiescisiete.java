/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiescisiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoDiescisiete {

    /**
     * @param args the command line arguments
     * se pide una edad y informa la idad 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Integer edad;
        String datoAux;
        Scanner miSc=new Scanner(System.in);
        
        System.out.println("indique la edad");
        datoAux=miSc.next();
        edad=Integer.parseInt(datoAux);
        
        if(edad > 12 )
        {
            System.out.println("ya no sos un niño");
        }
         else 
            System.out.println("sos un adolecente");
   
        if(edad < 18)
        {
            System.out.println("sos un adulto");
        }
        else 
            System.out.println("sos un adulto");
        
        
        //
        //
        edad=99;
        
        if(edad<17)
        {
            System.out.println("es mayor");
        }
        else
            //son mayores a 18
            if(edad<12)
        {
            System.out.println("es un niño");
        }
        else
            //es menor 12
       
    
   }
    
}
