package Ficha7;

import java.util.*;
import java.io.*;

public class Teste{

    public static void main (String[] args){
        
        Scanner sc =  new Scanner(System.in);
          
        Hotel h1 = new HotelStandard ("000", "Hotel Algarve", "Sul", 4, 150, 120, "alta", 5);
        Hotel h2 = new HotelStandard ("001", "Hotel Braga", "Norte", 4, 150, 120, "alta", 5);
        
        Hotel h3 = new HotelPremium ("010", "Hotel Porto", "Norte", 5, 200, 150, 1.20, 8);
        Hotel h4 = new HotelPremium ("011", "Hotel Lisboa", "Centro", 5, 200, 150, 1.20, 8);
        
        Hotel h5 = new HotelDiscount ("100", "Hotel Guimarães", "Norte", 3, 100, 80, 50.0);
        Hotel h6 = new HotelDiscount ("101", "Hotel Setúbal", "Centro", 3, 100, 80, 40.0);
        
        HoteisInc hi = new HoteisInc();
        
        //System.out.println (h1.toString());
        //System.out.println (h2.toString());
        //System.out.println (h3.toString());
        //System.out.println (h4.toString());
        //System.out.println (h5.toString());
        //System.out.println (h6.toString());
        
        hi.adiciona(h1);
        hi.adiciona(h2);
        hi.adiciona(h3);
        hi.adiciona(h4);
        hi.adiciona(h5);
        hi.adiciona(h6);
        
        // Verificar a existência de um hotel, dado o seu código
        //System.out.println (hi.existeHotel("000"));
        
        // Devolver a quantidade de hotéis existentes na cadeia
        //System.out.println (hi.quantos());
        
        // Devolver o número total de hotéis de uma dada localidade
        //System.out.println (hi.quantos("Norte"));
        
        // Devolver a quantidade de hotéis de um dado tipo (Standard, Premium)
        //System.out.println (hi.quantosT("class HotelStandard"));
        
        // Devolver a ficha de um hotel, dado o seu código
        //System.out.println (hi.getHotel("000"));
        
        // Alterar o estado da época de todos os HotelStandard
        //hi.mudaPara("baixa");
        
        // Imprime o HashMap
        //for (Hotel h : hi.getHoteis().values()) System.out.println (h.toString());
        
        try{   
            System.out.println ("Inserir código do hotel:");
            String s1 = sc.nextLine();
            System.out.println(hi.getHotel(s1));
            
            System.out.println ("Inserir época:");
            String s2 = sc.nextLine();
            hi.mudaPara(s2);
            System.out.println (hi.toString());
            
            System.out.println ("Inserir nome do ficheiro:");
            String s3 = sc.nextLine();
            hi.writeFile(s3);
            
            System.out.println ("Inserir nome do ficheiro:");
            String s4 = sc.nextLine();
            hi.saveStatus(s4);
            
        }
        
        catch (Hotel_Nao_Existe_Exception e){
            System.out.println("O hotel com código " + e.getMessage() + " não existe.");
        }
        catch (Epoca_Errada_Exception e){
            System.out.println("Época " + e.getMessage() + " inválida.");
        }
        catch (FileNotFoundException e){
            System.out.println("Ficheiro não encontrado!\n");
        }
        catch (IOException e){
            System.out.println("Erro a gravar no ficheiro!\n");
        }
      
    }
    
}
