/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_cantie_version_console;

/**
 *
 * @author canti
 */
public class LightOff_CANTIE_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CelluleLumineuse cellule1= new CelluleLumineuse();
       
        
        System.out.println("Etat initial de la cellule1: "+cellule1);
        cellule1.activerCellule();
        System.out.println("Nouvel etat de cellule1: "+ cellule1);
        
        boolean etatCellule1= cellule1.getEtat();
        System.out.println("Etat de cellule1 : "+ etatCellule1);
        
    }
    
}
