package main.cacapalavras;

import main.Main;
import main.jogador.Pontos;

public class JogarCacaPalavras {
private Pontos pontos;
    public JogarCacaPalavras(){

    }

    public JogarCacaPalavras(Pontos pontos){
        this.pontos = pontos;
    }

    public void jogar() {
        String palavras[] ={"jesus","corre", "mnadioca", "lula"};

        int tamanho = 10;
        String palavraselecionada = "";
        
        char tabuleiro[][] = new char [tamanho][tamanho];   
        
        MetodosDeControleTabuleiro manipuladores = new MetodosDeControleTabuleiro();

        manipuladores.preencherTabuleiro(tabuleiro);
        palavraselecionada = manipuladores.selecionarPalavra(palavras);
        manipuladores.posicionadorX(tamanho, palavraselecionada, tabuleiro);
        manipuladores.imprimirTabuleiro(tabuleiro);


    
        
        while(true){
            if (pontos.getJogador() != null) {
                System.out.println("Sua pontuação é de "+ pontos.getPontos()+"\n");;
            }
            System.out.println("Digite a palavra encontrada corretamente\nDigite 1 para dica\nDigite 2 para desistir\n");
            String entrada = Main.scanner.nextLine();
        
            if(entrada.equals("1")){

                manipuladores.dica(palavraselecionada);

                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-5);
                    System.out.println("Você perdeu 5 pontos");
                    System.out.println(pontos.getJogador().getNome()+": "+pontos.getPontos());
                        
                }

            }else if(entrada.equals("2")){

                System.out.println("você Desistiu e será posicionado no menu anterior\n");

                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-pontos.getPontos());
                    System.out.println("Sua pontuação foi perdida: "+pontos.getPontos()+" pontos\n");
                }  
                break;
                

            }else if(entrada.equals(palavraselecionada)){

                System.out.println("Meus Parabéns!! "+pontos.getJogador().getNome()+"\nVocê Ganhou com: "+pontos.getPontos()+" pontos\n\nVocê será reposicionado ao menu anterior\n");
                
                break;
                
            }else{

                System.out.println("Entrada inválida\n");

                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-10);
                    System.out.println("Você perdeu 10 pontos\n");

                    System.out.println(pontos.getJogador().getNome()+": "+pontos.getPontos()+" pontos");
                }
            }

        }

        
        
    }
    
}
