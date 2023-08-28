/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectasuransi;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
SI05C
*/
public class Sales extends Pegawai {
    protected int JumlahPelanggan;
    protected int KomisiPerPelanggan = 50000;
    protected int TotalKomisi;
    
    public Sales(String Nama,String NIP, String Alamat, int TahunKerja, int GajiPokok, int JumlahPelanggan){
        super(Nama, NIP, Alamat, TahunKerja, GajiPokok);
        this.JumlahPelanggan = JumlahPelanggan;
        
        TotalKomisi = KomisiPerPelanggan * JumlahPelanggan;
        GajiAkhir = super.HitungGajiAkhir(TotalKomisi);
    }
    public void CetakSales(){
        System.out.println("Sales");
        super.CetakPegawai();
        System.out.println("Jumlah Pelanggan : " + JumlahPelanggan);
        System.out.println("Komisi PerPelanggan : " + KomisiPerPelanggan);
        System.out.println("Total Komisi : " + TotalKomisi);
        System.out.println("Total Gaji : " + GajiAkhir);
        
    }
}
