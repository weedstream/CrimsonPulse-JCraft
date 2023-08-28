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
public class Titik {
   Scanner cin = new Scanner(System.in);
   protected int x,y;
   public Titik (){
       x = 0;
       y = 0;
   }
   public void inisialisasiTitik(){
        System.out.println("Masukan Nilai x : " );
        this.x = cin.nextInt();
        System.out.println("Masukan Nilai y : " );
        y = cin.nextInt();
   }
   public void tampilTitik(){
       System.out.println("x = " + x);
       System.out.println("y = " + y);
   }
   public void perkalianSkalar(){
       int s;  
       s = cin.nextInt();
       System.out.println("skalar = " + ((s * x )+ (s * y)));
       
   }
   public void pencerminanSumbuX(){
       System.out.println("pencerminanSumbuX = " + (x - (x + x)));
   }
   public void pencerminanSumbuY(){
       System.out.println("pencerminanSumbuY = " + (y - (y + y)));
   }
   public int jarak (){
       int x2,y2;
       x2 = cin.nextInt();
       y2 = cin.nextInt();
       return (int) Math.sqrt(((x2 - x )* (x2 - x)) + ((y2 - y) * (y2 - y)));
   }
}
