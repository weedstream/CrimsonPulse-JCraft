/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectspeak;

/**
 *
 * @author badnoby
 */
/*
FAUZI IRFAN SYAPUTRA
21103071
SI05C
*/
public class ProjectSpeak {

    public static void main(String[] args) {
        Dog guffy = new Dog();
        Duck donald = new Duck();
        MorleySafer morley = new MorleySafer(); 
        Owl woodsy = new Owl();
        guffy.name = "Guffy";
        donald.name = "Donald";
        morley.name = "Morley Safer"; 
        woodsy.name = "Woodsy";
        System.out.println("First we'll get the dog to speak:"); 
        guffy.speak();
        System.out.println(" ");
        System.out.println("Now, the duck will speak:"); 
        donald.speak();
        System.out.println(" ");
        System.out.println("Now it's Morley's turn to speak:"); 
        morley.speak();
        System.out.println(" ");
        System.out.println("Finally, the owl will speak:"); 
        woodsy.speak();
        System.out.println(" ");
        System.out.println("Time for all four to sleep:"); 
        guffy.sleep();
        donald.sleep();
        morley.sleep();
        woodsy.sleep();
    }
}
