package carlos.borba;

import java.util.Scanner;

/*
Faça um programa que leia 5 números 
e informe o maior e a média de todos eles
*/

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maior = 0;
        double media = 0;
        int num, i;
        int soma = 0;

        for (i = 0; i<5;i++){
            System.out.println("Digite um número: ");
            num = s.nextInt();
            if (num > maior)
                maior = num;
            soma += num;
        }
        media = soma/i;
        System.out.println("O maior: " + maior);
        System.out.println("A média: "+media);
    }
}
