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
    Scanner sc= new Scanner (System.in);
    
    int operateur;
    System.out.println("Please enter the operator: \n 1) add \n 2)substract \n 3) multiply \n 4) divide \n 5) modulo");
    operateur=sc.nextInt();
    
    int nb1;
    System.out.println("Entrer un nombre1");
    nb1 = sc.nextInt();
    
    int nb2;
    System.out.println("Entrer un nombre2");
    nb2 = sc.nextInt();
    
    int nb;
    if (operateur ==1){
        nb = nb1 + nb2;
        System.out.println("nombre1 + nombre2 = "+nb);
    }

    if (operateur ==3){
        nb = nb1 * nb2;
        System.out.println("nombre1 * nombre2 = "+nb);
    }

    if (operateur ==4){
        nb = nb1 / nb2;
        System.out.println("nombre1 / nombre2 = "+nb);
    }

    if (operateur ==5){
        nb = nb1 % nb2;
        System.out.println("nombre1 modulo nombre2 = "+nb);
    }