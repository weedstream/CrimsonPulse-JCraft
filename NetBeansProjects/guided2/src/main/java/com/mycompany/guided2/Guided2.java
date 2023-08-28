/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guided2;

/**
 *
 * @author badnoby
 */
import java.text.DecimalFormat;
public class Guided2 {

    public static void main(String[] args) {
        Pegawai pgw;
        //Membuat objek referensi dari kelas abstrak //Pegawai
        String output = "";
        Direktur d = new Direktur("Wahyu", 12000000.00, 7500000.00);
        DecimalFormat digitPresisi = new DecimalFormat("0.00");
        pgw = d;
        /*objek referensi dari kelas abstrak pegawai (pgw) merefer objek
        dari kelas Direktur (d) yang diturunkan dari kelas abstrak
        pegawai */
        System.out.println("\nDEMO INHERITANS, ENKAPSULASI,POLIMORFI");
        System.out.println("-----------------------------------\n");
        // Mencetak informasi Direktur ke console
        System.out.println("Nama : " + d.namaPegawai() + "\n" +
        "Jabatan : " + d.jabatan() + "\n" + "Gaji : " +
        digitPresisi.format(d.gajiPerBulan()) + "\n" +
        "Dividen : " + digitPresisi.format(d.labaDividen())+ "\n" +
        "Total : " + digitPresisi.format(d.income()) + "\n");
        System.exit( 0 );
    }
}
