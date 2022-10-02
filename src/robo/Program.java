package robo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String movimentos = new Scanner(System.in).nextLine().toUpperCase(Locale.ROOT);
//        System.out.println(movimentos);

        int x = 0;
        int y = 0;
        boolean retorno;

        for (int i = 0; i < movimentos.length(); i++){
            char caractere = movimentos.charAt(i);
            if(caractere == 'W'){
                x++;
            }
            if(caractere == 'S'){
                x--;
            }
            if(caractere == 'D'){
                y++;
            }
            if(caractere == 'A'){
                y--;
            }
        }

        retorno = x == 0 && y == 0;
        System.out.println(retorno);

    }
}
