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
public class Satpam extends Pegawai {
    protected int JamLembur;
    final protected int BonusPerjam = 10000;
    protected int Bonus;
        
    public Satpam(String Nama,String NIP, String Alamat, int TahunKerja, int GajiPokok, int JamLembur){
        super(Nama, NIP, Alamat, TahunKerja, GajiPokok);
        this.JamLembur = JamLembur;
        
        Bonus = HitungBonus();
        GajiAkhir = super.HitungGajiAkhir(Bonus);
    }
    private int HitungBonus(){
        return BonusPerjam * JamLembur;
    }
    public void CetakSatpam(){
        System.out.println("Satpam");
        super.CetakPegawai();
        System.out.println("Jam Lembur : " + JamLembur);
        System.out.println("Bonus Perjam : " + BonusPerjam);
        System.out.println("Bonus : " + Bonus);
        System.out.println("Total Gaji :" + GajiAkhir);

    }
}
