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
    GrilleDeJeu grille=new GrilleDeJeu(10,10);
    int nbCoups;
    public Partie(){
    nbCoups=0;
   
           
}

    /**
     * Initialise la grille pour commencer la partie avec toutes les lumières éteintes.
     */
    public void initialiserPartie() {
    grille.eteindreToutesLesCellules();
    grille.melangerMatriceAleatoirement(10);

   
   
}

    /**
     *Elle permet de jouer au jeu LightOff en affichant l'état initial de la grille, puis en entrant dans une boucle de jeu qui continue 
     *tant que toutes les cellules ne sont pas éteintes. À chaque tour de la boucle :
     * a. Un coup est demandé au joueur sous la forme d’une saisie au clavier
     * b. La ligne, colonne, ou diagonale correspondante est activée 
     * c. Le nombre de coups est incrémenté et affiché
     * d. l'état mis à jour de la grille est affiché. 
     * e. Une fois que toutes les cellules sont éteintes, le jeu se termine, et le nombre de coups nécessaires pour éteindre toutes les cellules est affiché.
     */
    public void lancerPartie() {
        initialiserPartie();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bienvenue dans le jeu LightOff!");
        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Grille actuelle :");
            System.out.println(grille);
            System.out.println("Entrez un coup: \n l pour ligne \n c pour colonne \n dD pour diagonale Descendante \n dA pour la diagonale Ascendante) :");

            String coup = scanner.nextLine();
            System.out.println("Entrez un nombre ");
            int nb = scanner.nextInt();
 
            switch (coup) {

                case "l" -> grille.activerLigneDeCellules(nb); 
                case "c" -> grille.activerColonneDeCellules(nb); 
                case "dD" -> grille.activerDiagonaleDescendante();
                case "dA"-> grille.activerDiagonaleMontante();
                
                default -> System.out.println("Votre coup est invalide. Veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");
            }
            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
        }
        System.out.println("Bravo, toutes les cellules sont éteintes! Votre nombre de coups : " + nbCoups);
        scanner.close();

    }

}


