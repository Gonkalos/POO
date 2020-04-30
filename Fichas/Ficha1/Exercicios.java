package Ficha1;
// Exercícios II

public class Exercicios{
    
    // Exercício 1
    public double celsiusParaFarenheit(double graus){
        double grausF = graus * 9/5 + 32;
        return grausF;
    }
    
    // Exercício 2
    public int maximoNumeros(int a, int b){
        int maior = Math.max (a,b);
        return maior;
    }
    
    // Exercicio 3
    public String criaDescricaoConta(String nome, double saldo){
        String descricao = "Nome: " + nome + " ; Saldo: " + saldo;
        return descricao;
    }
    
    // Exercício 4
    public double eurosParaLibras(double valor, double taxaConversao){
        double libras = valor * taxaConversao;
        return libras;
    }
    
    // Exercício 5
    public double media(double a,double b){
        double med = (a+b)/2;
        return med;
    }
    
    // Exercício 6
    public long factorial(int num){
        int i,valor = 1;
        for (i=1;i<=num;i++){
            valor *= i;
        }
        return valor;
    }
        
    // Exercício 7
    
}
