package Ficha1;

import java.util.Scanner;

public class Teste{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        Exercicios ex = new Exercicios(); 
    
        // Exercício 1
        System.out.println("Graus Celsius? ");
        double grausC = sc.nextDouble();
        double grausF = ex.celsiusParaFarenheit(grausC);
        System.out.println(grausF);
    
        // Exercício 2
        System.out.println("Valores ?");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int maior = ex.maximoNumeros(valor1,valor2);
        System.out.println(maior);
        
        // Exercício 3
        System.out.println("Nome e Saldo? ");
        String nome = sc.next();
        double saldo = sc.nextDouble();
        String descricao = ex.criaDescricaoConta(nome,saldo);
        System.out.println(descricao);
        
        // Exercício 4
        System.out.println("Valor € e Taxa £ ? ");
        double euros = sc.nextDouble();
        double taxa = sc.nextDouble();
        double libras = ex.eurosParaLibras(euros,taxa);
        System.out.println(libras);
        
        // Exercício 5
        System.out.println("Valores? ");
        double valor3 = sc.nextDouble();
        double valor4 = sc.nextDouble();
        double med = ex.media(valor3,valor4);
        System.out.println(med);
    
        // Exercício 6
        System.out.println("Valor? ");
        int valor5 = sc.nextInt();
        long fat = ex.factorial(valor5);
        System.out.println(fat);
        
        // Exercício 7
        
    
    
    
    
    
    
    }   
}
    
