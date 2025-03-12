
import java.util.Scanner;

class Membangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta masukan dari user
        System.out.print("Masukkan nama barang  : ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan jumlah       : ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan harga        : ");
        double harga = input.nextDouble();

        // Membuat objek Barang menggunakan data input
        Barang barang = new Barang(namaBarang, jumlah, harga);

        // Menampilkan output
        System.out.println("\nBarang apa yang diinput?");
        System.out.println(barang.toString());

        input.close();
    }
}