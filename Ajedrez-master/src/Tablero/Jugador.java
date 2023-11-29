package Tablero;

import Fichas.Ficha;
import java.util.ArrayList;
import javax.swing.JButton;

public class Jugador {

    public boolean blanco;
    public ArrayList<Ficha> fichas;

    public Jugador(boolean bla) {
        this.blanco = bla;
        this.fichas = new ArrayList<Ficha>();
    }
    
    public boolean estaLaFicha(int id) {
        boolean esta = false;
        for (int i = 0; i < fichas.size(); i++) {
            if (fichas.get(i).getId() == id) {
                esta = true;
            }
        }
        return true;
    }
}
