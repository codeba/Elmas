package patika;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("basamak sayısını giriniz:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
            for (int h = n; h >= 1; h--) {
                for (int l = (n - h); l >= 1; l--) {
                    System.out.print(" ");
                }
                for (int m = (2 * h) - 1; m >= 1; m--) {
                    System.out.print("*");

                }
                System.out.println();


            }
        }
    }}
