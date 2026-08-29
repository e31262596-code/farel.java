package Fareljava_j;

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Menampilkan pesan input sesuai contoh output
        System.out.print("Enter Hexadecimal Number : ");
        String hex = input.nextLine().trim();

        try {
            // Mengonversi string heksadesimal ke integer (basis 16)
            int decimal = Integer.parseInt(hex, 16);

            // Mengonversi nilai desimal ke string biner (basis 2)
            String binary = Integer.toBinaryString(decimal);

            // Menampilkan hasil konversi sesuai contoh output
            System.out.println("Equivalent Binary Number is: " + binary);
        } catch (NumberFormatException e) {
            System.out.println("Input bukan angka heksadesimal yang valid!");
        }

        input.close();
    }
}