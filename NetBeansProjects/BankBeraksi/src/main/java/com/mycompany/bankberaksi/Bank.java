/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankberaksi;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
SI05C
21103071
*/
public class Bank {
    protected int saldo; 
    public Bank(int saldo){ 
        this.saldo = saldo;
        System.out.println("Selamat Datang Oke");
        getSaldo();
    } 
    public void simpanUang(int inputsaldo){
        this.saldo = inputsaldo + this.saldo;
        System.out.println("Simpan Uang : Rp. " + inputsaldo);
        getSaldo();
    }
    public void ambilUang(int inputsaldo){
        this.saldo = this.saldo - inputsaldo;
        System.out.println("Ambil Uang : Rp. " + inputsaldo);
        getSaldo();
    }
    public void getSaldo(){
        System.out.println("saldo saat ini : Rp. " + saldo);
        System.out.println("");
    }
}
