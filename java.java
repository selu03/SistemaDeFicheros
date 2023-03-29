/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quijote;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class java {
    public static void main(String[] args) {
        FileWriter out;
        try {
          BufferedWriter file1=new BufferedWriter(new FileWriter("quijote.txt",true));
          file1.newLine();
          file1.write("En un lugar de La mancha"); 
          file1.newLine();
          file1.write("de cuyo nombre no quiero acordarme");
          file1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
