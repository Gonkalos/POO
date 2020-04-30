package Ficha2;

import java.util.Scanner;

public class Teste1
{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        Exercicio1 ex1 = new Exercicio1(); 
        
     
        System.out.println("Tamanho do Array? ");
        int tamanho = sc.nextInt();
        int [] array = new int [tamanho];
        
        
        for (int elem : array){
            System.out.println("Próximo Valor? ");
            int valor = sc.nextInt();
            elem = valor;
        }
        
        
        int min = ex1.minimo(array);
        System.out.println(min);
    }   
}
