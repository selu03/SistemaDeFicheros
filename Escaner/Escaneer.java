/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escaner;

import java.util.Scanner;

public class Escaneer {
    public static void main(String[] args) {
        String nombre; int edad; double estatura;
        Scanner atr = new Scanner (System. in);
        System.out.print("Introduce tu nombre, edad, estatura:");
        nombre = atr.next(); 
        edad = atr.nextInt();
        estatura = atr.nextDouble();
        Deportista d1 = new Deportista(nombre, edad, estatura);
        System.out.println(d1.toString());
        
        
    }
}
