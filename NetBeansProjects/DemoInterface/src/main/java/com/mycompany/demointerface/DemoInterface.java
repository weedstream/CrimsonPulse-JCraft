/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demointerface;

/**
 *
 * @author badnoby
 */
public class DemoInterface implements Konstanta {

    public static void main(String[] args) {
        System.out.println("\nPROGRAM DEMO INTERFACE");
        System.out.println("--------------------------\n");
        double radius = 10;
        System.out.println("Radius Lingkaran : "+ radius);
        System.out.println("Luas Lingkaran : "+
        (KONST_PI*radius*radius)+KONST_SATUAN_LUAS);
        System.out.println("Keliling Lingkaran: "+
        (2*KONST_PI*radius)+Konstanta.KONST_SATUAN_PANJANG);
        System.out.println();
    }
}
