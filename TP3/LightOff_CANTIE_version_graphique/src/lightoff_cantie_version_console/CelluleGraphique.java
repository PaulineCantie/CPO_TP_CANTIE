/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_cantie_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author canti
 */
public class CelluleGraphique extends JButton {
        int largeur; 
        int hauteur; 
    
    CelluleLumineuse celluleLumineuseAssociee; 
 
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }

@Override

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setText(celluleLumineuseAssociee.toString());
            if (celluleLumineuseAssociee.estAllumee()) {
                this.setBackground(new Color(120, 90, 10));
                this.setForeground(Color.WHITE);
            }
            else {
                this.setBackground(new Color(150, 10, 140));
                this.setForeground(Color.WHITE);

            }

           

            

 }

       
}
