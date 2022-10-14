/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplicacaofor;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class MultiplicacaoFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variaveis 
        
        String perg = "Qual o valor do mumero ";
        String result = "O valor da multiplicação é ";
        int[] num = new int[2] ;
        int total = 0;
        int sinais =0;
         
        // Pergunta ao usuario.
        
        for(int i=0;i<num.length;i++){
            System.out.println(perg + (i+1) + "?");
            num[i] =in.nextInt();
        }
        
        // Conversão de sinais.
        
        for(int i=0;i<num.length;i++){
            if(num[i]<0){
                sinais++;
                num[i] = 0 - num[i];
            }
        }
        
        // Calculo da soma.
        
        for(int i=0;i<num[1];i++){
            total = num[0] + total;
        }
        
        // Afirmação para troca de sinais.
        
        if(sinais == 1){
            total = 0 - total;
        }
        
        // Resposta 
        
        System.out.println(result + total);
        
    }
}
