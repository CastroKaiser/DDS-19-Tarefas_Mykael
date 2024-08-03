/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project;
//@author castr
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a 1 nota do aluno:");
        float nota_um = ler.nextFloat();
        
        System.out.println("Digite a 2 nota do aluno:");
        float nota_dois = ler.nextFloat();
        
        System.out.println("Digite a 3 nota do aluno:");
        float nota_tres = ler.nextFloat();
        
        float media = (nota_um + nota_dois + nota_tres)/3;
        
        System.out.println("A media das notas do aluno foi:"+media);
        
        
    }
}
