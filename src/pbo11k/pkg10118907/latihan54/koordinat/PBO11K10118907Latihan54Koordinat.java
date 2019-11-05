/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan54.koordinat;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan koordinat
 * 
 */
public class PBO11K10118907Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat("Jingga", 10, 9);
        System.out.println("Warna Koordinat : "+wk.getNamaWarna());
        System.out.println("Koordinat sumbu x : "+wk.getX()+", y : "+wk.getY());
    }
    
}
