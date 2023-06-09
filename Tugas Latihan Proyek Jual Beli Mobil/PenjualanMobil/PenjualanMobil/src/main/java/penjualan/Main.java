/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import barang.Mobil;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PenjualanMobil penjualanMobil = new PenjualanMobil();

        // Tambah mobil ke dalam daftar
        Mobil mobil1 = new Mobil("BMW", "Z4", 2008, 2000000000);
        penjualanMobil.beliMobil(mobil1);

        Mobil mobil2 = new Mobil("Jeep", "Wrangler JL", 2017, 2100000000);
        penjualanMobil.beliMobil(mobil2);

        // Cari mobil berdasarkan merek
        List<Mobil> hasilPencarian = penjualanMobil
            .cariMobilBerdasarkanMerek("BMW");
        for (Mobil mobil : hasilPencarian) {
            System.out.println("Merek: "+  mobil.getMerek() + "\nModel:  " 
                + mobil.getModel());
        }

        // Hapus mobil dari daftar
        double hargaJualMobil = mobil2.getHarga() + 5000000; // Harga jual mobil di atas harga awal
        penjualanMobil.jualMobil(mobil2, hargaJualMobil);

        // Tampilkan nilai modal dan aset
        System.out.printf("Modal: " +"%f", penjualanMobil.getModal());
        System.out.println();
        System.out.printf("Aset: " +"%f", penjualanMobil.getNilaiAsset());
    }
}
