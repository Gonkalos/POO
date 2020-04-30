package Ficha3;
// Exercício 3

import java.time.LocalDateTime;

public class Video{
    
    private String nome;
    private byte [] conteudo;
    private LocalDateTime data;
    private int resolucao;
    private long duracao;
    private String [] comentarios;
    private int numComentarios;
    private int likes;
    private int dislikes;
    
    // a)
    
    public Video(){
        this.nome = " ";
        this.conteudo = new byte[512];
        this.data = LocalDateTime.now();
        this.resolucao = 0;
        this.duracao = 0;
        this.comentarios = new String[10];
        this.numComentarios = 0;
        this.likes = 0;
        this.dislikes = 0;
    }
    
    
    
    public String getNome(){
        return this.nome;
    }
    
    public byte [] getConteudo(){
        return this.conteudo;
    }
    
    public LocalDateTime getData(){
        return this.data;
    }
    
    public int getResolucao(){
        return this.resolucao;
    }
    
    public long getDuracao(){
        return this.duracao;
    }
    
    public String [] getComentarios(){
        return this.comentarios;
    }
    
    public int getNumComentarios(){
        return this.numComentarios;
    }
    
    public int getLikes(){
        return this.likes;
    }
    
    public int getDislikes(){
        return this.dislikes;
    }
    
    
    
    public void setNome (String novoNome){
        this.nome = novoNome;
    }
    
    
    // public void setConteudo (byte [] novoConteudo){
    //    this.conteudo = clone novoConteudo;
    //}
    
    public void setData (LocalDateTime novaData){
        this.data = novaData;
    }
    
    public void getResolucao (int novaResolucao){
        this.resolucao = novaResolucao;
    }
    
    public void getDuracao (long novaDuracao){
        this.duracao = novaDuracao;
    }
    
    // public void setComentarios (String [] novoComentarios){
    //     this.comentarios = clone novoComentarios;
    //}
    
   
    
    
    
    
    
   
    // b)
    
    public void insereComentario (String comentario){
        if (this.numComentarios<this.comentarios.length){
        this.comentarios[this.numComentarios] = comentario;
        this.numComentarios ++;
        }
    }
    
    // c)
    
    public long qtsDiasDepois(){
        LocalDateTime dataAtual = LocalDateTime.now();
        long dias = this.data.until(dataAtual,java.time.temporal.ChronoUnit.DAYS);
        return dias;
    }
        
    // d)
    
    public void thumbsUp(){
        this.likes ++;
    }
    
    // e)
    
    public String processa(){
        String c = "";
        for (int i=0; i<this.conteudo.length; i++){
            c = c + this.conteudo[i];
        }
        return c;
        // return String.valueOf(this.conteudo);
    }
            
    
    
    
    
    
    
    
    
    
    
    
    
    
}
