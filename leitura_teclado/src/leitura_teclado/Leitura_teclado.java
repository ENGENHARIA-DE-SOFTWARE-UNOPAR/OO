/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.leitura_teclado.Leitura_teclado; //Problemas no diretorio do pacote
import java.util.Scanner

/**
 *
 * @author Natan
 */
public class Leitura_teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um valor inteiro (int):\t");
        int entradaInt = scan.nextInt();
        
        System.out.printf("Digite um valor double (double):\t");
        double entradaDouble = scan.nextDouble();
        
        System.out.printf("Digite uma string (uma palavra):\t");
        String entradaPalavra = scan.next();
    }
    
}
