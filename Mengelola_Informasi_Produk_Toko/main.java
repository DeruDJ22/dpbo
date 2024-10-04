package Mengelola_Informasi_Produk_Toko;

public class main {
    public static void main(String[] args) {
        product barang1 = new product();
        product barang2 = new product();
        product barang3 = new product();

        barang1.setNamaProduk("Laptop");
        barang1.setHarga(15000000);
        barang1.setStok(10);

        barang2.setNamaProduk("Mouse");
        barang2.setHarga(150000);
        barang2.setStok(50);

        barang3.setNamaProduk("Keyboard");
        barang3.setHarga(300000);
        barang3.setStok(30);

        productManager manager = new productManager();

        System.out.println("--- Informasi Produk 1 ---");
        manager.tampilkanInformasiProduk(barang1);
        System.out.println(" ");
        System.out.println("--- Informasi Produk 2 ---");
        manager.tampilkanInformasiProduk(barang2);
        System.out.println(" ");
        System.out.println("--- Informasi Produk 3 ---");
        manager.tampilkanInformasiProduk(barang3);
    }
}
