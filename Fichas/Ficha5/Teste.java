package Ficha5;

public class Teste{
    
    public static void main (String[] args){
        
        StackString st = new StackString();
        
        st.push("1");
        st.push("2");
        st.push("3");
        st.push("4");
        st.push("5");
        
        System.out.println(st.toString());
        
        st.pop();
        
        System.out.println("\n" + st.toString());
        
        System.out.println("\n O tamanho é: " + st.length());
        
        System.out.println("\n O topo da Stack é: " + st.top());
    }
}
