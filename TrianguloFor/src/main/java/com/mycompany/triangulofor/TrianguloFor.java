/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.triangulofor;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class TrianguloFor {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        // Variaveis
        
        String da = "Com base nos lados dados pelo usuario:";
        String tri = "A figura é um triagulo";
        String ntri = "A figura não é um triagulo";
        String equi = "Do tipo triagulo Equilatero";
        String iso = "Do tipo triagulo Isósceles";
        String esca = "Do tipo triagulo Escaleno";
        String ret= "E é um triangulo Retangulo";
        String nret = "E não é um triagulo Retangulo";
        String lado = "Digite o valor do lado ";
        double[]lados = new double[3];
        int pos=0;
        double total=0;
        double aux= 0;
        int i = 0;
        
        // Pergunta ao usuario.
        
        for(i=0;i<lados.length;i++){
            System.out.println(lado + (i+1));
            lados[i] =in.nextDouble();
        }
        // Calculo para descobrir qual é o valor maior.
         
        for(i=1;i<lados.length;i++){
            if(lados[i]>lados[pos]){
                pos=i;
            }
        }
        
        // Calculo para descobrir a soma dos dois lados menores.
        
        for(i=0;i<lados.length;i++){
            if(i!=pos){
                total=total+lados[i];
            }
        }
        
        // Variavel auxiliar.
        
        aux=lados[0];
        lados[0]=lados[pos];
        lados[pos]=aux;
        
        // Afirmações para ver se é triangulo; se for triangulo, para ver de qual tipo é, e se ele é retangulo.
        
        System.out.println(da);
        if(total>lados[pos]){
            System.out.println(tri);
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println(equi);
            }else if(lados[0]==lados[1] || lados[0]==lados[2] || lados[1]==lados[2]){
                System.out.println(iso);
            }else{
                System.out.println(esca);
            }
            if((lados[0]*lados[0])== (lados[1]*lados[1])+(lados[2]*lados[2])){
               System.out.println(ret); 
            }else{
                System.out.println(nret); 
 
            }
        }else{
           System.out.println(ntri); 
        } 
    }
}
