package Ficha6;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class Parque{
    
    private String nome;
    private Map<String,Lugar> lugares;
    
    // construtores
    
    public Parque (){
        this.nome = " ";
        this.lugares = new HashMap<>();
    }
    
    public Parque (String name, Map<String,Lugar> places){
        this.nome = nome;
        this.lugares = places;
    }
    
    public Parque (Parque p){
        this.nome = p.getNome();
        this.lugares = p.getLugares();
    }
    
    // gets
    
    public String getNome(){
        return this.nome;
    }
    
    public Map<String,Lugar> getLugares (){
        return this.lugares;
    }
    
    // sets
    
    public void setNome (String newNome){
        this.nome = newNome;
    }
    
    public void setLugares (Map<String,Lugar> newLugares){
        this.lugares = newLugares;
    }
    
    // clone
    
    public Parque clone(){
        return new Parque(this);
    }
        
    // equals
    
    public boolean equals (Object o){
        if (this == o)
          return true;
          
        if((o == null) || (this.getClass() != o.getClass()))
          return false;
          
        Parque umParque = (Parque) o;
        return (this.nome.equals(umParque.getNome()) && this.lugares.equals(umParque.getLugares()));
    }
    
    // Método que devolve todas as matriculas dos lugares ocupados
    
    //public Set<String> getMatriculas (Parque p){
    //    return this.lugares.getMatricula();
    //}
    
    // Método que regista uma nova ocupação de lugar
    
    public void addLugar (Lugar l){
        this.lugares.put(l.getMatricula(), l.clone());
    }
    
    // Método que remove o lugar de dada matricula
    
    public void removeLugar (Lugar l){
        this.lugares.remove(l.getMatricula());
    }
    
    // Método que altera o tempo disponível de um lugar, para uma dada matricula
    
    public void changeTime (String m, int min){
        this.lugares.get(m).setMinutos(min);
    }
    
    // Método que devolve a quantidade total de minutos atribuídos (com iterador interno)
    
    public int totalMinI (){
        int r = 0;
        for (Lugar l : this.lugares.values()){
            r += l.getMinutos();
        }
        return r;
    }
    
    // Método que devolve a quantidade total de minutos atribuídos (com iterador externo)
    
    public int totalMinE (){
        return this.lugares.values().stream().mapToInt(Lugar::getMinutos).sum();
    }
        
    // Método que verifica existe lugar atribuído a uma dada matrícula
    
    public boolean exists (String mat){
        return this.lugares.containsKey(mat);
    }
    
    // Método que cria uma lista com as matriculas com tempo atribuído > x, em que o lugar seja permanente (com iterador interno)
    
    
    
   
    // Método que cria uma lista com as matriculas com tempo atribuído > x, em que o lugar seja permanente (com iterador externo)
    
    public List<String> moreTimeThan (int min){
        return this.lugares.values().stream().filter(l->l.getMinutos()>min).map(Lugar::getMatricula).collect(Collectors.toList());
    }
    
    // Método que devolve uma cópia dos lugares
    
    
    
    // Método que devolve a informação de um lugar para uma dada matrícula
    
    
    
    
        
        
        
    
    
    
    
    
    
    
    
    
    
}
