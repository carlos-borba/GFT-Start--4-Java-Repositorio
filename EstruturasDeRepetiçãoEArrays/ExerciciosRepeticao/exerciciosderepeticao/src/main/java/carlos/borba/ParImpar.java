package carlos.borba;

import java.util.Scanner;

/*
Faça um programa que peça N números,
mostre a quantidade de pare e de ímpares
*/
public class ParImpar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, num;
        int par = 0;
        int impar=0;

        System.out.println("Digite quantos números serão recebidos: ");
        n = s.nextInt();
        int count = 0;
        do {
            System.out.println("Número: ");
            num = s.nextInt();
            if (num%2==0) par++;
            else impar++;
            
            count++;
        }while(count<n);

        System.out.println("Quantidades Par: "+par);
        System.out.println("Quantidades Ímpar: "+impar);
        s.close();
    }
}
