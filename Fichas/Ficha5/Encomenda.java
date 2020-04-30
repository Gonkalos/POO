package Ficha5;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Encomenda{
    
    private String nome;
    private int nif;
    private String morada;
    private int numEncomenda;
    private LocalDateTime data;
    private List<LinhaEncomenda> linhas;
    
    // Construtores
    
    public Encomenda(){
        this.nome = " ";
        this.nif = 0;
        this.morada = " ";
        this.numEncomenda = 0;
        this.data = LocalDateTime.now();
        this.linhas = new ArrayList<LinhaEncomenda>();
    }
    
    public Encomenda(String nome, int nif, String morada, int numEncomenda, LocalDateTime data, List<LinhaEncomenda> linhas){
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numEncomenda = numEncomenda;
        this.data = data;
        this.linhas = new ArrayList<LinhaEncomenda>();
        for (LinhaEncomenda le : linhas){
            this.linhas.add(le.clone());
        }
    }
    
    public Encomenda (Encomenda e){
        this.nome = e.getNome();
        this.nif = e.getNif();
        this.morada = e.getMorada();
        this.numEncomenda = e.getNumEncomenda();
        this.data = e.getData();
        this.linhas = e.getLinhas();
    }
    
    // Gets
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNif(){
        return this.nif;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public int getNumEncomenda(){
        return this.numEncomenda;
    }
    
    public LocalDateTime getData(){
        return this.data;
    }
    
    public List<LinhaEncomenda> getLinhas(){
        return this.linhas;
    }
    
    // Sets
    
    public void setNome (String newNome){
        this.nome = newNome;
    }
    
    public void setNif (int newNif){
        this.nif = newNif;
    }
    
    public void setMorada (String newMorada){
        this.morada = newMorada;
    }
    
    public void setNumEncomenda (int newNumEncomenda){
        this.numEncomenda = newNumEncomenda;
    }
    
    public void setLinhas (List<LinhaEncomenda> newLinhas){
        this.linhas = newLinhas;
    }
    
    // Clone
    
    public Encomenda clone(){
        return new Encomenda(this);
    }
    
    
    
    
    
    
    

}
