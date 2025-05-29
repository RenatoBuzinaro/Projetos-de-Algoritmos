package main.descoberta;

import main.jogador.Pontos;

public class JogarJogoDaDescoberta {

 private Pontos pontos;
 public JogarJogoDaDescoberta(){
        
    }

    public JogarJogoDaDescoberta(Pontos pontos){
        this.pontos = pontos;
    }

    MetodosDeControle tratamento = new MetodosDeControle();
    String palavras[] = {"computador","mouse","monitor","casa","louro","morte"};

    String palavraSelecionada = tratamento.selecionarPalavra(palavras);
    String palavraEmabaralhada = tratamento.embaralhar(palavraSelecionada);
    

    public void jogar(){

        System.out.println("Qual a palavra: "+palavraEmabaralhada+"?");

        int tentativas = 0;

        
        while(true){

            if (pontos.getJogador() != null) {
                System.out.println("Sua pontuação é de "+ pontos.getPontos()+"\n");;
            }
            System.out.println("informe a palavra, 'dica' para receber uma dica ou '0' para desistir\n");
            
            String entrada = main.Main.scanner.nextLine();
            if (entrada.equals("0")){
                System.out.println("vocé perdeu, desistiu com "+ tentativas+" tentativa(s)\n");
                
                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-pontos.getPontos());
                    System.out.println("Sua pontuação foi perdida: "+pontos.getPontos()+"\n");
                } 
                System.out.println("Você voltará ao menu anterior\n");
                break;
            }else if(entrada.equals("dica")){

                tratamento.dica(palavraSelecionada);

                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-5);
                    System.out.println("Você perdeu 5 pontos");
                    System.out.println(pontos.getJogador().getNome()+": "+pontos.getPontos()+" pontos");
                        
                }

                continue;

            }else if(entrada.equals(palavraSelecionada)){
                tentativas++;
                System.out.println("Você acertou com "+tentativas+" tentativa(s)\n");

                if (pontos.getJogador() != null) {

                    System.out.println("Meus Parabéns!! "+pontos.getJogador().getNome()+"\nVocê Ganhou com: "
                    +pontos.getPontos()+" pontos\n\nVocê será reposicionado ao menu anterior\n");
                }  

                System.out.println("Você voltará ao menu anterior\n");
                break;

            }else{
                System.out.println("Você errou, tente novamente\n");

                if (pontos.getJogador() != null) {

                    pontos.setPontos(pontos.getPontos()-10);
                    System.out.println("Você perdeu 10 pontos\n");

                    System.out.println(pontos.getJogador().getNome()+": "+pontos.getPontos());
                }

                tentativas++;
            }
            
        }
    }   

}
