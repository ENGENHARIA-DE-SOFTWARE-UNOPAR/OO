package com.mycompany.gerenciabanco;
import java.util.Scanner;
/**
 *
 * @author Natan Ogliari
 */
public class GerenciaBanco {

    String cliente;
    int contaCliente;
    
    static int depositaDinheiro (int valor, char cliente){
    
        return 0;
    }
    
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Scanner menu = new Scanner (System.in);
        
       
        while (true){
            System.out.print("|---------------------------------|\n");
            System.out.print("| Opção 1 - Consulta saldo        |\n");
            System.out.print("| Opção 2 - Realizar um deposito  |\n");
            System.out.print("| Opção 3 - Realizar um saque     |\n");
            System.out.print("| Opção 4 - Sair                  |\n");
            System.out.print("|---------------------------------|\n");
            System.out.print("Digite uma opção: ");
            int opcao = menu.nextInt();// lê a opção do cliente
        
                  if (opcao == 4) {
                System.out.print("\nAté logo!");
                menu.close(); 
            }

            switch (opcao) {
            case 1:
                System.out.print("\nOpção Novo Cadastro Selecionado");
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
