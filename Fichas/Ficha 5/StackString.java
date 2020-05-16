package Ficha5;

import java.util.ArrayList;
import java.util.List;

public class StackString{
    
    private List<String> elementos;
    
    public StackString (){ 
        this.elementos = new ArrayList<String>();
    }
    
    public StackString (List<String> strs){
        this.elementos = new ArrayList<String>();
        for (String s : strs){
            this.elementos.add(s);
        }
    }
    
    public StackString (StackString ss){
        this.elementos = ss.getElementos();
    }
    
    public List<String> getElementos (){
        ArrayList<String> res = new ArrayList<>();
        for (String s : this.elementos){
            res.add(s);
        }
        return res;
    }
    
    public StackString clone(){
        return new StackString(this);
    }   
    
    public String top (){
        if (!this.elementos.isEmpty()){
            return this.elementos.get(this.elementos.size()-1);
        }
        else{
            return null;
        }
    }
    
    public void push (String s){
        this.elementos.add(s);
    }
    
    public void pop (){
        if (this.elementos.isEmpty()){
            this.elementos.remove(this.elementos.size()-1);
        }
    }
    
    public boolean empty (){
        return this.elementos.isEmpty();
    }
    
    public int length (){
        return this.elementos.size();
    }
    
    public boolean equals (Object o){
        if (this == o){ 
            return true;
        }
        if ((o == null) || (o.getClass() != this.getClass())){
            return false;
        }
        StackString aux = (StackString) o;
        return this.elementos.equals(aux.getElementos());
    }
}
        
        
        
        
        
        
        
        
        
        
        
    
        
