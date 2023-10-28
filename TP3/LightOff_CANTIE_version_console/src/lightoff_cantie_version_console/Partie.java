/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class Partie {
    
    GrilleDeJeu grille;
    int nbCoups;

 

    public Partie() {
        grille = new GrilleDeJeu(10, 10);
        nbCoups = 0;
    }

 

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
    }

 

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.initialiserPartie();
        partie.lancerPartie();
    }

 

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff!");
        System.out.println("Voici l'état initial de la grille :");
        System.out.println(grille);

 

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Coup " + (nbCoups + 1));
            System.out.println("Entrez la ligne : ");
            int ligne = scanner.nextInt();
            System.out.println("Entrez la colonne : ");
            int colonne = scanner.nextInt();
            grille.activerLigneDeCellules(ligne);
            grille.activerColonneDeCellules(colonne);

 

            nbCoups++;
            System.out.println("Nombre de coups joués : " + nbCoups);
            System.out.println("État de la grille après le coup :");
            System.out.println(grille);

        }

        System.out.println("Bravo ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");

    }

}

 