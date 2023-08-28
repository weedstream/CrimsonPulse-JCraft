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
public class CD {
    String ukuran;
    long hargaCD;
    public CD(String ukuran,long hargaCD)
    {
        this.ukuran=ukuran;
        this.hargaCD=hargaCD;
    }
    public long getHargaCD()
    {
        return hargaCD;
    }
    public void cetakCD()
    {
        System.out.println("Ukuran CD : "+ukuran);
        System.out.println("Harga CD : Rp "+hargaCD);
        System.out.println();
    }
}
