
package Fichas;
import javax.swing.JButton;
public interface Ficha {
    public JButton getCasilla();
    public void setCasilla(JButton casilla);
    public int getId();
    public Ficha clone();
    public void poneImagenes(int w, int h);
}
