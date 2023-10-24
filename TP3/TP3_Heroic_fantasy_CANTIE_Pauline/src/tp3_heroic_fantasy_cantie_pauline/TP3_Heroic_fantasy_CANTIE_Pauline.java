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
        Baton Baton1= new Baton( "Chêne",  4, 5);
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
    
    }
}