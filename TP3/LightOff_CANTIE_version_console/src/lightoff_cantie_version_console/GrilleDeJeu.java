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
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes; 

 public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

for (int i = 0; i < nbLignes; i++) {
    for (int j = 0; j < nbColonnes; j++) {
        matriceCellules[i][j].eteindreCellule();
            }
        }
    }
@Override 
public String toString() {

    String grilleString = "";
    grilleString += "    |";
    for (int i = 0; i < matriceCellules[0].length; i++) {
     grilleString += "  " + i + " |";

    }

    grilleString += "\n";
    grilleString += "------------------------------------\n";
    for (int i = 0; i < matriceCellules.length; i++) {
        grilleString += " " + i + " |";
        for (int j = 0; j < matriceCellules[i].length; j++) {
            grilleString += "  " + (matriceCellules[i][j].getEtat() == true ? "X" : "O") + " |";

        }

        grilleString += "\n";
        grilleString += "------------------------------------\n";

    }

 

    return grilleString;

}
    
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
     * Choix 0: Active une ligne
     * Choix 1: Active une colonne
     * Choix 2: Active une diagonale 
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        int choix = random.nextInt(3); 

        if (choix == 0) {
            int ligneAleatoire = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligneAleatoire][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonneAleatoire = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonneAleatoire].activerCellule();
            }
        } else {
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }
  public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules(); // Éteindre toutes les cellules pour commencer

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3); 

            if (choix == 0) {
                activerLigneColonneOuDiagonaleAleatoire(); 
            } else if (choix == 1) {
                activerLigneColonneOuDiagonaleAleatoire(); 
            } else {
                activerDiagonaleDescendante();
            }
        }
    }   
}

        
 

