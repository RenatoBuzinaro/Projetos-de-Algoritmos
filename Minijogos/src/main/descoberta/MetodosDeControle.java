package main.descoberta;

import java.util.Random;

public class MetodosDeControle {
    public String selecionarPalavra(String vetor[]){
        Random random = new Random();
        String palavraSelecionada = vetor[random.nextInt(vetor.length)];
        return palavraSelecionada;
    }

    public String embaralhar (String palavra){

        char[] palavraArray = palavra.toCharArray();
        Random random =new Random();
        for (int x  =0; x<palavraArray.length; x++){
            int indiceAleatório =  random.nextInt(palavraArray.length-1);

            char temporaria = palavraArray[x];
            palavraArray[x] = palavraArray[indiceAleatório];
            palavraArray[indiceAleatório] = temporaria;

        }
        return new String(palavraArray);
    }
    public void dica(String palavraSelecionada){
        System.out.println("A primeira letra é '"+ palavraSelecionada.charAt(0)+"' e a ultima é '"+palavraSelecionada.charAt(palavraSelecionada.length()-1)+"'\n");
    }

}
