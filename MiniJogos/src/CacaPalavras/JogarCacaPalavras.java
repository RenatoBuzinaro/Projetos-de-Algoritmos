package CacaPalavras;
import Main.App;
public class JogarCacaPalavras {
    
    public void jogar() {
        String palavras[] ={"jesus","corre", "mnadioca", "lula"};
        int tamanho = 10;

        char tabuleiro[][] = new char [tamanho][tamanho];   
        
        Manipuladores.preencherTabuleiro(tabuleiro);
        String palavraselecionada = Manipuladores.selecionarPalavra(palavras);
        Manipuladores.posicionadorX(tamanho, palavraselecionada, tabuleiro);
        Manipuladores.imprimirTabuleiro(tabuleiro);
        
        
        
        while(true){
            System.out.println("Digite a palavra encontrada corretamente\nDigite 1 para dica\nDigite 2 para desistir\n");
            String entrada = App.scanner.nextLine();
        
            if(entrada.equals("1")){
                Manipuladores.dica(palavraselecionada);
            }else if(entrada.equals("2")){
                System.out.println("você Desistiu e será posicionado no menu anterior\n");
                
                break;
            }else if(entrada.equals(palavraselecionada)){
                System.out.println("Você GANHOU, Meus Parabéns!! , Você será reposicionado ao menu anterior\n");
                
                break;
                
            }else{
                System.out.println("Entrada inválida\n");
                continue;
            }
        }
        
    }

}
