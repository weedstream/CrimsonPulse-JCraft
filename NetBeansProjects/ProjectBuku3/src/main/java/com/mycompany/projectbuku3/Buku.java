/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbuku3;
import java.io.*;
/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
*/
public class Buku {
    //atributes
    private String pengarang;
    private String judul;
    private int jmlh_Halaman;
    private float diskon;
    private double harga;
    //methods
    public Buku()
    {   //constructor
        System.out.println("Konstruktor buku dijalankan..."); }
        //fungsi-fungsi mutator
        public void setPengarang(String Pengarang) {
            pengarang=Pengarang; }
        public void setJudul(String Judul)
        {
            judul=Judul; }
        public void setJmlhHalaman(int JmlhHalaman) {
            jmlh_Halaman = JmlhHalaman; }
        //fungsi-fungsi accessor public 
        String getPengarang() {
            return pengarang;
        }
        public String getJudul()
        {
            return judul;
        }   
        public int getJmlhHalaman()
        {
            return jmlh_Halaman;
        }
        //method overloading
        public void setInfo(float dskn, double HargaBuku) {
            diskon=dskn; harga=HargaBuku-(HargaBuku*diskon);
        }
        public void setInfo(double HargaBuku)
        {
            diskon=0.1F; harga=HargaBuku-(HargaBuku*diskon);
        }
        public void cetak() {
            System.out.println("Judul Buku              : "+getJudul());
            System.out.println("Pengarang Buku          : "+getPengarang());
            System.out.println("Jumlah halaman Buku     : "+getJmlhHalaman()+" halaman");
            System.out.println("Diskon Buku             : "+diskon);
            System.out.println("Harga Buku              : "+harga);
            System.out.println("");
        }
}
