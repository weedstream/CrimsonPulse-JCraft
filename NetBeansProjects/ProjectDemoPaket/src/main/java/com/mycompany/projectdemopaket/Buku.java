/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdemopaket;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
SI05C
*/
public class Buku {
    String judul,pengarang;
    long hargaBuku;
    public Buku(String judul,String pengarang,long hargaBuku)
    {
        this.judul=judul;
        this.pengarang=pengarang;
        this.hargaBuku=hargaBuku;
    }
    public void cetakBuku()
    {
        System.out.println("\nJudul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Harga Buku: Rp "+hargaBuku);
        System.out.println();
    }
}
