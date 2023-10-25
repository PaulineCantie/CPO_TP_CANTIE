/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

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
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                eteindreCellule(i, j);
            }
        }
    }
}
  public activerLigneColonneOuDiagonaleAleaatoire(){
    } 
   
 }
