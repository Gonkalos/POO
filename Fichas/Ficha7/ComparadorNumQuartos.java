package Ficha7;

public class ComparadorNumQuartos{
    
    // Comparar dois hoteis segundo o número de quartos
    
    public int compare (Hotel h1, Hotel h2){
        if (h1.getNumQuartos() > h2.getNumQuartos()) return 1;
        else {
            if (h1.getNumQuartos() < h2.getNumQuartos()) return -1;
            else return 0;
        }
    }
    
}
