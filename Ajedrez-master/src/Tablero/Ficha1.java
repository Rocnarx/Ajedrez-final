//package Tablero;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//
//abstract class Ficha1 {
//
//    public boolean colorFicha;
//    public int id;
//    public int tipo; //1 Peon - 2 Torre - 3 Caballo - 4 Alfil - 5 Dama - 6 Rey
//    public JButton casilla;
//
////    public Ficha(boolean fic, int id, int tip, JButton cas) {
////        this.fichaBlanca = fic;
////        this.id = id;
////        this.tipo = tip;
////        this.casilla = cas;
////        poneImagenes(cas.getWidth(), cas.getHeight());
////    }
//    
//    public Ficha1(Ficha1 target)
//    {
//        if (target != null){
//            this.colorFicha = target.colorFicha;
//            this.id = target.id;
//            this.casilla = target.casilla;
//            poneImagenes(casilla.getWidth(), casilla.getHeight());
//        }
//    }
//    
//    public void cambiarA(Ficha1 cambiar, JButton nueva){
//        cambiar.casilla = nueva;
//        cambiar.poneImagenes(nueva.getWidth(), nueva.getHeight());
//    }
//   
//    public void poneImagenes(int w, int h) {
//        try {
//            if (colorFicha) {
//                if (tipo == 1) {
//                   
//                }
//                if (tipo == 2) {
//                   
//                }
//                if (tipo == 3) {
//                    
//                }
//                if (tipo == 4) {
//                    ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
//                    ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(w, h, 1));
//                    casilla.setIcon(aB2);
//                }
//                if (tipo == 5) {
//                    
//                }
//                if (tipo == 6) {
//                    
//                }
//            } else {
//                if (tipo == 1) {
//                    
//                }
//                if (tipo == 2) {
//                    
//                }
//                if (tipo == 3) {
//                    
//                }
//                if (tipo == 4) {
//                    ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
//                    ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(w, h, 1));
//                    casilla.setIcon(aN2);
//                }
//                if (tipo == 5) {
//                    
//                }
//                if (tipo == 6) {
//                    
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Error en la imagen: " + e.toString());
//        }
//    }
//    public void quitaCasilla(){
//        casilla.setIcon(null);
//    }
//    
//    public String toString(){
//        return "Ficha blanca: "+fichaBlanca+" de tipo: "+tipo;
//    }
//}
