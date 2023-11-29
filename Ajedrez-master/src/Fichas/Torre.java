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
public class Torre extends FichaTemplate {
    public Torre(){
        
    }
    
    public Torre(Torre target){
        super(target);

    }
    
    public Torre(boolean colorficha, int id, JButton casilla)
    {
        super(colorficha, id, casilla);
    }
    
    @Override
    public Torre clone(){
        return new Torre(this);
    }

    @Override
    public void poneImagenes(int w, int h) {
        try {
            if (colorFicha) {

               ImageIcon tB = new ImageIcon("imagenes/torreBlanco.png");
                    ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tB2);

            } else {

               ImageIcon tN = new ImageIcon("imagenes/torreNegro.png");
                    ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tN2);

            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
}
