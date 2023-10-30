import java.util.Scanner;

/**
 * Program ini digunakan untuk menghitung luas dan volume tabung
 * berdasarkan jari-jari alas dan tinggi tabung yang dimasukkan oleh pengguna.
 */
public class Main {

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        double r, t; // Variabel untuk jari-jari alas dan tinggi tabung.
        final double PHI = 3.14; // Konstanta nilai phi (π).
        double luasTabung, volTabung; // Variabel untuk luas dan volume tabung.

        Scanner scanInput = new Scanner(System.in);

        System.out.println("PROGRAM MENGHITUNG LUAS & VOLUME TABUNG");
        System.out.print("Jari-jari alas: ");
        r = scanInput.nextDouble();
        System.out.print("Tinggi tabung: ");
        t = scanInput.nextDouble();

        // Menghitung luas dan volume tabung.
        luasTabung = 2 * (PHI * r * r) + (2 * PHI * r * t);
        volTabung = (PHI * r * r) * t;

        System.out.println("Luas Tabung = " + luasTabung);
        System.out.println("Volume Tabung = " + volTabung);
    }
}
