/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class ProjectBuku3 {

    public static void main(String[] args) {
        Buku novel,fiksi;
        novel = new Buku();
        fiksi = new Buku();
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Masukan Judul Buku : ");
            novel.setJudul(br.readLine ().toString());
            novel.setPengarang(br.readLine ());
            novel.setInfo(45000);
            System.out.print("Masukkan Jumlah Halaman: ");
            novel.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
            novel.cetak();
            System.out.println();
            System.out.print("Masukkan Judul Buku: ");
            fiksi.setJudul(br.readLine ().toString());
            System.out.print("Masukkan Pengarang: ");
            fiksi.setPengarang(br.readLine ());
            fiksi.setInfo(79000);
            System.out.print("Masukkan Jumlah Halaman: ");
            fiksi.setJmlhHalaman(Integer.parseInt(br.readLine().toString()));
            fiksi.cetak();
        }
        catch(Exception ex)
        {
         System.out.println(ex);
        }
    }
}
