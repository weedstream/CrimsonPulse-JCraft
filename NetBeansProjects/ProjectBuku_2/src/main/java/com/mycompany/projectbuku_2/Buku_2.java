/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbuku_2;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class Buku_2 {
    private String judul;
    private String pengarang;
    public Buku_2()
    {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    public Buku_2(String judul,String pengarang)
    {
        System.out.println("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    void cetakKeLayar()
    {
        if(judul==null && pengarang==null)
        return;
        System.out.println("Judul : " + judul );
        System.out.println("Pengarang : " + pengarang );
    }
}
