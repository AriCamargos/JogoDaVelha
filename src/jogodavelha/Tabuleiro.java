package jogodavelha;

public class Tabuleiro {
    private final int[][] tabuleiro = new int[3][3];
    
    Tabuleiro(){
        limparTabuleiro();
    }
    
    void mostrarTabuleiro(){
        
    }
    
    void checarColunas(){
        for(int coluna=0; coluna <3; coluna++){
        }
    }
    
    void checarLinhas(){
        
    }
    
    void checarDiagonais(){
        
    }
    
    void limparTabuleiro(){
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; linha<3; linha++){
                tabuleiro[linha][coluna]=0;
            }
        }
        
    }
    
    void reeiniciaPartida(){
        
    }
    
    
    
    
}
