/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.convertisseur.de.temperature;

import java.util.Scanner;

/**
 *
 * @author canti
 */
public class ConvertisseurDeTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc;
        sc= new Scanner(System.in);
        
    double tCelcius;
    System.out.println("Entrer une valeur reelle :");
    tCelcius = sc.nextDouble();
    tCelcius = tCelcius + 273.15;
    System.out.println(tCelcius + " : est la temperature en Kelvin");
    
    double tKelvin;
    tKelvin = CelciusVersKelvin (tCelcius);
    System.out.println(" La temperature en Kelvin est de "+tKelvin);
    }
    
    
    
public static double CelciusVersKelvin ( double ValeurR){  
    double tKelvin;
    tKelvin = ValeurR + 273.15;
    return tKelvin;
    
    double tCelcius;
    tCelcius = KelvinVersCelcius (tCelcius);
    System.out.println(" La temperature en Kelvin est de "+tKelvin);
    }
    
    
    
public static double KelvinVersCelcius ( double tCelcius){  
    double tCelcius;
    tCelcius = tCelcius - 273.15;
    return tCelcius;
    
    }
}
}
