/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg4;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1, num2;
        System.out.println("Introduce el primer numero");
        Scanner num1Teclado = new Scanner(System.in);
        num1 = num1Teclado.nextFloat();
        System.out.println("Introduce el primer numero");
        Scanner num2Teclado = new Scanner(System.in);
        num2 = num2Teclado.nextFloat();
        System.out.println("La suma de los numeros es: " +(num1+num2));        
        System.out.println("La resta de los numeros es: " +(num1-num2));        
        System.out.println("El producto de los numeros es: "+num1*num2);        
        System.out.println("El cociente de los numeros es: "+num1/num2);        
    }
    
}
