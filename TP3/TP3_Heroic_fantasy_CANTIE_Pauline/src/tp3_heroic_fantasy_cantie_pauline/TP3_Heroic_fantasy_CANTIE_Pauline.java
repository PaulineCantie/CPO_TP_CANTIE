/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_cantie_pauline;

import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author canti
 */
public class TP3_Heroic_fantasy_CANTIE_Pauline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Epee1= new Epee( "Escalibur",  7, 5);
        Epee Epee2= new Epee( "Durandal", 4, 7);
        Baton Baton1= new Baton( "Chene",  4, 5);
        Baton Baton2= new Baton( "Charme",  5, 6);
        ArrayList<Arme> armes= new ArrayList<>();
        armes.add(Epee1);
        armes.add(Epee2);
        armes.add(Baton1);
        armes.add(Baton2);
        
        
               
        for (int i=0; i < armes.size();i++){
            Arme arme = armes.get(i);
            System.out.println("Arme"+(i+1)+": "+arme);
                    
        }
        
        Magicien magicien1= new Magicien("Gandal", 65,false);
        Magicien magicien2 =new Magicien("Garcimore", 44, true);
        Guerrier guerrier1= new Guerrier("Conan", 78, false);
        Guerrier guerrier2= new Guerrier("Lannister", 45, true);

        
    ArrayList<Personnage> ListePersonnages= new ArrayList<Personnage>();
    
    ListePersonnages.add(magicien1);
    ListePersonnages.add(magicien2);
    ListePersonnages.add(guerrier1);
    ListePersonnages.add(guerrier2);
    
    
    System.out.println("liste des personnages: ");
    for (Personnage personnage : ListePersonnages){
        System.out.println(personnage);
    }
    class Personnage {
    private ArrayList<Arme> armes = new ArrayList<>();

    public void ajouterArme(Arme arme) {
        if (armes.size() < 5) {
            armes.add(arme);
            System.out.println("Arme ajoutée : " + arme);
        } else {
            System.out.println("Le personnage a déjà 5 armes. Il est impossible d'en ajouter une de plus.");
        }
    }

    public void afficherArmes() {
        System.out.println("Armes du personnage:");
        for (Arme arme : armes) {
            System.out.println(arme);
        }
    }
    private Arme armeEnMain = null;
    public void choisirArme(int index) {
        if (index >= 0 && index < armes.size()) {
            armeEnMain = armes.get(index);
            System.out.println("Le personnage a choisi l'arme : " + armeEnMain);
        } else {
            System.out.println("Index d'arme invalide.");
        }
    }
    public void equiperArme(String nomArme) {
    Arme armeTrouvee = null;
    for (Arme arme : armes) {
        if (arme.getNom().equalsIgnoreCase(nomArme)) {
            armeTrouvee = arme;
        }
    }

    if (armeTrouvee != null) {
        armeEnMain = armeTrouvee;
        System.out.println("Le personnage est équipé avec l'arme : " + armeEnMain);
    } else {
        System.out.println("L'arme " + nomArme + " n'a pas été trouvée dans l'inventaire.");
    }
    Baton Baton3= new Baton( "Bat3",  4, 5);
    Baton Baton4= new Baton( "Bat4",  9, 8);
    Baton Baton5= new Baton( "Bat5",  3, 7);
    Epee Epee3= new Epee( "Ep3",  7, 5);
    Epee Epee4= new Epee( "Ep4",  8, 2);
    Epee Epee5= new Epee( "Ep5",  7, 2);
        


    armes.add(Epee4);

  Guerrier guerrier = new Guerrier("Guerrier1", 100, true);
        guerrier.ajouterArme(new arme(Baton3));
        guerrier.ajouterArme(new arme(Baton4));
        guerrier.ajouterArme(new arme(Epee3)); 

        guerrier.choisirArme(1);

        Magicien magicien = new Magicien("Magicien1", 80, false);

        // Ajout d'armes au stock du magicien
        magicien.ajouterArme(new arme(Baton5));
        magicien.ajouterArme(new arme(Epee4));
        magicien.ajouterArme(new arme(Epee5));  
}
    
    }
    
    }
   
}
    

