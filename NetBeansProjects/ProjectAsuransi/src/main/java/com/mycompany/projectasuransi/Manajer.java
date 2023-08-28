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
public class Manajer extends Pegawai {
    protected String Divisi;
    protected float TunjanganJabatan;
    protected float PersentaseTunjangan;
    protected int LamaKerja;
    
    
    public Manajer(String Nama,String NIP, String Alamat, int TahunKerja, int GajiPokok, String Divisi)
    {
        super(Nama, NIP, Alamat, TahunKerja, GajiPokok);
        this.Divisi = Divisi;
        this.LamaKerja = 2015 - TahunKerja;
        if (this.LamaKerja >= 3 && this.TahunKerja <= 5 ) PersentaseTunjangan = 0.05f;
        if (this.LamaKerja >5) PersentaseTunjangan = 0.1f;
        
        this.TunjanganJabatan = GajiPokok * PersentaseTunjangan;     
        GajiAkhir = super.HitungGajiAkhir( (int)TunjanganJabatan);
        
        
    }
    public void CetakManajer()
    {
        System.out.println("Manajer");
        super.CetakPegawai();
        System.out.println("Divisi : " + Divisi);
        System.out.println("PersentaseTunjangan : " + PersentaseTunjangan * 100);
        System.out.println("Lama Kerja : " + LamaKerja);
        System.out.println("Tunjangan Jabatan : " + TunjanganJabatan);
        System.out.println("Total Gaji :" + GajiAkhir);
    }
}
