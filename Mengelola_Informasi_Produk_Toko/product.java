package Mengelola_Informasi_Produk_Toko;

public class product {
    private String namaProduk;
    private double harga;
    private int stok;

    public void Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void printProductionInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + String.format("%,.0f", harga));
        System.out.println("Stok: " + stok);
    }
}
