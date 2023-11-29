/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas;

import javax.swing.ImageIcon;

/**
 *
 * @author Rocnar
 */
public class Rey extends FichaTemplate {
    public Rey(){
        
    }
    
    public Rey(Rey target){
        super(target);

    }
    
    @Override
    public Rey clone(){
        return new Rey(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

                ImageIcon rB = new ImageIcon("imagenes/reyBlanco.png");
                    ImageIcon rB2 = new ImageIcon(rB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rB2);

            } else {

              ImageIcon rN = new ImageIcon("imagenes/reyNegro.png");
                    ImageIcon rN2 = new ImageIcon(rN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
}
