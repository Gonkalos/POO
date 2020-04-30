package Ficha7;

public class HotelDiscount extends Hotel{
    
    private double ocupacao;
    
    // Construtores
    
    public HotelDiscount (){
        super();
        this.ocupacao = 0.0;
    }
    
    public HotelDiscount (HotelDiscount hd){
        super(hd);
        this.ocupacao = hd.getOcupacao();
    }
    
    public HotelDiscount (String codigo, String nome, String localidade, int categoria, int numQuartos, int preco, double ocupacao){
        super(codigo, nome, localidade, categoria, numQuartos, preco);
        this.ocupacao = ocupacao;
    }
    
    // Gets
    
    public double getOcupacao(){
        return this.ocupacao;
    }
    
    // Sets
    
    public void setOcupacao(double newOcupacao){
        this.ocupacao = newOcupacao;
    }   
    
    // Clone
    
    public HotelDiscount clone(){
        return new HotelDiscount(this);
    }
    
    // Equals
    
    public boolean equals (Object o){
        if (this == o)
          return true;
          
        if((o == null) || (this.getClass() != o.getClass()))
          return false;
          
        HotelDiscount hd = (HotelDiscount) o;
        return (super.equals(hd) && this.ocupacao == hd.getOcupacao());
    }
    
    // toString
    
    public String toString (){
        String st = super.toString() + ", Ocupacao: " + this.getOcupacao();
        return st;
    }
    
    // Preço por noite
    
    public double precoNoite(){
        return this.getPreco() * 0.5 + this.getPreco() * 0.4 * this.getOcupacao();
    }
   
}
