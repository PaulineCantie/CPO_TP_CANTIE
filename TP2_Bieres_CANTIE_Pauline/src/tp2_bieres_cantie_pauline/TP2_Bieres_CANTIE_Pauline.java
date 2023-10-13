/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_cantie_pauline;

/**
 *TP2
 * CANTIE Pauline TDC
 * 6 octobre 2023
 * @author canti
 */
public class TP2_Bieres_CANTIE_Pauline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
BouteilleBiere uneBiere = new BouteilleBiere() ;   
uneBiere.nom = "Cuvee des trolls";
uneBiere.degreAlcool = 7.0 ;
uneBiere.brasserie= "Dubuisson";
uneBiere.ouverte=false;        
uneBiere.lireEtiquette();
BouteilleBiere deuxBiere = new BouteilleBiere() ;   
deuxBiere.nom="Leffe";
deuxBiere.degreAlcool=6.6;
deuxBiere.brasserie="Abbaye de Leffe";
deuxBiere.lireEtiquette();

BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
public BouteilleBiere(String unNom, float unDegre, String 
uneBrasserie) {
 nom = "Leffe";
 degreAlcool = 6.6;
 brasserie = "Abbaye de Leffe";
 ouverte = false;
        }
    }
}
