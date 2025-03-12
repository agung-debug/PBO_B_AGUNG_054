 class Barang {
    // Atribut
    private String nama;
    private int jumlah;
    private double harga;

    // Constructor tanpa parameter (opsional)
    public Barang() {
    }

    // Constructor dengan parameter
    public Barang(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk menghitung total harga (jumlah x harga)
    public double getTotal() {
        return jumlah * harga;
    }

    // Metode toString() untuk menampilkan informasi barang
    @Override
    public String toString() {
        return "Nama   : " + nama + "\n" +
                "Jumlah : " + jumlah + "\n" +
                "Harga  : " + harga + "\n" +
                "Total  : " + getTotal();
    }
}