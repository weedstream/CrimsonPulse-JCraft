/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class ProjectGaji {

    public static void main(String[] args) {
        Gaji Pegawai = new Gaji();
        Pegawai.setNIP(21103071);
        Pegawai.setNama("Fauzi");
        Pegawai.setAlamat("Purwokerto");
        Pegawai.setJumlah(1);
        Pegawai.setGajiPokok(2500000);
        Pegawai.HitungTotalGaji();
        Pegawai.display();
        
        Gaji Gubernur = new Gaji();
        Pegawai.setNIP(123456);
        Pegawai.setNama("Fauzi");
        Pegawai.setAlamat("Purwokerto");
        Pegawai.setJumlah(1);
        Pegawai.setGajiPokok(3000000);
        Pegawai.HitungTotalGaji(0.05f);
        Pegawai.display();
    }
}
