/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_cantie_pauline;

import java.util.Random;
import java.util.Scanner;

/**
 *TP1 exercice 3
 * CANTIE Pauline
 * 4 octobre 2023
 * @author canti
 */
public class TP1_guessMyNumber_CANTIE_Pauline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
        int choixmode;
        System.out.println("Entrez un mode de jeu: \n1 pour facile \n2 pour moyen \n3 pour difficile");
        choixmode=sc.nextInt();
        
        int nombre;
        Random alea = new Random();
        int n1 = alea.nextInt(100);
              System.out.println("Entrez un nombre entre 0 et 100");
        nombre = sc.nextInt();
        int result;
        
        if (choixmode==1){
            result=modefacile(nombre,n1);
            System.out.println("Vous avez gagne en " + result + " coups");
        }
        
        else if (choixmode==3){
            result=modedifficile(nombre,n1);
            if (result!=5){
                System.out.println("Vous avez gagne en "+result+" coups");
            } else if(result==5){
                System.out.println("Perdu! vous avez utilise les 5 coups");
            }
        }   
        else if (choixmode==2){
            result=modemoyen(nombre,n1);
            System.out.println("Vous avez gagne en " + result + " coups");

        }
    
    

    public static int modefacile(int nbaleatoire, int nbchoisi) {
        Scanner sc = new Scanner(System.in);
        int nbessaie = 1;
        while (nbchoisi != nbaleatoire) {
            if (nbchoisi < nbaleatoire) {
                System.out.println(" nombre trop grand, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            } else if (nbchoisi > nbaleatoire) {
                System.out.println("nombre trop petit, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            }
        }
        return nbessaie;
    }
    
    public static int modedifficile(int nbaleatoire, int nbchoisi) {
        Scanner sc = new Scanner(System.in);
        int nbessaie = 1;
        while (nbchoisi != nbaleatoire && nbessaie!=5) {
            if (nbchoisi < nbaleatoire) {
                System.out.println("nombre trop grand, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            } else if (nbchoisi > nbaleatoire) {
                System.out.println("nombre trop petit, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            }
        } if (nbessaie==5){
            return 5;
        }
        return nbessaie;
    }
    
    
    public static int modemoyen(int nbaleatoire, int nbchoisi) {
        Scanner sc = new Scanner(System.in);
        int nbessaie = 1;
        while (nbchoisi != nbaleatoire) {
            if (nbchoisi-nbaleatoire>20) {
                System.out.println(" nombre beaucoup trop eloigne, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            } else if (nbchoisi - nbaleatoire< 20) {
                System.out.println("nombre tres proche, choisir un autre nombre:");
                nbaleatoire = sc.nextInt();
                nbessaie += 1;
            }
        }
        return nbessaie;
    }
}


