public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1
        Hewan hewan1 = new Hewan();
        hewan1.nama  = "Kudanil";
        hewan1.jenis = "Herbivora";
        hewan1.suara = "HOAAAK";

        // Membuat objek hewan2
        Hewan hewan2 = new Hewan();
        hewan2.nama  = "Tikus";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Mana Duit Bansos ya ?";


        // Membuat objek hewan3
        Hewan hewan3 = new Hewan();
        hewan3.nama  = "Ular";
        hewan3.jenis = "Mamalia";
        hewan3.suara = "Mana Duit Bansos ya ?";

        // Memanggil metode tampilkanInfo() untuk masing-masing objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}