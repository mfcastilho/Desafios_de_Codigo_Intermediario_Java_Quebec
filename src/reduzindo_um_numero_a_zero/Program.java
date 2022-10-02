package reduzindo_um_numero_a_zero;

import java.io.IOException;
import java.util.Scanner;

public class Program extends IOException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(new Scanner(System.in).nextLine());
        int step = 0;

        while (x > 0){
            if (x%2==0){
                x = x/2;
                step++;
            }else{
                x = x-1;
                step++;
            }

        }
        System.out.println(step);
    }
}
