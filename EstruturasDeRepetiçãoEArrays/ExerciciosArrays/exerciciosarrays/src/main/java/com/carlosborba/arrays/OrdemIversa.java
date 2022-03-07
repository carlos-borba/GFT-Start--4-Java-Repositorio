package com.carlosborba.arrays;

/*
Crie um vetor e 6 numeros inteiros e mostre a ordem inversa.
*/

public class OrdemIversa {
    public static void main(String[] args) {
        int [] vetor = {1,2,3,4,5,6};
        int count=0;

        while(count < (vetor.length)){
            System.out.printf("%d ", vetor[count]);
            count++;
        }

        System.out.println();
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.printf("%d ", vetor[i]);
        }
    }
}
