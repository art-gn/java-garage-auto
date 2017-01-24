/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garageAuto;

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
        vehiculeEnPanne v = new vehiculeEnPanne();
        g.add(v);
        g.add(v);
        System.out.println(g);
    }
    
}
