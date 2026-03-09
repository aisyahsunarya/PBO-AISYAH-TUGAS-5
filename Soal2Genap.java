/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal2Genap {

    // PROSES:
    // Method fungsi untuk menghitung jumlah deret bilangan genap
    static int hitungJumlahGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }

        return jumlah;
    }

    // PROSES + OUTPUT:
    // Method prosedur untuk menampilkan deret bilangan genap
    static void tampilkanDeretGenap(int batasAwal, int batasAkhir) {
        boolean adaBilanganGenap = false;

        System.out.print("Deret bilangan genap: ");

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                if (adaBilanganGenap) {
                    System.out.print(" + ");
                }
                System.out.print(i);
                adaBilanganGenap = true;
            }
        }

        if (!adaBilanganGenap) {
            System.out.print("Tidak ada bilangan genap");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT:
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        // PROSES:
        if (batasAwal > batasAkhir) {
            int sementara = batasAwal;
            batasAwal = batasAkhir;
            batasAkhir = sementara;
        }

        int jumlah = hitungJumlahGenap(batasAwal, batasAkhir);

        // OUTPUT:
        tampilkanDeretGenap(batasAwal, batasAkhir);
        System.out.println("Jumlah deret bilangan genap = " + jumlah);

        input.close();
    }
}
