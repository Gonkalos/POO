package Ficha7;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.stream.Collectors;
import java.io.*;

public class HoteisInc{
    
    private HashMap <String,Hotel> hoteis;
    
    // Construtores
    
    public HoteisInc(){
        this.hoteis = new HashMap<String,Hotel>();
    }
    
    public HoteisInc (HoteisInc hi){
        this.hoteis = hi.getHoteis();
    }
        
    public HoteisInc (HashMap<String,Hotel> hoteis){
        this.hoteis = hoteis;
    }
        
    // Gets
    
    public HashMap<String,Hotel> getHoteis(){
        return this.hoteis;
    }
    
    // Sets
    
    public void setHoteis (HashMap<String,Hotel> newHoteis){
        this.hoteis = newHoteis;
    }
    
    // toString
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Hotel h : this.getHoteis().values()) sb.append(h.toString() + "\n");
        return sb.toString();
    }
    
    // Verificar a existência de um hotel, dado o seu código
    
    public boolean existeHotel (String codigo){
        return this.hoteis.containsKey(codigo);
    }
    
    // Devolver a quantidade de hotéis existentes na cadeia
    
    public int quantos(){
        return this.hoteis.size();
    }
    
    // Devolver o número total de hotéis de uma dada localidade
    
    public int quantos (String loc){
        long l = this.hoteis.values().stream().filter(h -> h.mesmaLocalidade(loc) == true).count();
        int r = (int) l;
        return r;
    }
    
    // Devolver a quantidade de hotéis de um dado tipo (Standard, Premium)
    
    public int quantosT (String tipo){
        long l = this.hoteis.values().stream().filter(h -> h.getClass().toString().equals(tipo)).count();
        int r = (int) l;
        return r;
    }
    
    // Devolver a ficha de um hotel, dado o seu código
    
    public String getHotel (String cod) throws Hotel_Nao_Existe_Exception{
        if (!this.hoteis.containsKey(cod)){
            throw new Hotel_Nao_Existe_Exception(cod);
        }
        return this.hoteis.get(cod).toString();
    }
    
    // Adicionar a informação de um novo hotel
    
    public void adiciona (Hotel h){
        this.hoteis.put(h.getCodigo(), h.clone());
    }
    
    // Devolver uma lista contendo a cópia de todos os hotéis no sistema
    
    public List<Hotel> gethoteis(){
        return this.hoteis.values().stream().map(Hotel::clone).collect(Collectors.toList());
    }
    
    // Adicionar a informação de um conjunto de hotéis
    
    public void adiciona (Set<Hotel> hs){
        for (Hotel h : hs)
            this.hoteis.put(h.getCodigo(), h.clone());
    }
    
    // Alterar o estado da época de todos os HotelStandard
    
    public void mudaPara (String epoca) throws Epoca_Errada_Exception{
        if (epoca.equals("alta") || epoca.equals("baixa")){
            for (Hotel h : this.hoteis.values()){
                if (h.getClass().toString().equals("class HotelStandard")){
                    HotelStandard h2 = (HotelStandard) h;
                    h2.setEpoca(epoca);
                }
            }
        }
        else throw new Epoca_Errada_Exception(epoca);
    }
    
    // Obter a lista dos hotéis que atribuem pontos
    
    //public List<CartaoHoteis> daoPontos(){
    //    return this.hoteis.values().stream().filter(h -> h instanceOf CartaoHoteis).map(Hotel::clone).map(h -> (CartaoHoteis) h).collect(Collectors.toList()); 
    //}
    
    // Escrever para  um ficheiro
    
    public void writeFile (String filename) throws IOException{
        PrintWriter file = new PrintWriter (filename);
        file.println(" HotéisInc ");
        file.println(this.toString());
        file.flush();
        file.close();
    }
    
    // Guarda Estado para um ficheiro
    
    public void saveStatus (String filename) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }
    
    // Carrega Estado de um ficheiro
    
    public static HoteisInc loadStatus (String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        HoteisInc hi = (HoteisInc) ois.readObject();
        ois.close();
        return hi;
    }
    
}
 