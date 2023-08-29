/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematica1;

/**
 *
 * @author AULA-1
 * 
 * Desta forma, não precisa instanciar a s classes, e as variaveisnão podem ser alteradas
 * pois são "constantes", talves seria interessante a instancia dos objetos.
 * 
 * 
 */
public class Matematica1 { 
    static final double PI = 3.1415926535;
    static final double E = 2.7182818284;
    static final double PHI = 1.6180339887;
    
    
    static int soma(int a, int b){
        return a + b;
    }
    static int mult(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("Numero Pi: " + Matematica1.PI);
        System.out.println("Numero E: " + Matematica1.E);
        System.out.println("Numero Phi: " + Matematica1. PHI);
        System.out.println("Soma: " + Matematica1.soma(5, 3));
        System.out.println("Mult: " + Matematica1.mult(5, 3));
    
        System.out.println("FIM do jfh´dwpjkgd");
    }
}
