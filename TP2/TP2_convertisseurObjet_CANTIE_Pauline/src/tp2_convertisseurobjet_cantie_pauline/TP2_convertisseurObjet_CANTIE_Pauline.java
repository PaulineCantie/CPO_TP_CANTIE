/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_cantie_pauline;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class TP2_convertisseurObjet_CANTIE_Pauline {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
class Convertisseur{
public Convertisseur () {
    nbConversions = 0 ;
}
 @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
 

     Scanner sc = new Scanner(System.in);
        double intro;
        System.out.print("Bonjour, saisissez une valeur : ");
        intro = sc.nextInt();

        int choix = 0;
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin\n 2) De Kelvin vers Celcius\n 3) De Celcius vers Farenheit \n 4) De Farenheit vers Celcius \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin ");
        choix = sc.nextInt();

        double result;

        if (choix == 1) {
            result = CelciusVersKelvin(intro);
            System.out.println("Celcius vers Kelvin : " + result + "K");
        }

        
        if (choix == 2) {
            result = KelvinVersCelcius(intro);
            System.out.println("Kelvin Vers Celcius : " + result + "C");
        }

        if (choix == 4) {
            result = FarenheitVersCelcius(intro);
            System.out.println("Farenheit vers Celcius : " + result + "C");
        }
        if (choix == 3){
            result = CelciusVersFarenheit(intro);
            System.out.println("Celcius Vers Farenheit:"+ result+"F");
        
        if (choix == 5){
            result = KelvinVersFarenheit(intro);
            System.out.println("Kelvin vers Farenheit : " + result + "F");
        }
            
        if (choix == 6){
            result = FarenheitVersKelvin(intro);
            System.out.println("Farenheit vers Kelvin  : " + result + "K");
        }
        
        }
    }

    public static double CelciusVersKelvin(double Tcelcius) {

        double Tkelvin;
        Tkelvin = Tcelcius + 273.15;
        return Tkelvin;

    }

    public static double KelvinVersCelcius(double Tkelvin) {

        double Tcelcius;
        Tcelcius = Tkelvin - 273.15;
        return Tcelcius;

    }

    public static double FarenheitVersCelcius(double Tfar) {

        double Tcelcius;
        Tcelcius = (Tfar - 32) / 1.8;
        return Tcelcius;

    }

    public static double CelciusVersFarenheit(double Tcelcius) {

        double Tfar;
        Tfar = (Tcelcius * 1.8) + 32;
        return Tfar;

    }

    public static double KelvinVersFarenheit(double Tkelvin) {

        double Tfar;
        Tfar = (Tkelvin - 273.15) * 1.8 + 32;
        return Tfar;

    }

    public static double FarenheitVersKelvin(double Tfar) {

        double Tkelvin;
        Tkelvin = (Tfar - 32) * 1.8 + 273.15;
        return Tkelvin;

    }

}

        
}       
}


    }

    
}
