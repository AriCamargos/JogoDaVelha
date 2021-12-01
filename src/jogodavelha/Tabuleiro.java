package jogodavelha;

public class Tabuleiro {
    public String[][] v  = {{"1","2","3"},
                            {"4","5","6"},
                            {"7","8","9"}};
    public int proximo;
    public boolean terminou;
    
    Tabuleiro() {
        this.proximo = proximo;
        this.terminou = terminou;
    }

    
    //A vez do jogador
    public int jogaJogadores(){ 
        String posicao = null;
        if(!this.validarJogada(posicao)){
            return this.proximo;
        }
        if(this.validarJogada(posicao)){
            this.executaJogada("X", posicao); 
        }
        return 1;
    }
    
    //Informando as posições
    public void executaJogada(String jogador, String posicao){
        if(posicao.equals("1"))
            v[0][0] = jogador;
        if(posicao.equals("2"))
            v[0][1] = jogador;
        if(posicao.equals("3"))
            v[0][2] = jogador;
        if(posicao.equals("4"))
            v[1][0] = jogador;
        if(posicao.equals("5"))
            v[1][1] = jogador;
        if(posicao.equals("6"))
            v[1][2] = jogador;
        if(posicao.equals("7"))
            v[2][0] = jogador;
        if(posicao.equals("8"))
            v[2][1] = jogador;
        if(posicao.equals("9"))
            v[2][2] = jogador;
    }
    
    
    public void limpaTabuleiro(){
        
    }
    
    public String[][] retorneTabuleiro(){
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.printf("   " + v[linha][coluna]);
            }
            System.out.println("\n");
        } 
          
        return null;
        
    }
    
    public String checandoTabuleiro(int jogadas){
        String[] JV = new String[8];
        String vencedor = "null";
        
        if(jogadas == 9){
            vencedor = "EMPATE";
        }
        //Validando se venceu nas horizontais
        JV[0] = v[0][0] + v[0][1] + v[0][2];
        JV[1] = v[1][0] + v[1][1] + v[1][2];
        JV[2] = v[2][0] + v[2][1] + v[2][2];
        
        
        JV[3] = v[0][0] + v[1][0] + v[2][0];
        JV[4] = v[0][1] + v[1][1] + v[2][1];
        JV[5] = v[0][2] + v[1][2] + v[2][2];
        
        JV[6] = v[0][0] + v[1][1] + v[2][2];
        JV[7] = v[0][2] + v[1][1] + v[2][0];
        
        for (String JV1 : JV) {
            if (JV1.equals("XXX")) {
                vencedor = "Jogador 1";
            } else if (JV1.equals("OOO")) {
                vencedor = "Jogador 2";
            }
        }
        return vencedor;
        
    }
    
    public boolean validarJogada(String posicao){
        for(int linha=0; linha<3;linha++){
            for(int coluna =0; coluna<3; coluna++){
                if(v[linha][coluna].equals(posicao))
                    return true;
            }
        }
        return false;
    }

}
