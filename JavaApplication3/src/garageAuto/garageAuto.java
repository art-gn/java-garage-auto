/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageAuto;

import java.util.Scanner;

/**
 *
 * @author arthur
 */
public class garageAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {        
        garage g = new garage();
        int choix;
        int choix2;
        int panne;
        String NomDeVoiture;
        String NomDeMoto;
        do {            
            
            System.out.println("_____MENU_____");
            System.out.println("0.Quitter");
            System.out.println("1.Montrer Garage");
            System.out.println("2.Ajouter");
            Scanner reader = new Scanner(System.in);
            choix = reader.nextInt();
            switch(choix){
                case 1:
                    System.out.println(g);
                    break;
                case 2:
                    System.out.println("---CHOIX DU VEHICULE---");
                    System.out.println("1.Voiture");
                    System.out.println("2.Moto");
                    Scanner reader2 = new Scanner(System.in);
                    choix2 = reader2.nextInt();
                    switch(choix2){
                        case 1:
                            System.out.println("Taper le nom:");
                            Scanner reader3 = new Scanner(System.in);
                            NomDeVoiture = reader3.nextLine();
                            System.out.println("En Panne?");
                            System.out.println("1.Oui");
                            System.out.println("2.Non");
                            Scanner reader5 = new Scanner(System.in);
                            panne = reader5.nextInt();
                            if (panne==1) {
                                g.add(new vehicule());
                            }
                            break;
                        case 2:
                            System.out.println("Taper le nom");
                            Scanner reader4 = new Scanner(System.in);
                            NomDeVoiture = reader4.nextLine();
                    }
                   
                 
            }
        }while (choix != 0);
    }
    
}
