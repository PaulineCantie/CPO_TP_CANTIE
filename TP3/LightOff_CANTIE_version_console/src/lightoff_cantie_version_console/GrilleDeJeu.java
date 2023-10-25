/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

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
        matriceCellules[i][j] = new CelluleLumineuse();
            }
        }

    /**
     * Eteint toutes les cases.
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                eteindreCellule(i, j);
            }
        }
    }
    private void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int colonne = random.nextInt(nbColonnes);

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            matriceCellules[ligne][colonne].allumer();   
        
    } 
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();

        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3); // Générer un nombre aléatoire entre 0 et 2

            if (choix == 0) {
                activerLigneAleatoire();
            } else if (choix == 1) {
                activerColonneAleatoire();
            } else {
                activerDiagonaleAleatoire();
            }
        } 
    }
}

 