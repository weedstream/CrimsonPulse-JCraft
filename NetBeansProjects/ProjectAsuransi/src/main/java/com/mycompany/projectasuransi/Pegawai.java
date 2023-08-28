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
public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected String Alamat;
    protected int TahunKerja;
    protected int GajiPokok;
    protected int GajiAkhir;
    
    public Pegawai(String Nama, String NIP, String Alamat, int TahunKerja, int GajiPokok)
    {
        this.Nama = Nama;
        this.NIP = NIP;
        this.Alamat = Alamat;
        this.TahunKerja = TahunKerja;
        this.GajiPokok = GajiPokok;
    }
    protected int HitungGajiAkhir(int Bonus){  
        return GajiPokok + Bonus;
    }
    public void CetakPegawai(){
        System.out.println("NIP         : " + NIP);
        System.out.println("Nama        : " + Nama);
        System.out.println("Alamat      : " + Alamat);
        System.out.println("Tahun Kerja : " + TahunKerja);
        System.out.println("Gaji Pokok  : " +GajiPokok );
        
    }
}
