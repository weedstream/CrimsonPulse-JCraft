/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectgaji;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
*/
public class Gaji {
    private int NIP;
    private String Nama;
    private String Alamat;
    private int Jumlah;
    private int GajiPokok;
    private double TotalGaji;
    
    public Gaji (){
        this.NIP=0;
        this.Nama="";
        this.Alamat="";
        this.Jumlah=0;
        this.GajiPokok=0;
        this.TotalGaji=0;
    }
    //fungsi mutator
    public void setNIP (int NIP){
        this.NIP=NIP;
    }
    public void setNama (String Nama){
        this.Nama=Nama;
    }
    public void setAlamat (String Alamat){
        this.Alamat=Alamat;
    }
    public void setJumlah (int Jumlah){
        this.Jumlah=Jumlah;
    }
    public void setGajiPokok (int GajiPokok){
        this.GajiPokok=GajiPokok;
    }
    
    //fungsi accesor
    public int getNIP(){
        return this.NIP;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public int getJumlah(){
        return this.Jumlah;
    }
    public int getGajiPokok(){
        return this.GajiPokok;
    }
    public double getTotalGaji(){
        return this.TotalGaji;
    }
    public void HitungTotalGaji(){
        TotalGaji=GajiPokok+(GajiPokok*Jumlah*0.01);
    }
    public void HitungTotalGaji(float Persen){
         TotalGaji=GajiPokok+(GajiPokok*Jumlah*Persen);
    }
    public void display (){
        System.out.println("NIP : "+NIP);
        System.out.println("Nama : "+Nama);
        System.out.println("Alamat : "+Alamat);
        System.out.println("Jumlah : "+Jumlah);
        System.out.println("GajiPokok : "+GajiPokok);
        System.out.println("TotalGaji : "+TotalGaji);
    }
}
