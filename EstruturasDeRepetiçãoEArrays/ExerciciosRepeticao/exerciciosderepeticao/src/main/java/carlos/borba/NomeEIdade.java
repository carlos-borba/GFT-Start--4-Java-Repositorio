package carlos.borba;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome;
        int idade =0;

        while (true){
            System.out.println("Digite o seu nome: ");
            nome = s.next();
            if (nome.equals("0")) break;
            System.out.println("Digite sua idade:");
            idade = s.nextInt();
        }
        s.close();
        System.out.println(idade);
    }
}
