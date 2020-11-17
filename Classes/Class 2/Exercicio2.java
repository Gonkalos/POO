package Ficha2;
// Exercício 2

public class Exercicio2{
    
    private int [][] pauta;
    
    public int soma (int uc){
        
        int soma = 0;
        
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (j == uc) soma += pauta [i][j];
            }
        }
        
        return soma;
    }        
}
