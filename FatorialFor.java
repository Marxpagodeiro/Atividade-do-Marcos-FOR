/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fatorialfor;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class FatorialFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variaveis 
        String da = "Com base no número inserido pelo usuario: ";
        String perg  = "Insira um número para descobrir seu respectivo Fatorial:"; // pergunta feita para o usuario.
        int num = 0;
        int fat = 1; //fatorial x! = x*x-1 ate x ser = 1.
        
        //Pergunta feita ao usuario.
       
        System.out.println(perg);
        num = in.nextInt();
        
        //calculo da fatorial.
        
        for(int i = 1;i <= num; i++){
                fat = fat * i;
                System.out.println(fat);
                System.out.println(i);
 
        }
        /*
        como fazer o calculo da fatorial.
        sabendo que 0! = 1 e 1! = 1. considemaros a variavel fatorial ja igual a 1 para qualquer numero pedido menor ou igual a 1 ser 1 o resultado.
        declaramos a variavel i como sendo 1, para usar ela no calculo do fatoria.
        colocamos no loop a consição que o loop acontecera ate que i seja menor ou igual ao numero que o usuario colocou.
        fatorial = fatorial *i; assim fazendo como o calculo da fatotial comum so que ao contrario, começando multiplicando 1*1 e indo ate multiplicar a multiplicação anterior pelo numero dado pelo usuario.
        exemplo:
        
        num = 4
        i = 1+1 ate i = 4
        fat = fat * i;
        1=1*1 
        2=1*2
        6=2*3
        24=6*4
        como num=4 paramos o loop com o resultado de que 4!=24;
        */
        
        // Resposta
        
        System.out.println(da);
        System.out.println(num + "!" + " = " + fat);
    }
}
