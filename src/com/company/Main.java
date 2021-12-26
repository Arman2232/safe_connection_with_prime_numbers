package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two prime numbers for each users: ");

        System.out.print("N = ");
        int N = scanner.nextInt();
        System.out.print("G = ");
        int G = scanner.nextInt();

        System.out.println("N is prime: " + isPrime(N));
        System.out.println("G is prime: " + isPrime(G));

        boolean checkN = isPrime(N);
        boolean checkG = isPrime(G);

        if (checkN && checkG) {
            System.out.print("Enter X1 for user 1: ");
            int X1 = scanner.nextInt();
            System.out.print("Enter X2 for user 2: ");
            int X2 = scanner.nextInt();

            System.out.println("X1 is prime: " + isPrime(X1));
            System.out.println("X2 is prime: " + isPrime(X2));

            boolean checkX1 = isPrime(X1);
            boolean checkX2 = isPrime(X2);

            if (checkX1 && checkX2) {
                double Y1 = Math.pow(G, X1) % N;
                double Y2 = Math.pow(G, X2) % N;
                System.out.println("Y1: " + Y1);
                System.out.println("Y2: " + Y2);

                double K1 = Math.pow(Y2, X1) % N;
                double K2 = Math.pow(Y1, X2) % N;


                if (K1 == K2){
                    System.out.println("Connected:");
                } else {
                    System.out.println("Dzer zangy kyndhatvi, qani vor dzer hashivy sparvac e: ");
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
