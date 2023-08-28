/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sepedaberaksi;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class SepedaBeraksi {

    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1);
        System.out.println("Gir saat ini: "+sepedaku.getGir());
        sepedaku.setGir(3);
        System.out.println("Gir saat ini: "+sepedaku.getGir());
    }
}
