/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class ProjectTitik {
    public static void main(String[] args) {
        Titik Objek = new Titik ();
        Menu mathMenu = new Menu();
        do {
            mathMenu.menuPilihan();
            switch (mathMenu.pilihan){
                case 1 :  
                    Objek.inisialisasiTitik();
                    break;
                case 2 : 
                    Objek.tampilTitik();
                    break;
                case 3 :
                    Objek.perkalianSkalar();
                    break;
                case 4 : 
                    Objek.pencerminanSumbuX();
                    break;
                case 5 :
                    Objek.pencerminanSumbuY();
                    break;
                case 6 : 
                    System.out.println("Jarak = " + Objek.jarak());
                    break;
                case 0 :
                    System.out.println("Anda Surender");
                    break;
                default :
                    System.out.println("Pilihan Anda Salah");
                    break;
            }
        }while(mathMenu.pilihan!=0);
    }
}
