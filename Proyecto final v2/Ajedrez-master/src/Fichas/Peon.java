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
public class Peon extends FichaTemplate {
    public Peon(){
        
    }
    
    public Peon(Peon target){
        super(target);
    }
    
    @Override
    public Peon clone(){
        return new Peon(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

                 ImageIcon pB = new ImageIcon("imagenes/peonBlanco.png");
                    ImageIcon pB2 = new ImageIcon(pB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pB2);

            } else {

                ImageIcon pN = new ImageIcon("imagenes/peonNegro.png");
                    ImageIcon pN2 = new ImageIcon(pN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
}
