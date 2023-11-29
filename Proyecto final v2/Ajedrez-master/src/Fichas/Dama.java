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
public class Dama extends FichaTemplate {
    public Dama(){
        
    }
    
    public Dama(Dama target){
        super(target);

    }
    
    public Dama(boolean colorficha, int id, JButton casilla)
    {
        super(colorficha, id, casilla);
    }
    
    @Override
    public Dama clone(){
        return new Dama(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

                ImageIcon dB = new ImageIcon("imagenes/damaBlanco.png");
                    ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dB2);

            } else {

                ImageIcon dN = new ImageIcon("imagenes/damaNegro.png");
                    ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
}
