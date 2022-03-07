package com.carlosborba.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] aleatorio = new int[20];

        // System.out.println("Aleatorios");
        for (int i = 0; i<aleatorio.length;i++){
            int num = random.nextInt(100);
            aleatorio[i] = num;
        }

        System.out.println("\nAleatorios: ");
        for (int num: aleatorio){
            System.out.print(num +  " ");
        }

        System.out.println("\nAleatorios + 1: ");
        for (int num: aleatorio){
            System.out.print((num+1) +  " ");
        }

        System.out.println("\nAleatorios - 1: ");
        for (int num: aleatorio){
            System.out.print((num-1) +  " ");
        }
    }
}
