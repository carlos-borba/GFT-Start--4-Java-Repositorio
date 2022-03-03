package carlos.borba;
/*
Desenvolva um gereador de tabuada,
capaz de gerar a tabuada de qualquer número entre 1 e 10.
O usuário deve informar de qualquer número que ele deseja ver a tabuada.

*/
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;

        System.out.println("Gerar tabuada do número: ");
        numero = s.nextInt();
        System.out.println("Tabela do "+numero+ ":");
        for (int i =0; i<=10; i++){
            int produto = numero*i;
            // System.out.println(numero+" x "+i+ " = "+produto);
            System.out.printf("%d x %d = %d\n", numero, i, produto);
        }
        s.close();
    }
}
