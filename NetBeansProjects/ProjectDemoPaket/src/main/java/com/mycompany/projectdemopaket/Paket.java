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
public class Paket extends Buku implements InterfaceCD {
    long hargaPaket;
    InterfaceCD interfaceCD;
    public Paket(String judul,String pengarang,long hargaBuku,String ukuran,long hargaCD)
    {
        super(judul,pengarang,hargaBuku);
        interfaceCD = new ChildCD(ukuran,hargaCD);
    }
    public void hitungHargaPaket()
    {
        hargaPaket=super.hargaBuku + getHargaCD();
    }
    public void cetakCD()
    {
        interfaceCD.cetakCD();
    }
    public long getHargaCD()
    {
        return (interfaceCD.getHargaCD());
    }
    public void cetakPaket()
    {
        super.cetakBuku();
        cetakCD();
        System.out.println("Harga paket Buku dan CD: Rp "+ hargaPaket +"\n");
    }
}
