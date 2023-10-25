/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

/**
 *
 * @author canti
 */
public class CelluleLumineuse {
    private boolean etat;
    
    /**
     * initialise l'état de la cellule en le mettant à 
     * éteinte.
     */
    public CelluleLumineuse(){
        etat=false;
    }

    /**
     * inverse l'état actuel de la cellule.
     */
    public void activerCellule(){
        etat=true;
    }   

    /**
     * eteint la cellule si la cellule est allumée sinon elle n'a pas d'effet.
     */
    public void eteindreCellule(){
        etat=false;
    }

    /**
     * vérifie si la cellule est actuellement etteinte.
     * @return
     */
    public boolean estEteint(){
        return !etat;          
    }
    
    /**
     * renvoie l'état de la cellule actuel.
     * @return
     */
    public boolean getEtat(){
        return etat;
    }

    /**
     *affiche l'état de la cellule de manière lisible
     * X = etiente
     * 0 = allumée 
     * @return
     */
    public String toString(){
        if (etat){
            return"X";
        }
        else{
            return "O";
        }
    }
}
           
