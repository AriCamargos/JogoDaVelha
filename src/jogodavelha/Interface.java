package jogodavelha;

import java.util.Scanner;

public class Interface {
    
    void apresentarJogo(){
        System.out.println("# Bem vindo ao Jogo da Velha #\n");
        
    }
    
    void mostrarTabuleiro(String[][] v){
        
    }
    
    int mostrarProximoJogador(int c){
        Scanner in = new Scanner(System.in);
        System.out.println("Jogador 1, informe sua posição: ");
        c = in.nextInt();
        return 0;
        
        
    }
    void mostrarVencedor(){
        
    }
}
