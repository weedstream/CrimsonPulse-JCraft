/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unguided;

/**
 *
 * @author badnoby
 */
class Limas {
    SgtSamaSisi segitiga;
    Persegi persegi;
    double luasSGT, luasPSG;

    public Limas (double Sx1, double Sy1, double Sx2, double Sy2, double Px1, double Py1, double Px2, double Py2) {
        segitiga = new SgtSamaSisi(Sx1, Sy1, Sx2, Sy2);
        luasSGT = segitiga.hitungLuas();

        persegi = new Persegi(Px1, Py1, Px2, Py2);
        luasPSG = persegi.hitungLuas();
    }

    public double hitungLuas () {
        return (4 * luasSGT) + luasPSG;
    }

    public void tampil () {
        segitiga.tampil();
        persegi.tampil();
        System.out.println("Luas Limas : " + hitungLuas());
    }
}
