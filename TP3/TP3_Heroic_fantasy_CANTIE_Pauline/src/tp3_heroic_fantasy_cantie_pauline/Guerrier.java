/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cantie_pauline;

/**
 *
 * @author canti
 */
public class Guerrier extends Personnage {
    boolean cheval;
    
    public boolean isCheval(){
        return cheval;
    }
    
    public void setCheval(boolean cheval){
       this.cheval = cheval;
    }
    public Guerrier(String nom, int niveauDeVie, boolean nomcheval) {
        super(nom, niveauDeVie); 
        nomcheval = cheval;
    }
}
