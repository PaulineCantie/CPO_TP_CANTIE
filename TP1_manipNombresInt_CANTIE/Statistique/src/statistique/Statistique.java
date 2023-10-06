/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistique;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class Statistique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int face[]=new int[6];
    Scanner sc = new Scanner(System.in);
    int nombre;
    System.out.println("Entrez le nombre de lancer que desire");
    nombre=sc.nextInt();
    
    for (int i=0; i<nombre ; i++){
        Random alea = new Random();
        int nblancer = alea.nextInt(6);
        System.out.println(nblancer);
        if (nblancer==0){
            face[0]+=1;
            
        } else if(nblancer==1){
            face[1]+=1;
            
        } else if(nblancer==2){
            face[2]+=1;
            
        } else if(nblancer==3){
            face[3]+=1;
            
        } else if(nblancer==4){
            face[4]+=1;
            
        } else if(nblancer==5){
            face[5]+=1;
        }
    }
    for(int i=0; i<6; i++){
        double prct = 0;
        prct= face[i]*100/nombre;
        System.out.println("Le pourcentage de face "+ (i+1) +" obtenue est: "+pcrt+"%");
    }
    }
    
}
    }
    
}
