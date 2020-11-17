package Ficha3;
// Exercício 1

import java.lang.Math;

public class Circulo{
    
    private double x;
    private double y;
    private double raio;
    
    // a)
    
    public double getX(){
        return this.x = 0.0;
    }
    
    public double getY(){
        return this.y = 0.0;
    }
    
    public double getRaio(){
        return this.raio = 0.0;
    }
    
    // b)
    
    public void setX (double novoX){
        this.x = novoX;
    }
    
    public void setY (double novoY){
        this.y = novoY;
    }
    
    public void setRaio (double novoRaio){
        this.raio = novoRaio;
    }
        
    // c)
    
    public void alteraCentro(double deslocamentoX, double deslocamentoY){
        this.x = this.x + deslocamentoX;
        this.y = this.y + deslocamentoY;
    }
    
    // d)
    
    public double calculaArea(){
        double a = Math.PI * Math.pow(this.raio,2);
        return a;
    }

    // e)
    
    public double calculaPerimetro(){
        double p = 2 * Math.PI * this.raio;
        return p;
    }
    
}
