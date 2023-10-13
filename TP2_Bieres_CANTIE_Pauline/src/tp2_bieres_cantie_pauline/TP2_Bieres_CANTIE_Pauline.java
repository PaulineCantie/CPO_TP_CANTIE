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
//BouteilleBiere uneBiere = new BouteilleBiere() ;   
//uneBiere.nom = "Cuvee des trolls";
//uneBiere.degreAlcool = 7.0 ;
//uneBiere.brasserie= "Dubuisson";
//uneBiere.ouverte=false;        
//uneBiere.lireEtiquette();
//BouteilleBiere deuxBiere = new BouteilleBiere() ;   
//deuxBiere.nom="Leffe";
//deuxBiere.degreAlcool=6.6;
//deuxBiere.brasserie="Abbaye de Leffe";
//deuxBiere.lireEtiquette();
//    }
    
BouteilleBiere B3 = new BouteilleBiere("Delirium Tremens", (float) 8.5,"Brasserie Huyghe") ;
    B3.Décapsuler(); //methode  decapsuler 
        BouteilleBiere B2 = new BouteilleBiere("Rince cochon", (float) 8.5,"Brasserie Rince Cochon") ;
        BouteilleBiere B1 = new BouteilleBiere("BMB Blanche", (float) 5.6,"Brasserie Mont Blanc") ;
    B1.Décapsuler();//methode  decapsuler
        
    System.out.println(B1 + "\n" + B2 + "\n" + B3); //permet de lire avec toString()
    }
 
}