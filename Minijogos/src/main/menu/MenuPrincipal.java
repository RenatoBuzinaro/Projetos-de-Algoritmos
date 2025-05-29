package main.menu;
import main.*;
import main.jogador.*;
import main.descoberta.*;
import main.cacapalavras.*;


public class MenuPrincipal {

     
    
    public MenuPrincipal(){

    }

    
    public void menuPrincipal(){
        while(true){
        
    
        System.out.println("Qual Jogo você gostaria de jogar?\n1 - Caça Palavras\n2 - Jogo Da Descoberta\n3 - Sair\n");
        
        String entrada  = Main.scanner.nextLine();
        

        if(entrada.equals("1")){
            System.out.println("Iniciando Caca Palavras\n");
            Jogador jogador = new Jogador();
            Pontos pontos = new Pontos();
            System.out.println("Você gostaria de salvar a Sua pontuação? DIGITE 1 para SIM e qualquer outra coisa para não"); 
            String menu= Main.scanner.nextLine();
        

            if (menu.equals("1")){
                System.out.println("insira o nome do jogador\n"); 
                String nome = Main.scanner.nextLine();
                jogador.setNome(nome);
                pontos.setJogador(jogador);
            }
            
            JogarCacaPalavras jogarCacaPalavras = new JogarCacaPalavras(pontos);
            jogarCacaPalavras.jogar();
            continue;
            
            
        }else if(entrada.equals("2")){
            System.out.println("Iniciando Jogo da Descoberta\n");

            Jogador jogador = new Jogador();
            Pontos pontos = new Pontos();
            
            System.out.println("Você gostaria de salvar a Sua pontuação? DIGITE 1 para SIM"); 
            String menu= Main.scanner.nextLine();
        

            if (menu.equals("1")){
                System.out.println("insira o nome do jogador\n"); 
                String nome = Main.scanner.nextLine();
                jogador.setNome(nome);
                pontos.setJogador(jogador);
            }

            JogarJogoDaDescoberta jogarJogoDaDescoberta = new JogarJogoDaDescoberta(pontos);
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
