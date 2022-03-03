package carlos.borba;

import java.util.Scanner;

/*
Calcule o fatorial de um numero fornecido pelo usuário.
*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int multiplicacao = 1;

        System.out.println("Fatorial: ");
        int fatorial = s.nextInt();

        System.out.printf("%d! =", fatorial);
        for (int i=fatorial; i>=1;i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
