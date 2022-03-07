package com.carlosborba.arrays;

import java.util.Scanner;

/*
Crie um vetor com 6 caracterres e
diga quantas era, consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] vetor = new String[6];
        int countConsoante = 0;
        int count = 0;
        do {
            System.out.println("Letra:");
            String letra = s.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                        vetor[count]= letra;
                        countConsoante++;
                    }
                    count++;
        } while(count < vetor.length);
        System.out.println("Consoantes: ");
        for(String consoante: vetor){
            if(consoante!=null)
                System.out.print(consoante + " ");
        }
    
        System.out.println("\nqtd: " +countConsoante);
    }   
}
