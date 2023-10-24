/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_cantie_pauline;

/**
 *
 * @author canti
 */
public class Magicien extends Personnage{
    boolean conf;
    
    public boolean isConf(){
        return conf;
    }
    public void setConf(boolean conf){
        this.conf=conf;
    }
    public Magicien (String nom, int niveauDeVie, boolean nonconf){
       super(nom, niveauDeVie);
       nonconf=conf;
    }
}
