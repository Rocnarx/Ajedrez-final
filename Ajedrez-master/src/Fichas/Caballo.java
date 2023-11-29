/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Rocnar
 */
public class Caballo extends FichaTemplate {
    
    public Caballo(){
        
    }
    
    public Caballo(Caballo target){
        super(target);

    }
    
    public Caballo(boolean colorficha, int id, JButton casilla)
    {
        super(colorficha, id, casilla);
    }
    
    @Override
    public Caballo clone(){
        return new Caballo(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

                ImageIcon cB = new ImageIcon("imagenes/caballoBlanco.png");
                    ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cB2);

            } else {

                ImageIcon cN = new ImageIcon("imagenes/caballoNegro.png");
                    ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
}
