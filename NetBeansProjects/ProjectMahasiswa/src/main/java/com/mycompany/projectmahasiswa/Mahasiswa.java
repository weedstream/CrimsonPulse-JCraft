/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmahasiswa;

/**
 *
 * @author badnoby
 */
public class Mahasiswa {
    private int nim;
    private String nama;
    private String prodi;
    
    public Mahasiswa() {}
    
    public Mahasiswa (int nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    public int getNim () {
        return nim;
    }
    
    public String getNama () {
        return nama;
    }
    
    public String getProdi () {
        return prodi;
    }
    
    public void getNim (int nim) {
        this.nim = nim;
    }
    
    public void getNama (String nama) {
        this.nama = nama;
    }
    
    public void getProdi (String prodi) {
        this.prodi = prodi;
    }
    
    public void Tampil () {
        System.out.println("NIM             : "+ nim);
        System.out.println("Nama            : "+nama);
        System.out.println("Prodi           : "+prodi);
    }
}
