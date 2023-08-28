/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guided_3;

/**
 *
 * @author badnoby
 */

/*
FAUZI IRFAN SYAPUTRA
21103071
SI 05 C
*/
import java.io.*;
public class mahasiswa {
    private String Nama[] = new String[3];
    private String NIM[] = new String[3];
    private int i;
    
    public void inputData(){
        BufferedReader b;
        b = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("-Input Data Mahasiswa-");
            for (i=0; i<3; i++){
                System.out.println("Masukkan nama : ");
                Nama[i] = b.readLine();
                System.out.println("Masukkan NIM : ");
                NIM[i] = b.readLine();
            }
        }
        catch(Exception E){}
    }
    
    public void display(){
        System.out.println("");
        System.out.println("-Display Data Mahasiswa-");
        for(i=0;i<3;i++){
            System.out.println("Nama : " + Nama[i]);
            System.out.println("NIM : " + NIM[i]);
            System.out.println("");
        }
    }
    
}
