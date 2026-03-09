/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal3Genap {

    // PROSES:
    // Method fungsi untuk menghitung PBB dengan algoritma Euclidean
    static int hitungPBB(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int sisa = a % b;
            a = b;
            b = sisa;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT:
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua (b): ");
        int b = input.nextInt();

        // PROSES:
        int pbb = hitungPBB(a, b);

        // OUTPUT:
        System.out.println("PBB dari " + a + " dan " + b + " adalah " + pbb);

        input.close();
    }
}