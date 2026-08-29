package Fareljava_i;

import java.util.Scanner;

public class OktalKeBiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan input sesuai contoh output tugas
        System.out.print("Input any octal number: ");
        String octalString = scanner.nextLine();

        try {
            // Mengubah string oktal (basis 8) menjadi integer
            int decimal = Integer.parseInt(octalString, 8);

            // Mengubah integer decimal menjadi string biner (basis 2)
            String binaryString = Integer.toBinaryString(decimal);

            // Menampilkan hasil konversi
            System.out.println("Equivalent binary number: " + binaryString);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid! Pastikan hanya memasukkan angka oktal (0-7).");
        }

        scanner.close();
    }
}