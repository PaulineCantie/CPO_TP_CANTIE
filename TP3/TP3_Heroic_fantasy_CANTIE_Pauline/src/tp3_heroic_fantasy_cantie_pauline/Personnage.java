/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cantie_pauline;

/**
 *
 * @author canti
 */
public class Personnage {
    String nom;
    int niveau2Vie;
    
    public Personnage ( String nom, int niveauDeVie, boolean nonconf){
        this.nom=nom;
        niveau2Vie= niveauDeVie;
        
    }
    @Override 
    public String toString(){
        return (" Le nom du Magicien est "+ nom+"et il a un niveau d'attaque de"+niveau2Vie);
    }
  
}
