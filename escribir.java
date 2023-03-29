/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quijote;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class escribir {
    public static void main(String[] args) {
        try {
          BufferedWriter file1=new BufferedWriter(new FileWriter("quijote.txt",true));
          String w=null;
          Scanner sc=new Scanner(System.in);
          w= sc.next();
          while (!w.equals("fin")) {
              w= sc.next();
              file1.write(w);
              file1.newLine();
              file1.flush();
              
          } 
          file1.close();
        }
         catch (Exception e) {
        }

    }
    
}
