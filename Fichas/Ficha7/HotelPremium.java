package Ficha7;

public class HotelPremium extends Hotel implements CartaoHoteis{
    
    private double taxaLuxo;
    private int pontos; // pontos por euro
    
    // Construtores
    
    public HotelPremium (){
        super();
        this.taxaLuxo = 0;
        this.pontos = 0;
    }
    
    public HotelPremium (HotelPremium hp){
        super(hp);
        this.taxaLuxo = hp.getTaxaLuxo();
        this.pontos = hp.getPontos();
    }
    
    public HotelPremium (String codigo, String nome, String localidade, int categoria, int numQuartos, int preco, double taxaLuxo, int pontos){
        super(codigo, nome, localidade, categoria, numQuartos, preco);
        this.taxaLuxo = taxaLuxo;
        this.pontos = pontos;
    }
    
    // Gets
    
    public double getTaxaLuxo(){
        return this.taxaLuxo;
    }
    
    public int getPontos(){
        return this.pontos;
    }
    
    // Sets
    
    public void setTaxaLuxo (double newTaxaLuxo){
        this.taxaLuxo = newTaxaLuxo;
    }
    
    public void setPontos (int newPontos){
        this.pontos = newPontos;
    }
    
    // Clone
    
    public HotelPremium clone(){
        return new HotelPremium(this);
    }
    
    // Equals
    
    public boolean equals (Object o){
        if (this == o)
          return true;
          
        if((o == null) || (this.getClass() != o.getClass()))
          return false;
          
        HotelPremium hp = (HotelPremium) o;
        return (super.equals(hp) && this.taxaLuxo == hp.getTaxaLuxo() && this.pontos == hp.getPontos());
    }
    
    // toString
    
    public String toString (){
        String st = super.toString() + ", Taxa Luxo: " + this.getTaxaLuxo() + ", Pontos: " + this.getPontos();
        return st;
    }
    
    // Preço por noite
    
    public double precoNoite(){
        return this.getPreco() * this.getTaxaLuxo();
    }
     
}
