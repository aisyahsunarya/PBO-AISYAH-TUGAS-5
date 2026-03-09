/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal1Genap {

    // PROSES + OUTPUT:
    // Method prosedur untuk menampilkan teks sebanyak n kali
    static void tampilkanTeks(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". Saya senang belajar bahasa Java");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT:
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        // PROSES:
        if (n > 0) {
            tampilkanTeks(n);
        } else {
            // OUTPUT:
            System.out.println("Nilai N harus lebih dari 0.");
        }

        input.close();
    }
}
