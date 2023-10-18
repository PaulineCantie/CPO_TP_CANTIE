/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author canti
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;
    
    public Arme (String nom, int attaque){
        this.nom=nom;
        niveauAttaque=attaque;
        
    }
    @Override
    public String toString (){
        return ("L'arme"+nom+ " a un niveau d'attaque"+niveauAttaque);
    }
}
