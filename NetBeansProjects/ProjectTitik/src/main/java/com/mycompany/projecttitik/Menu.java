/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecttitik;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
import java.util.Scanner;
public class Menu {
    public int pilihan = 0;
    public int menuPilihan(){
        Scanner cin = new Scanner(System.in);
        System.out.println("1. Inisial Titik");
        System.out.println("2. Tampil Titk");
        System.out.println("3. Perkaliahan Skalar Titk");
        System.out.println("4. Pencerinan Terhadap Sumbuh X");
        System.out.println("5. Pencerinan Terhadap Sumbuh y");
        System.out.println("6. Jarak Antar Dua Titik");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("Masukan Pilihan Anda : ");
        this.pilihan = cin.nextInt();
        return this.pilihan;
    }
}
