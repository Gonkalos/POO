package Ficha7;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HoteisIncSet{
    
    private TreeSet <Hotel> hoteis;
    
    // Construtores
    
    public HoteisIncSet(){
        this.hoteis = new TreeSet<Hotel>();
    }
    
    public HoteisIncSet (HoteisIncSet ht){
        this.hoteis = ht.getHoteis();
    }
    
    public HoteisIncSet (TreeSet<Hotel> hoteis){
        this.hoteis = hoteis;
    }
    
    // Gets
    
    public TreeSet<Hotel> getHoteis(){
        return this.hoteis;
    }
    
    // Sets
    
    public void setHoteis (TreeSet<Hotel> newHoteis){
        this.hoteis = newHoteis;
    }
    
    
    
    
    
    
    
}
