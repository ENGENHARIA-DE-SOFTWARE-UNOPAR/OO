/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matematica;

/**
 *
 * @author AULA-1
 * 
 * Este exemplo não é o mais indicado pois a classe não é statica.
 * e precisa instanciar a clase para qie possa acessar as variaveiis
 * 
 * 
 */
public class Matematica {
    
    double PI = 3.141516;
    double E = 2.7182818284;
    double PHI = 1.6180339887;
    
    int soma(int a, int b){// Realiza a adição de dois numeros
        return a + b ;
    }
    
    int mult(int a, int b){ //realiza a multiplicação de dois numeros
        return a * b;
    }
    
    public static void main(String[] args) {
        
        Matematica mat = new Matematica(); //instancia a classe (Cria objeto)
        
        System.out.println("Numero Pi: " + mat.PI);
        System.out.println("Numero E: " + mat.E);
        System.out.println("Numero Phi: " + mat.PHI);
        System.out.println("Soma: " + mat.soma(5, 3));
        System.out.println("Multi: " + mat.mult(5, 3));  
        
        
        System.out.println("FIM da execução");
    }
}
