package Fichas;


import javax.swing.JButton;

abstract class FichaTemplate implements Ficha {

    public boolean colorFicha;
    public int id;
    public JButton casilla;
    
    public FichaTemplate() {
        
    }
    
    
    public FichaTemplate(FichaTemplate target)
    {
        if (target != null){
            this.colorFicha = target.colorFicha;
            this.id = target.id;
            this.casilla = target.casilla;
//            poneImagenes(casilla.getWidth(), casilla.getHeight());
        }
    }
    
    public FichaTemplate(boolean colorficha ,int id, JButton casilla)
    {
            this.colorFicha = colorFicha;
            this.id =id;
            this.casilla = casilla;
//            poneImagenes(casilla.getWidth(), casilla.getHeight());
        
    }
    
    
    
    public void setID(int id){
        
        this.id = id;        
    }

    @Override
    public JButton getCasilla() {
        return casilla;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setCasilla(JButton casilla) {
        this.casilla = casilla;
    }
    
    
    
    public void cambiarA(FichaTemplate cambiar, JButton nueva){
        cambiar.casilla = nueva;
        cambiar.poneImagenes(nueva.getWidth(), nueva.getHeight());
    }
   
    public abstract void poneImagenes(int w, int h);
    
    public void quitaCasilla(){
        casilla.setIcon(null);
    }
    
    @Override
    public String toString(){
        return "Ficha blanca: "+colorFicha+" de tipo: "+ getClass();
    }
    
    @Override
    public abstract FichaTemplate clone();
    
}
