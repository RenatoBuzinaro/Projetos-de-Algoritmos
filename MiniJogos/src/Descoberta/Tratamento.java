package Descoberta;
import java.util.Random;

public class Tratamento {
    
    public static String selecionarPalavra(String vetor[]){
        Random random = new Random();
        String palavraSelecionada = vetor[random.nextInt(vetor.length)];
        return palavraSelecionada;
    }

    public static String embaralhar (String palavra){

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

}
