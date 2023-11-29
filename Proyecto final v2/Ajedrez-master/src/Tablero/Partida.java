
package Tablero;

import Fichas.*;
import javax.swing.JButton;

public class Partida {
    public Jugador blanco;
    public Jugador negro;
    public JButton tablero[][] = new JButton[8][8];
    public boolean turnoBlanco; 
    
    public Partida(Jugador b, Jugador n, JButton[][] t){
        this.blanco = b;
        this.negro = n;
        this.turnoBlanco = true;
        this.tablero = t;
    }
    
    public void cambiarTurno(){
        this.turnoBlanco = !this.turnoBlanco;
    }

    public Jugador getBlanco() {
        return blanco;
    }

    public Jugador getNegro() {
        return negro;
    }
    
    
    
    public boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for(int i=0; i<jugador.fichas.size(); i++){
            if(casilla.equals(jugador.fichas.get(i).getCasilla())){
                ocupada = true;
            }
        }
        return ocupada;
    }
    
    public void sacarFichas(JButton[][] tablero) {
        ConcreteCreatorNegro factoryNegro = new ConcreteCreatorNegro();
        ConcreteCreatorBlanco factoryBlanco = new ConcreteCreatorBlanco();
        //PROTOTIPOS B
        System.out.println("1 A ver");
        factoryNegro.crearFichas();
        factoryBlanco.crearFichas();
        
        
        Peon peonPrototipo = factoryBlanco.getPeon();
        Alfil alfilPrototipo = factoryBlanco.getAlfil();
        Caballo caballoPrototipo = factoryBlanco.getCaballo();
        Dama damaPrototipo = factoryBlanco.getDama();
        Rey reyPrototipo = factoryBlanco.getRey();
        Torre torrePrototipo = factoryBlanco.getTorre();
        // PROTTIPOS N
        Peon peonPrototipon = factoryNegro.getPeon();
        Alfil alfilPrototipon = factoryNegro.getAlfil();
        Caballo caballoPrototipon = factoryNegro.getCaballo();
        Dama damaPrototipon = factoryNegro.getDama();
        Rey reyPrototipon = factoryNegro.getRey();
        Torre torrePrototipon = factoryNegro.getTorre();
        
        // PEONES B
        Peon peonBlanco0 = peonPrototipo.clone();
        peonBlanco0.setID(0);
        peonBlanco0.cambiarA(peonBlanco0, tablero[6][0]);
        
        Peon peonBlanco1 = peonPrototipo.clone();
        peonBlanco1.setID(1);
        peonBlanco1.cambiarA(peonBlanco1, tablero[6][1]);
        
        Peon peonBlanco2 = peonPrototipo.clone();
        peonBlanco2.setID(2);
        peonBlanco2.cambiarA(peonBlanco2, tablero[6][2]);
        
        Peon peonBlanco3 = peonPrototipo.clone();
        peonBlanco3.setID(3);
        peonBlanco3.cambiarA(peonBlanco3, tablero[6][3]);
        
        Peon peonBlanco4 = peonPrototipo.clone();
        peonBlanco4.setID(4);
        peonBlanco4.cambiarA(peonBlanco4, tablero[6][4]);
        
        Peon peonBlanco5 = peonPrototipo.clone();
        peonBlanco5.setID(5);
        peonBlanco5.cambiarA(peonBlanco5, tablero[6][5]);
        
        Peon peonBlanco6 = peonPrototipo.clone();
        peonBlanco6.setID(6);
        peonBlanco6.cambiarA(peonBlanco6, tablero[6][6]);
        
        Peon peonBlanco7 = peonPrototipo.clone();
        peonBlanco7.setID(7);
        peonBlanco7.cambiarA(peonBlanco7, tablero[6][7]);

         System.out.println("2 A ver");
         JButton boton = new JButton();
         
         Peon otra = peonPrototipo.clone();
        otra.setID(0);
        otra.cambiarA(otra, boton);
        
         System.out.println("1 A ver");
         blanco.fichas.add(peonBlanco0);
         blanco.fichas.add(peonBlanco1);
         blanco.fichas.add(peonBlanco2);
         blanco.fichas.add(peonBlanco3);
         blanco.fichas.add(peonBlanco4);
         blanco.fichas.add(peonBlanco5);
         blanco.fichas.add(peonBlanco6);
         blanco.fichas.add(peonBlanco7);
         System.out.println("3 A ver");
        //Torres blancos
        Torre torreBlanco0 = torrePrototipo.clone();
        torreBlanco0.setID(8);
        torreBlanco0.cambiarA(torreBlanco0, tablero[7][0]);
        
        Torre torreBlanco1 = torrePrototipo.clone();
        torreBlanco1.setID(9);
        torreBlanco1.cambiarA(torreBlanco1, tablero[7][7]);
        blanco.fichas.add(torreBlanco0);
        blanco.fichas.add(torreBlanco1);
        
        
        //Caballos blancos
        
        Caballo caballoBlanco0 = caballoPrototipo.clone();
        caballoBlanco0.setID(10);
        caballoBlanco0.cambiarA(caballoBlanco0, tablero[7][1]);
        
        Caballo caballoBlanco1 = caballoPrototipo.clone();
        caballoBlanco1.setID(11);
        caballoBlanco1.cambiarA(caballoBlanco1, tablero[7][6]);

        blanco.fichas.add(caballoBlanco0);
        blanco.fichas.add(caballoBlanco1);
        
        //Alfiles blancos
        
        Alfil alfilBlanco0 = alfilPrototipo.clone();
        alfilBlanco0.setID(12);
        alfilBlanco0.cambiarA(alfilBlanco0, tablero[7][2]);
        
        Alfil alfilBlanco1 = alfilPrototipo.clone();
        alfilBlanco1.setID(13);
        alfilBlanco1.cambiarA(alfilBlanco1, tablero[7][5]);
        blanco.fichas.add(alfilBlanco0);
        blanco.fichas.add(alfilBlanco1);
        //Dama blanca
        
        Dama damaBlanco = damaPrototipo.clone();
        damaBlanco.setID(14);
        damaBlanco.cambiarA(damaBlanco, tablero[7][3]);

        blanco.fichas.add(damaBlanco);
        //Rey blanco
        
           Rey reyBlanco = reyPrototipo.clone();
        reyBlanco.setID(15);
        reyBlanco.cambiarA(reyBlanco, tablero[7][4]);
        blanco.fichas.add(reyBlanco);

        //Fichas negras
        //Peones negros
        
        Peon peonNegro0 = peonPrototipon.clone();
        peonNegro0.setID(0);
        peonNegro0.cambiarA(peonNegro0, tablero[1][0]);
        
        Peon peonNegro1 = peonPrototipon.clone();
        peonNegro1.setID(1);
        peonNegro1.cambiarA(peonNegro1, tablero[1][1]);
        
        Peon peonNegro2 = peonPrototipon.clone();
        peonBlanco2.setID(2);
        peonBlanco2.cambiarA(peonNegro2, tablero[1][2]);
        
        Peon peonNegro3 = peonPrototipon.clone();
        peonNegro3.setID(3);
        peonNegro3.cambiarA(peonNegro3, tablero[1][3]);
        
        Peon peonNegro4 = peonPrototipon.clone();
        peonNegro4.setID(4);
        peonNegro4.cambiarA(peonNegro4, tablero[1][4]);
        
        Peon peonNegro5 = peonPrototipon.clone();
        peonNegro5.setID(5);
        peonNegro5.cambiarA(peonNegro5, tablero[1][5]);
        
        Peon peonNegro6 = peonPrototipon.clone();
        peonNegro6.setID(6);
        peonNegro6.cambiarA(peonNegro6, tablero[1][6]);
        
        Peon peonNegro7 = peonPrototipon.clone();
        peonNegro7.setID(7);
        peonNegro7.cambiarA(peonNegro7, tablero[1][7]);

         negro.fichas.add(peonNegro0);
         negro.fichas.add(peonNegro1);
         negro.fichas.add(peonNegro2);
         negro.fichas.add(peonNegro3);
         negro.fichas.add(peonNegro4);
         negro.fichas.add(peonNegro5);
         negro.fichas.add(peonNegro6);
         negro.fichas.add(peonNegro7);
        //Torres negros
        
        Torre torreNegro0 = torrePrototipon.clone();
        torreNegro0.setID(8);
        torreNegro0.cambiarA(torreNegro0, tablero[0][0]);
        
        Torre torreNegro1 = torrePrototipon.clone();
        torreNegro1.setID(9);
        torreNegro1.cambiarA(torreNegro1, tablero[0][7]);
        negro.fichas.add(torreNegro0);
        negro.fichas.add(torreNegro1);
        //Caballos negros
        
        Caballo caballoNegro0 = caballoPrototipon.clone();
        caballoNegro0.setID(10);
        caballoNegro0.cambiarA(caballoNegro0, tablero[0][1]);
        
        Caballo caballoNegro1 = caballoPrototipon.clone();
        caballoNegro1.setID(11);
        caballoNegro1.cambiarA(caballoNegro1, tablero[0][6]);

        negro.fichas.add(caballoNegro0);
        negro.fichas.add(caballoNegro1);
        //Alfiles negros
        
        Alfil alfilNegro0 = alfilPrototipon.clone();
        alfilNegro0.setID(12);
        alfilNegro0.cambiarA(alfilNegro0, tablero[0][2]);
        
        Alfil alfilNegro1 = alfilPrototipon.clone();
        alfilNegro1.setID(13);
        alfilNegro1.cambiarA(alfilNegro1, tablero[0][5]);

        negro.fichas.add(alfilNegro0);
        negro.fichas.add(alfilNegro1);
        //Dama negros
        
        Dama damaNegro = damaPrototipon.clone();
        damaNegro.setID(14);
        damaNegro.cambiarA(damaNegro, tablero[0][3]);

        //Rey negro
        
           Rey reyNegro = reyPrototipon.clone();
        reyNegro.setID(15);
        reyNegro.cambiarA(reyNegro, tablero[0][4]);
        

        negro.fichas.add(damaNegro);
        //Rey negros

        negro.fichas.add(reyNegro);
    }
    
    //retorna si se  ha acabado la partida
    public boolean comer(Jugador rival, Ficha eliminada){
        boolean acabado = false;
        for(int i=0; i<rival.fichas.size(); i++){
            if(rival.fichas.get(i).equals(eliminada)){
                if(rival.fichas.get(i).getClass() == Rey.class){
                    acabado = true;
         
                }
                rival.fichas.remove(i);
            }
        }
        return acabado;
    }
    
}
