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
    
GrilleDeJeu grille = new GrilleDeJeu(10,10);
     int nbCoups;
    public Partie() {
        int nbCoups = 0;
    }
   
        public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10);
        }
       
    /**
     * Lance la partie et ecrit le message de lancement du jeu
     *  Tant que la grille ne sera pas etainte entierement la partie ne sera pas finie
     *  Il y a 3 actions possibles:
     *  1) allumer une ligne : L
     *  2) allumer une colonne : C
     *  3) allummer une diagonale: D
     *  Il renvoie le nombre coups final une fois la grille etainte.
     */
    public void lancerPartie() {
           initialiserPartie();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu LightOff!");

 
        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Grille actuelle :");
            System.out.println(grille);

            System.out.println("Entrez un coup (1 pour ligne, 2 pour colonne, 3 pour diagonale descendante, 4 pou diagonale montante) :");
            int choix = scanner.nextInt();
 
            switch (choix) {
                case 1:
                    System.out.println("entrer la ligne que vous souhaitez changer : ");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;
                 
                case 2:
                    System.out.println("entrer la colonne que vous souhaitez changer : ");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne); 
                    break;

                case 3:
                    System.out.println("entrer la diagonale que vous souhaitez changer : ");
                    grille.activerDiagonaleDescendante(); 
                    break;
                case 4:
                    System.out.println("entrer la diagonale que vous souhaitez changer : ");
                    grille.activerDiagonaleMontante(); 
                    break;                    

                default:
                    System.out.println("Coup invalide. Veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");

            }

            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
        
        }
        System.out.println("Toutes les cellules sont éteintes! Nombre de coups : " + nbCoups);
        scanner.close();
        
    }
       
     
       
    }
   