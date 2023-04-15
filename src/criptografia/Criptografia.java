package criptografia;

import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, tamCodif, posAfbt, rotacoes;
        do {
            System.out.print("Informe a quantidade de rotações: ");
            rotacoes = ler.nextInt();
        } while (rotacoes <= 0);

        System.out.print("Insira um texto: ");
        ler.nextLine();
        String texto = ler.nextLine();

        tamCodif = texto.length();
        int codificado[] = new int[tamCodif];

        for (i = 0; i < texto.length(); i++) {
            codificado[i] = texto.charAt(i);
            if (codificado[i] >= 65 && codificado[i] <= 90) {
                posAfbt = codificado[i] + rotacoes;
                if (posAfbt > 90) {
                    do {
                        posAfbt = posAfbt - 26;
                    } while (posAfbt > 90);
                }
                codificado[i] = posAfbt;
            }

            if (codificado[i] >= 97 && codificado[i] <= 122) {
                posAfbt = codificado[i] + rotacoes;
                if (posAfbt > 122) {
                    do {
                        posAfbt = posAfbt - 26;
                    } while (posAfbt > 122);
                }
                codificado[i] = posAfbt;
            }
        }
        for (int j = 0; j < texto.length(); j++) {
            System.out.printf("%c", codificado[j]);
        }
    }
}