package main.jogador;

public class Jogador {
    
    private String  nome = "";
    

    public Jogador(){

    }       

    public Jogador(String nome){
        this.nome= nome;
        
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String getNome(){
        return this.nome;
    }
}
