/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobilkonstruktor;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class Mobil {
    String warna;
    int tahunProduksi;
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info(){
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahunProduksi);
    }
}
