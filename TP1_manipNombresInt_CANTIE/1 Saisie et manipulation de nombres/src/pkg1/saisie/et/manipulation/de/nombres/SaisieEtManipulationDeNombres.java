/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.saisie.et.manipulation.de.nombres;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class SaisieEtManipulationDeNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc;
        sc= new Scanner(System.in);
        
    int entier1;
    System.out.println("Entrer un entier");
    entier1 = sc.nextInt();
    
    int entier2;
    System.out.println("Entrer un deuxieme entier");
    entier2 = sc.nextInt();
    
    int nb1;
    nb1 = entier1 + entier2 ;
        System.out.println("La somme des entiers est egale à : "+nb1);
    
    int nb2;    
    nb2 = entier1 - entier2 ;
        System.out.println("La difference des entiers est egale à : "+nb2);
    
    int nb3;
    nb3 = entier1 / entier2 ;
        System.out.println("Le quotient des entiers est egale à : "+nb3);
    
    int nb4;    
    nb4 = entier1 * entier2 ;
        System.out.println("La multiplication des entiers est egale à : "+nb4);
    
    int nb5;
    nb5 = entier1 % entier2;
        System.out.println("Le reste de la division des entiers est egale à : "+nb5);
    }
    
}

    }
    
}
