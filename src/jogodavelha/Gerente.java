package jogodavelha;

public class Gerente {
    private final Interface umaI;
    private final Tabuleiro tabuleiro;
    private final Jogador1 jogador1;
    private final Jogador2 jogador2;
    
    
    Gerente(){
        this.umaI = new Interface();
        this.tabuleiro = new Tabuleiro();
        this.jogador1 = new Jogador1("Fulano");
        this.jogador2 = new Jogador2("Virtual");
    }
    
    void iniciarRodada(){
        this.umaI.apresentar();
        this.tabuleiro.mostrarTabuleiro();
        
        
    }
    
}
