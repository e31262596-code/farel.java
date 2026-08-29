package konstanta;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Deklarasi konstanta
        final double PI = 3.14159;

        // Deklarasi variabel jari2 dan luas
        int jari2;
        double luas;

        // Memberi nilai awal ke variabel jari2
        jari2 = 7;

        // Menghitung luas lingkaran
        luas = PI * jari2 * jari2;

        System.out.println("Jari-jari lingkaran = " + jari2);
        System.out.println("\nLuas lingkaran = " + luas);
    }
}