/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3_cono;

import java.util.Scanner;

/**
 * Calculates the volume of a cone and displays it.
 * @author Sasha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cone cone1=new Cone();
        System.out.println("Introduzca el radio de la base del cono: ");
        Scanner scanner=new Scanner(System.in);
        cone1.setRadio(scanner.nextFloat());
        
        System.out.println("Introduzca la altura del cono: ");
        scanner=new Scanner(System.in);
        cone1.setHeight(scanner.nextFloat());
        
        float volume=cone1.calculateVolume();
        
        System.out.println("El volumen del cono es "+volume);
        
    
    }
    
}
