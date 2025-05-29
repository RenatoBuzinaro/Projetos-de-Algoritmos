package main.cacapalavras;

import java.util.Random;

public class MetodosDeControleTabuleiro {

    public String selecionarPalavra(String palavras[]){
        Random random = new Random();
        String palavraselecionada = palavras[random.nextInt(palavras.length)];
        return palavraselecionada;

    }

    public void preencherTabuleiro(char tabuleiro[][]){
        Random random = new Random();
        int tamanho = tabuleiro.length;
    
        for(int x=0 ; x<tamanho;x++){
            for(int y=0; y<tamanho;y++){
    
                tabuleiro[x][y] = (char)('a'+ random.nextInt(25));
            }
         }
    }

    public void imprimirTabuleiro(char tabuleiro[][]){
    
        int tamanho = tabuleiro.length;
        for(int x=0 ; x<tamanho;x++){
            for(int y=0; y<tamanho;y++){       
                System.out.print(tabuleiro[x][y]+" ");
            }
            System.out.println("");
         }
    }
     
    public void posicionadorX(int tamanhoVetor, String palavraselecionada, char[][] tabuleiro){
        Random random = new Random();
        int linha = random.nextInt((tamanhoVetor));
        int coluna = random.nextInt((tamanhoVetor - palavraselecionada.length()));
        
        for(int x=0 ; x<palavraselecionada.length();x++){
            tabuleiro[linha][coluna+x] = palavraselecionada.charAt(x);
         }

    
    
    }

    public void dica(String palavraSelecionada){

        char primeiraletra = palavraSelecionada.charAt(0);
        char ultimaletra = palavraSelecionada.charAt(palavraSelecionada.length()-1);

        System.out.println("A primeira letra É : "+primeiraletra+"\nE a ultima letra É : "+ ultimaletra);
    }


}
