/*
 * CANTIE PAuline TDC
 * Exercice Calculator
 * Septembre 2023
 */
package calculette;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class Calculette {

    /**
     * @param args the command line arguments
     */
    public static String main(String[] args) {
       System.out.println("Please enter the operator: \n 1) add \n 2)substract \n 3) multiply \n 4) divide \n 5) modulo");
       
       String valeur1;
       String valeur2;
       Scanner sc;
       sc = new Scanner(System.in);
       System.out.println("Quelle est la premiere valeur ?");
       valeur1 = sc.nextLine();  
       System.out.println("Quelle est la deuxieme valeur ?");
       valeur2 = sc.nextLine();  
       
       if valeur1<valeur2;
       return("Le minimun est :" valeur1);
       
       
    }
    
}
