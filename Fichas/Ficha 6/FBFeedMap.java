package Ficha6;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;
import java.time.LocalDateTime;

public class FBFeedMap{
    
    private Map<String,List<FBPost>> feeds;
    
    // Construtores
    
    public FBFeedMap(){
        this.feeds = new HashMap<>();
    }
    
    public FBFeedMap (Map<String,List<FBPost>> f){
        this.feeds = new HashMap<>();
        for (Map.Entry<String,List<FBPost>> par : f.entrySet()){
            ArrayList<FBPost> aux = new ArrayList<>();
            for (FBPost fb : par.getValue()){
                aux.add(fb.clone());
            }
            this.feeds.put(par.getKey(), aux);
        }
    }
    
    public FBFeedMap (FBFeedMap f){
        this.feeds = f.feeds;
    }
    
    // Clone
    
    public FBFeedMap clone(){
        return new FBFeedMap(this);
    }
    
    // A
    
    public void addPost (String user, FBPost post){
        if (this.feeds.containsKey(user)){
            this.feeds.get(user).add(post);
        }
    }
    
    // B
    
            
    
    
        
    
    
    
    
    
    
    
    
    
     
    
    
    
    
}
