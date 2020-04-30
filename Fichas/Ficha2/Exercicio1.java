package Ficha2;
// Calcula o mínimo de um array

public class Exercicio1
{
    
    // a
    public int minimo(int [] array){
        
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
    
    // c
    /*
    public int intersect(int [] a, int [] b){
        
        int n;
        if (a.length >= b.length) n = a.length;
        else n = b.length;
        int [] intersecao = new int [n];
        
        for (int i : a){
            for (int j : b){
                
    */           
            
}
