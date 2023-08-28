/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectasuransi;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
SI05C
*/
public class ProjectAsuransi {

    public static void main(String[] args) {
        Satpam satpam = new Satpam("Syaputra","03071","Jl. Pwt 07",2022,3500000,15);
        Sales sales = new Sales("Irfan","03072","Jl. Pwt 08",2022,500000,10);
        Manajer manajer = new Manajer("Fauzi","03073","Jl. pwt 09" ,2022 ,2000000 ,"IT");
        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");
        System.out.println("");
        satpam.CetakSatpam();
        System.out.println("");
        sales.CetakSales();
        System.out.println("");
        manajer.CetakManajer();
    }
}
