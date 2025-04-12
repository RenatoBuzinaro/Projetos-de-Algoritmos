package Main;

import Descoberta.JogarJogoDaDescoberta;
import CacaPalavras.JogarCacaPalavras;


public class App {
    public static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {

        
        
    while(true){
        
        System.out.println("Qual Jogo você gostaria de jogar?\n1 - Caça Palavras\n2 - Jogo Da Descoberta\n3 - Sair\n");
        
        String entrada  = scanner.nextLine();


        if(entrada.equals("1")){
            System.out.println("Iniciando Caca Palavras\n");
            JogarCacaPalavras jogarCacaPalavras = new JogarCacaPalavras();
            jogarCacaPalavras.jogar();
            continue;
            
            
        }else if(entrada.equals("2")){
            System.out.println("Iniciando Jogo da Descoberta\n");
            JogarJogoDaDescoberta jogarJogoDaDescoberta = new JogarJogoDaDescoberta();
            jogarJogoDaDescoberta.jogar();
            continue; 
            
        }else if(entrada.equals("3")){
            System.out.println("\nAté mais Space Cowboy!\n");
            break;
        }else{
            System.out.println("Entrada invalida\n");
        } 
    }
        
        
    }
}
