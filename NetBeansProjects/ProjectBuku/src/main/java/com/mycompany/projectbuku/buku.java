/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbuku;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class buku {
    private String judul;
    private String pengarang;
    private int jumlah;
    public void setNilai(String judul,String pengarang,int jumlah) 
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
    }
    void cetakKeLayar()
    {
        System.out.println("Judul : " + judul );
        System.out.println("Pengarang : " + pengarang );
        System.out.println("Jumlah : " + jumlah );
    }
}
