package Descoberta;
import Main.App;

public class JogarJogoDaDescoberta {
    public void jogar(){

        System.out.println("Seja bem vindo ao jogo da descoberta!\n");

        String palavras[] = {"computador","mouse","monitor","casa","louro","morte"};

        String palavraSelecionada = Tratamento.selecionarPalavra(palavras);
        String palavraEmabaralhada = Tratamento.embaralhar(palavraSelecionada);

        System.out.println("Qual a palavra: "+palavraEmabaralhada+"?");

        int tentativas = 0;
        

        while(true){
            System.out.println("informe a palavra, 'dica' para receber uma dica ou '0' para desistir\n");
            
            String entrada = App.scanner.nextLine();
            if (entrada.equals("0")){
                System.out.println("vocé perdeu, desistiu com "+ tentativas+" tentativa(s)\n");
                

                System.out.println("Você voltará ao menu anterior\n");
                
                break;
            }
            if(entrada.equals("dica")){
                System.out.println("A primeira letra é '"+ palavraSelecionada.charAt(0)+"' e a ultima é '"+palavraSelecionada.charAt(palavraEmabaralhada.length()-1)+"'\n");
                continue;
            }
            if(entrada.equals(palavraSelecionada)){
                tentativas++;
                System.out.println("Você acertou com "+tentativas+" tentativa(s)\n");
                

                System.out.println("Você voltará ao menu anterior\n");
                break;

            }else{
                System.out.println("Você errou, tente novamente\n");
                tentativas++;
            }
            
        }
    }   

}
