package com.mycompany.gerenciabanco;

import java.util.*;
import javax.swing.JOptionPane;
import java.lang.Integer;
/**
 *
 * @author Natan Ogliari
 */
public class GerenciaBanco {

    static void clienteLogado(){
        Scanner menu = new Scanner (System.in);
        System.out.println("Informe o seu nome:\n");
        String nome = menu.next();// lê O nome do cliente
        System.out.println("Informe o seu Sobrenome:\n");
        String sobrenome = menu.next();// lê O sobrenome do cliente
// lê O sobrenome do cliente
        System.out.println("Informe o seu numero de CPF:\t xxx.xxx.xxx-xx:\n");
        // lê numero de CPF    
        
    }
    
    static int depositaDinheiro (int valor, char cliente){
    
        return 0;
    }
    public static void consultaSaldo(){
        String cliente = null;
        
        clienteLogado();
                
    }
    
    public static void realizaSaque(){
     
    
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Scanner menu = new Scanner (System.in);
        ArrayList<String> clientes = new ArrayList<String>();
       
        while (true){
            //System.out.print("|---------------------------------|\n");
           // System.out.print("| Opção 1 - Consulta saldo        |\n");
           //// System.out.print("| Opção 2 - Realizar um deposito  |\n");
           // System.out.print("| Opção 3 - Realizar um saque     |\n");
           // System.out.print("| Opção 4 - Sair                  |\n");
           // System.out.print("|---------------------------------|\n");
            //System.out.print("Digite uma opção: ");
            //int opcao = menu.nextInt();// lê a opção do cliente
            //Integer.parseInt
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"|------------------------------------|\n | Opção 1 - Consulta saldo         |\n| Opção 2 - Realizar um deposito  |\n| Opção 3 - Realizar um saque     |\n| Opção 4 - Sair                  |\n|---------------------------------|"));
            
            System.out.println(opcao);
            
            if ("opcao" == null){// caso o usuario cncele a opção
                System.out.print("\n Você cancelou o comando\n");
                menu.close();
                break;            
            }
            
            if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close(); // fecha o Scanner
                break;//sai do while
            }

            switch (opcao) {
            case 1:
                System.out.print("\nOpção Consulta saldo foi selecionada\n");
                consultaSaldo();
                break;

            case 2:
                System.out.print("\nOpção Clientes Selecionado\n");
                break;

            case 3:
                System.out.print("\nOpção Produtos Selecionado\n");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
             }
        
        }
    }
}
