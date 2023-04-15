package oliBobRex;

import java.util.Scanner;

public class OliBobRex {
    static Scanner ler = new Scanner(System.in);
    static int posOli, posRex, posBob;

    public static String distancias(int posOli, int posBob, int posRex){
        int distBob = posOli - posBob;
        int distRex = posOli - posRex;

        if (distRex < 0){distRex *= -1;}
        if (distBob < 0) {distBob *= -1;}

        if (distBob > distRex){
            return "Rex chegou primeiro";
        }else if (distRex > distBob) {
            return "Bob chegou primeiro";
        }else {
            return "Os cães chegaram juntos e Oli conseguiu fugir";
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Por favor, informe apenas valores positivos");
            System.out.print("Informe onde esta o gato, Oli: ");
            posOli = ler.nextInt();
            System.out.print("Onde está o cão Rex? ");
            posRex = ler.nextInt();
            System.out.print("E onde está o cão Bob? ");
            posBob = ler.nextInt();
        }while (posOli < 0 || posRex < 0 || posBob < 0);

        String posicoes[] = new String[10];
        for (int i = 0; i<posicoes.length; i++){
            if (i==posOli){
                posicoes[i] = "O";
            } else if (i==posRex) {
                posicoes[i] = "R";
            } else if (i==posBob) {
                posicoes[i] = "B";
            } else {
                posicoes[i] = "_";
            }
            System.out.print(posicoes[i]);
        }

        String vencedor = distancias(posOli, posBob, posRex);
        System.out.println("\n"+vencedor);

    }
}
