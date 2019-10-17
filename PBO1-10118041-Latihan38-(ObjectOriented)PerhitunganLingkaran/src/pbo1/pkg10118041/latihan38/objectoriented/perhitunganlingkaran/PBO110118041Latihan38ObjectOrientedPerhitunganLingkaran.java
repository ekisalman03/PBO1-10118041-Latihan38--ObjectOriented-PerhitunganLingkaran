/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan38.objectoriented.perhitunganlingkaran;

/**
 *
 * @author 
 * NAMA     : Eki salman sya'bani
 * KELAS    : IF-1
 * NIM      : 10118041
 * Deskripsi Program : Program ini untuk menampilkan tampilan program 
 *                     perhitungan lingkaran.
 */
public class PBO110118041Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
