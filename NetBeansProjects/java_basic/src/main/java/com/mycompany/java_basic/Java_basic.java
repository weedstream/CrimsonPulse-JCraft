/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_basic;

/**
 *
 * @author badnoby
 */
public class Java_basic {
    
    public double hitungDiskon (double totalBelanja, double presentaseDiskon){
        double diskon = 0;
        diskon = totalBelanja * presentaseDiskon;
        return diskon;
    }

    public static void main(String[] args) {
        Java_basic hd = new Java_basic();
        
        if (totalBelanja >= 100000){
            presentaseDiskon = 0.1;
            diskon = totalBelanja*presentaseDiskon;
        }
        else if (totalBelanja < 100000 && totalBelanja >= 50000){
            diskon = (totalBelanja*7.5)/100;
        }
        totalBelanja-= diskon;
        System.out.println("Diskon = " + diskon);
        System.out.println("Total = " + totalBelanja);
    }
}
