public class Main {

    public static void main(String[] args) {

        // Deklarasi variabel
        int a, b, temp;
        a = 15;
        b = 27;

        // Menampilkan nilai sebelum ditukar
        System.out.println("Before swapping : a, b = " + a + ", " + b);

        // Proses penukaran nilai menggunakan variabel sementara (temp)
        temp = a;
        a = b;
        b = temp;

        // Menampilkan nilai setelah ditukar
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}