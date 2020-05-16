package Ficha7;

public class HotelStandard extends Hotel implements CartaoHoteis{
    
    private String epoca;
    private int pontos; // pontos por euro
    
    // Construtores
    
    public HotelStandard (){
        super();
        this.epoca = "baixa";
        this.pontos = 0;
    }
    
    public HotelStandard (HotelStandard hs){
        super(hs);
        this.epoca = hs.getEpoca();
        this.pontos = hs.getPontos();
    }
    
    public HotelStandard (String codigo, String nome, String localidade, int categoria, int numQuartos, int preco, String epoca, int pontos){
        super(codigo, nome, localidade, categoria, numQuartos, preco);
        this.epoca = epoca;
        this.pontos = pontos;
    }
    
    // Gets
    
    public String getEpoca(){
        return this.epoca;
    }
    
    public int getPontos(){
        return this.pontos;
    }
    
    // Sets
    
    public void setEpoca (String epoca){
        this.epoca = epoca;
    }
    
    public void setPontos (int newPontos){
        this.pontos = newPontos;
    }
    
    // Clone
    
    public HotelStandard clone(){
        return new HotelStandard(this);
    }
    
    // Equals
    
    public boolean equals (Object o){
        if (this == o)
          return true;
          
        if((o == null) || (this.getClass() != o.getClass()))
          return false;
          
        HotelStandard hs = (HotelStandard) o;
        return (super.equals(hs) && this.epoca.equals(hs.getEpoca()) && this.pontos == hs.getPontos());
    }
     
    // toString
    
    public String toString (){
        String st = super.toString() + ", Época: " + this.getEpoca() + ", Pontos: " + this.getPontos();
        return st;
    }
    
    // Preço por noite
    
    public double precoNoite(){
        if (this.getEpoca().equals("alta")) return this.getPreco() + 20;
        else return this.getPreco();
    }
    
}
