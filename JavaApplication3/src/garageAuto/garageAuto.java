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
        do {            
            
            System.out.println("_____MENU____");
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
                    g.add(new vehiculeEnPanne());
                    System.out.println("Ajout");
                 
            }
        }while (choix != 0);
    }
    
}
