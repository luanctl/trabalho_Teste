/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
   autor: Luan Castoldi
*/
package univates_2019b;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luan.castoldi
 */
public class UNIVATES_2019B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  Pessoa pessoa1 = new Pessoa(); 
  Pessoa pessoa2 = new Pessoa();
           
   //Para Depositar para o Luan é só colocar o numero POSITIVO
   //Para Depositar para o Renan é só colocar o numero NEGATIVO-
    pessoa1.setNome("Luan");
    pessoa2.setNome("Renan");
    
       System.out.println("Saldo incial " + "\n"); 
         
       pessoa1.setNome("Luan");
       pessoa1.setValorConta(500);
       System.out.println(pessoa1);
       
       
        pessoa2.setNome("Renan");
        pessoa2.setValorConta(500);
        System.out.println(pessoa2);
    
   
   Scanner tecladoN = new Scanner(System.in);
   System.out.println("Para qual você deseja tranferir ? :  [1] " + pessoa1.getNome() + " [2] " + pessoa2.getNome());
   int nome  = tecladoN.nextInt();
   
   
   switch (nome) {
  case 1:
    System.out.println(pessoa1.getNome()+ " SELECIONADO");
     Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o valor da tranferencia (numero inteiro)");
        double valorTransferencia = teclado.nextInt();
        double valor = pessoa1.getValorConta();
          // transferencia(pessoa1.getNome(), pessoa2.getNome(), pessoa1.getValorConta(), valorTransferencia);
     
       if(valorTransferencia > 500){
                System.out.println("Valor não permitido");
       }else {
        String nomeP = pessoa1.getNome();
        String nomeS = pessoa2.getNome();
        double valorLuan = valor + valorTransferencia;
        double valorRenan = valor - valorTransferencia;
        
         System.out.println("Valores Atualizados da Tranferencia: R$ " + valorTransferencia + "\n" + "\n" + "Nome = " + nomeP + "\n" + "Valor = "+ valorLuan + "\n" + 
                                                               "--------------------" + "\n" +
                                                             "Nome = " + nomeS + "\n" + "Valor = " + valorRenan);
       }
    break;
  case 2:
  System.out.println(pessoa2.getNome()+ " SELECIONADO");
     Scanner teclado2 = new Scanner(System.in);
       System.out.println("Digite o valor da tranferencia (numero inteiro)");
        double valorTransferencia2 = teclado2.nextInt();
        double valor2 = pessoa2.getValorConta();
     
       if(valorTransferencia2 > 500){
                System.out.println("Valor não permitido");
       }else {
        String nomeP = pessoa1.getNome();
        String nomeS = pessoa2.getNome();
        double valorLuan = valor2 - valorTransferencia2;
        double valorRenan = valor2 + valorTransferencia2;
        
         System.out.println("Valores Atualizados da Tranferencia: R$ " + valorTransferencia2 + "\n" + "\n" + "Nome = " + nomeP + "\n" + "Valor = "+ valorLuan + "\n" + 
                                                               "--------------------" + "\n" +
                                                             "Nome = " + nomeS + "\n" + "Valor = " + valorRenan);
        break;
    
     }
    }
   } 
  }