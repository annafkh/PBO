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
import pbo6.transaksilaundry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class mainclass{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        laundry master = new laundry("", "", 0);
        transaksilaundry trans = new transaksilaundry("", "", 0, "", "", "", "", 0);
        String jenis, nama, kode, metode, tglCuci, tglAmbil;
        int harga, berat;
        do {
            System.out.println("--- Laundry Ex ---");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.println("Masukkan pilihan menu: ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1. Menu Master");
                    System.out.println("Entri jenis cucian: ");
                    jenis = br.readLine();
                    System.out.println("Entri harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.println("Entri metode: ");
                    metode = br.readLine();
                    master = new laundry(jenis, metode, harga);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Menu Transaksi");
                    System.out.println("Entri kode: ");
                    kode = br.readLine();
                    System.out.println("Entri nama: ");
                    nama = br.readLine();
                    System.out.println("Entri jenis cuci \n Cuci Setrika/Cuci Kering: ");
                    jenis = br.readLine();
                    System.out.println("Entri metode (reguler/express): ");
                    metode = br.readLine();
                    System.out.println("Entri berat: ");
                    berat = Integer.parseInt(br.readLine());
                    System.out.println("Entri tanggal cuci: ");
                    tglCuci = br.readLine();
                    System.out.println("Entri tanggal ambil: ");
                    tglAmbil = br.readLine();
                    trans = new transaksilaundry(jenis, metode, master.getHarga(), kode, nama, tglCuci, tglAmbil, berat);
                    break;
                case 3:
                    System.out.println("---3. Menu Cari Data---");
                    System.out.println("Entri kode transaksi yang dicari : ");
                    kode = br.readLine();
                    if (trans.getKode() != null && kode.equalsIgnoreCase(trans.getKode())) {
                        trans.transaksi(kode);
                    } else {
                        System.out.println("Data tidak ada");
                    }
                    break;
                default:
                    System.exit(0);
            }
        } while(true);
    }
}