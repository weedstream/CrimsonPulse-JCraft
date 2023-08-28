/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bukuberaksi;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    public Buku(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public void cetakBuku(){
        System.out.println("Judul = "+this.judul);
        System.out.println("Pengarang = "+this.pengarang);
        System.out.println("Penerbit = "+this.penerbit);
        System.out.println("Tahun = "+this.tahun);
    }
}
