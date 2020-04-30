package Ficha7;

public abstract class Hotel{
    
    private String codigo;
    private String nome;
    private String localidade;
    private int categoria;
    private int numQuartos;
    private double preco;
    
    // Construtores
    
    public Hotel(){
        this.codigo = " ";
        this.nome = " ";
        this.localidade = " ";
        this.categoria = 0;
        this.numQuartos = 0;
        this.preco = 0.0;
    }
    
    public Hotel (Hotel h){
        this.codigo = h.getCodigo();
        this.nome = h.getNome();
        this.localidade = h.getLocalidade();
        this.categoria = h.getCategoria();
        this.numQuartos = h.getNumQuartos();
        this.preco = h.getPreco();
    }
    
    public Hotel (String codigo, String nome, String localidade, int categoria, int numQuartos, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.categoria = categoria;
        this.numQuartos = numQuartos;
        this.preco = preco;
    }
    
    // Gets
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getLocalidade(){
        return this.localidade;
    }
    
    public int getCategoria(){
        return this.categoria;
    }
    
    public int getNumQuartos(){
        return this.numQuartos;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    // Sets
    
    public void setCodigo (String newCodigo){
        this.codigo = newCodigo;
    }
    
    public void setNome (String newNome){
        this.nome = newNome;
    }
    
    public void setLocalidade (String newLocalidade){
        this.localidade = newLocalidade;
    }
    
    public void setCategoria (int newCategoria){
        this.categoria = newCategoria;
    }
        
    public void setNumQuartos (int newNumQuartos){
        this.numQuartos = newNumQuartos;
    }
    
    public void setPreco (double newPreco){
        this.preco = newPreco;
    }
    
    // Clone
    
    public abstract Hotel clone();
    
    // Equals
    
    public boolean equals (Object o){
        if (this == o)
          return true;
          
        if((o == null) || (this.getClass() != o.getClass()))
          return false;
          
        Hotel h = (Hotel) o;
        return (this.codigo.equals(h.getCodigo()) && this.nome.equals(h.getNome()) && this.localidade.equals(h.getLocalidade()) &&
                this.categoria == h.getCategoria() && this.numQuartos == h.getNumQuartos() && this.preco == h.getPreco());
    }
    
    // toString
    
    public String toString (){
        return "Código: " + this.getCodigo() + ", Nome: " + this.getNome() + ", Localidade: " + this.getLocalidade() +
               ", Categoria: " + this.getCategoria()  + ", Número de Quartos: " + this.getNumQuartos() + ", Preco: " + this.getPreco();
    }
    
    // Verifica se é da mesma localidade
    
    public boolean mesmaLocalidade (String loc){
        return this.localidade.equals(loc);
    }
    
}
