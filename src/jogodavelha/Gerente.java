package jogodavelha;

public class Gerente {
    private final Interface umaI;
    private final Tabuleiro tabuleiro;
    
    
    Gerente(){
        this.umaI = new Interface();
        this.tabuleiro = new Tabuleiro();
    }
    
    void iniciarRodada(){
        this.umaI.apresentarJogo();
        
        String[][] valor = this.tabuleiro.retorneTabuleiro();
        this.umaI.mostrarTabuleiro(valor);
        int c = this.tabuleiro.jogaJogadores();
        this.umaI.mostrarProximoJogador(c);
       
        
        
        
        
        /*this.tabuleiro.retornarTabuleiro();*/
    }
    
}
