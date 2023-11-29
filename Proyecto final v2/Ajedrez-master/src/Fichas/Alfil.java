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
public class Alfil extends FichaTemplate {
    
    public Alfil(){
        
    }
    
    public Alfil(Alfil target){
        super(target);

    }
    
    public Alfil(boolean colorficha, int id, JButton casilla)
    {
        super(colorficha, id, casilla);
    }
    
    @Override
    public Alfil clone(){
        return new Alfil(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

                ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
                ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(w, h, 1));
                casilla.setIcon(aB2);

            } else {

                ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
                ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(w, h, 1));
                casilla.setIcon(aN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }

}
