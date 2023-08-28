/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guided3;

/**
 *
 * @author badnoby
 */
public class Guided3 {

    public static void main(String[] args) {
        System.out.println("DEMO POLIMORFISME");
        System.out.println("=========================");
        EkspresiWajah objEkspresi=new EkspresiWajah();
        Gembira objGembira=new Gembira();
        Sedih objSedih=new Sedih();
        EkspresiWajah[] ekspresi=new EkspresiWajah[3];
        ekspresi[0]=objEkspresi;
        ekspresi[1]=objGembira;
        ekspresi[2]=objSedih;
        System.out.println("Ekspresi[0]:"+ekspresi[0].respons());
        System.out.println("Ekspresi[1]:"+ekspresi[1].respons());
        System.out.println("Ekspresi[2]:"+ekspresi[2].respons());
    }
}
