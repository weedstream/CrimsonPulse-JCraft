/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.oop_mod1;

/**
 *
 * @author badnoby
 */

/*
FAUZI IRFAN SYAPUTRA
21103071
SI 05 C
*/

public class Oop_mod1 {

    public static void main(String[] args) {
        int juml_looping = 5;
        int bil1 = 5;
        int bil2 = 2;
        
        DemoObjectOriented Demo = new DemoObjectOriented();
        Demo.helloworld(juml_looping);
        System.out.println("\n-Pemanggilan Fungsi Tambah-\n");
        System.out.println("    Hasil   Operasi     Tambah      :" + Demo.tambah(bil1, bil2) + "\n");
    }
}
