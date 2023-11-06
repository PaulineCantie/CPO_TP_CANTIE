/* Projet 1:
/* CANTIE Pauline TDC
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;

/**
 *
 * @author canti
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules=null;
    private int nbLignes;
    private int nbColonnes; 

 public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

for (int i = 0; i < nbLignes; i++) {
    for (int j = 0; j < nbColonnes; j++) {
        matriceCellules[i][j] = new CelluleLumineuse();
    }
}
        
for (int i = 0; i < nbLignes; i++) {
    for (int j = 0; j < nbColonnes; j++) {
        matriceCellules[i][j].eteindreCellule();
            }
        }
    }
 
    /**
     * Cette méthode permet d'afficher plus rapidement et efficacement la grille de jeu.
     * @return
     */
    @Override 
public String toString() {

    String grilleString = "";
    grilleString += "    |";
    for (int i = 0; i < matriceCellules[0].length; i++) {
     grilleString += "  " + i + " |";

    }

    grilleString += "\n";
    grilleString += "--------------------------------------------------------\n";
    for (int i = 0; i < matriceCellules.length; i++) {
        grilleString += " " + i + " |";
        for (int j = 0; j < matriceCellules[i].length; j++) {
            grilleString += "  " + (matriceCellules[i][j].getEtat() == true ? "X" : "O") + " |";

        }

        grilleString += "\n";
        grilleString += "--------------------------------------------------------\n";

    }
    return grilleString;

}
    

public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
                
            }
        }
    }

    /**
     * active de manière aléatoire soit une ligne, soit une colonne, soit une diagonale de cellules dans la grille.
     * Choix 0: Si "i" est inférieur à 50, une ligne aléatoire est activée. Un nombre aléatoire "r" entre 0 et 9 est généré, puis chaque cellule dans la ligne "r" est activée.
     * Choix 1: Si "i" est supérieur ou égal à 50 et inférieur à 100, une colonne aléatoire est activée. Un nombre aléatoire "r" entre 0 et 9 est généré, puis chaque cellule dans la colonne "r" est activée.
     * Choix 2: Si "i" est égal à 100, une diagonale est activée. Cela signifie que chaque cellule sur la diagonale de la grille est activée
     * Choix 3: Si "i" est égal à 101, une deuxième diagonale est activée, celle-ci étant diagonalement opposée.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random Aleatoire = new Random();
        int n = Aleatoire.nextInt(100);
        for (int i = 0; i < n; i++) {
            int f = Aleatoire.nextInt(101);
            if (f < 50) {
                int r = Aleatoire.nextInt(10);
                for (int j = 0; j < 10; j++) {
                    matriceCellules[r][j].activerCellule();
                }
            }
            if (f > 50 || f < 100) {
                int r = Aleatoire.nextInt(10);
                for (int j = 0; j < 10; j++) {
                    matriceCellules[j][r].activerCellule();
                }
            }
            if (f == 100) {
               
                for (int j = 0; j < 10; j++) {
                    matriceCellules[j][j].activerCellule();
                }
                if (f == 101) {
     
                    for (int j = 0; j < 10; j++) {
                        matriceCellules[j][9 - j].activerCellule();
                    }
                }

            }
        }
    }

    /**
     * Ce sert du code ("activerLigneColonneOuDiagonaleAleatoire") pour activer aléatoirement des lignes, des colonnes ou des diagonales. 
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
       eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    } 

    /**
     *Active toutes les cellules d'une ligne particulière dans une grille de cellules lumineuses. 
     *Elle prend l'indice de la ligne "j" en argument et active ensuite chaque cellule dans cette ligne.
     * @param idiceLigne
     */
    public void activerLigneDeCellules(int idiceLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idiceLigne][j].activerCellule();
    }
 } 

    /**
     * Même technique que pour activer une ligne cependant, ici la fonction prend en argument l'indice de la colonne "i".
     * Elle active ensuire chaque cellule dans cette colonne.
     * @param idiceColonne
     */
    public void activerColonneDeCellules(int idiceColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idiceColonne].activerCellule();
        }
    }

    /**
     *La boucle s'exécute quand que "i" est inférieur au nombre de lignes et également inférieur au nombre de colonnes.
     *Cela implique que seul les éléments de la diagonales vont être modifiés.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Même méthode que pour la diagonale Descendante.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
}

    /**
     * Cette méthode vérifie si toutes les cellules de la grille sont éteintes en parcourant la grille et 
     * en renvoyant false dès qu'elle trouve une cellule activée.
     * @return
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }
}

        
 

