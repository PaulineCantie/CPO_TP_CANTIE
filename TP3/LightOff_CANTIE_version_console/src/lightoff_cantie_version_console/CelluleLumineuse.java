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
    private boolean etat= false;
    
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
        etat=!etat;
    }   

    /**
     * eteint la cellule si la cellule est allumée sinon elle n'a pas d'effet.
     */
    public void eteindreCellule(){
        if(etat=true){
            etat=false;
        }
    }

    /**
     * vérifie si la cellule est actuellement etteinte.
     * @return
     */
    public boolean estEteint(){
        if(etat==true){
            return(false);
        }
        return(true);
        }          
    

    
    /**
     * renvoie l'état de la cellule actuel.
     * @return
     */
    public boolean getEtat(){
        if (etat==true){
            return (true);
        }
        return (false);
    }
    /**
     *affiche l'état de la cellule de manière lisible
     * X = etiente
     * 0 = allumée 
     * @return
     */
    public String toString(){
        if (etat==true){
            return"X";
        }
        else{
            return "O";
        }
    }
}
           
