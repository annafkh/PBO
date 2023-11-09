/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6;

/**
 *
 * @author annafifakhruddin
 */
import pbo6.laundry;

public class transaksilaundry extends laundry {
    private String kode, namaPelanggan, tglCuci, tglAmbil;
    private static final int BIAYA_EXPRESS = 5000;
    private int berat;
    public transaksilaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    public String getKode() {
        return kode;
    }
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    public String getTglCuci() {
        return tglCuci;
    }
    public String getTglAmbil() {
        return tglAmbil;
    }
    public int getBerat() {
        return berat;
    }
    public int getTotal(){
        return getBerat() * super.getHarga();
    }
    public void transaksi(){
        System.out.println("Nama pelanggan: " +getNamaPelanggan());
        System.out.println("Jenis cuci: " +getJenisCuci());
        System.out.println("Metode (Reguler/Express): " +getMetode());
        System.out.println("Harga jasa: " +getHarga());
        System.out.println("Tanggal cuci: " +getTglCuci());
        System.out.println("Tanggal ambil: " +getTglAmbil());
        System.out.println("Berat cucian: " +getBerat());
        System.out.println("Sub Total: " +getTotal()); 
        System.out.println("Total: " +cuciExpress());
    }
    public void transaksi(String kode){
        System.out.println("Nama pelanggan: " +getNamaPelanggan());
        System.out.println("Jenis cuci: " +getJenisCuci());
        System.out.println("Metode (Reguler/Express): " +getMetode());
        System.out.println("Harga jasa: " +getHarga());
        System.out.println("Tanggal cuci: " +getTglCuci());
        System.out.println("Tanggal ambil: " +getTglAmbil());
        System.out.println("Berat cucian: " +getBerat());
        System.out.println("Sub Total: " +getTotal());
        System.out.println("Total: " +cuciExpress());
    }
    @Override
    public int cuciExpress() {
        int total = getTotal();
        if (getMetode().equalsIgnoreCase("express")) {
            total += BIAYA_EXPRESS;
        }
        return total;
    }
}