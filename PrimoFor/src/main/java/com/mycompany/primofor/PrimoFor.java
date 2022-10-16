/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primofor;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class PrimoFor {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       // Variaveis
       
       String perg  = "Informe o numero? "; // pergunta feita para o usuario 
       String da = "O numero informado pelo usuario é: ";
       String ini = "Esse progrma é para descobrir se um número é primo.";
       String intro = "Insira o número para descobrir se ele é primo:";
       String pri = "É primo";
       String npri = "Não é primo";        
       int num = 0;
       int cont = 0;
       
       //introdução
       
        System.out.println(ini);
        System.out.println(intro);
       
       //Pergunta feita ao usuario.
       
       System.out.println(perg);
       num = in.nextInt();
       
       // Calculo para descobrir se é um numero primo.
       
       for(int d = 2;d<=(num/2)+1;d++){
           if(num%d == 0){
               
               cont++;
           }
       }
       
       //Confirmação se o numero é primo ou não.
       
       System.out.println(da);
       if(cont == 0){
           System.out.println(pri);
       }else{
           System.out.println(npri);
       }
    }
}
