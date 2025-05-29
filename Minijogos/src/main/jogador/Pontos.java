package main.jogador;

public class Pontos {
    private Jogador jogador;
    private int pontuacaocacapalavras;

    public Pontos(){
        pontuacaocacapalavras = 100;
    }

    public Jogador getJogador(){
        return this.jogador;
    }

    public int getPontos(){
        return this.pontuacaocacapalavras;
    }

    public void setPontos(int pontos){
        this.pontuacaocacapalavras =pontos ;
    }
    public void setJogador(Jogador jogador){
        this.jogador =jogador;
    }
}

