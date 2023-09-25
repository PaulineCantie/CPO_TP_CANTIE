/*
 * CANTIE Pauline TDC
 * TP0 Exercice 2
 * Septembre 2023
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaration des varibles
        int nb; // nombre d'entiers à additionner
        // nb=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Entrer le nombre:");
        nb=sc.nextInt();
        int result;
        int ind;
        nb=5;
        result=0;
        
        // additionner des nb premiers entiers
        ind=1;
        while (ind<=nb){
            result=result+ind;
            ind=ind+1;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des"+nb+"entieer est:" +result);                }
    
}
