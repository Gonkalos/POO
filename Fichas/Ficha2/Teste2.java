package Ficha2;

import java.util.Scanner;

public class Teste2{
    
    public static void main(String [] args){
        
    Scanner sc = new Scanner(System.in);
    Exercicio2 ex2 = new Exercicio2();   
        
    int [][] pauta = new int [5][5];
    
    for (int i=0;i<5;i++){
        System.out.println("Aluno " + i);
        for (int j=0;j<5;j++){
            System.out.println("Próximo Valor? ");
            int valor = sc.nextInt();
            pauta [i][j] = valor;
        }
    }
    
    } 
}
