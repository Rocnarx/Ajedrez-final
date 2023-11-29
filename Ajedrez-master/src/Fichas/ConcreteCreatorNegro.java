/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas;

/**
 *
 * @author Rocnar
 */
public class ConcreteCreatorNegro extends Creator {

    @Override
    public Peon crearFichaPeon() {

        Peon peon = new Peon();
        peon.casilla = null;
        peon.colorFicha = false;
        peon.id = 0;
        return peon;
    }

    @Override
    public Alfil crearFichaAlfil() {

        Alfil alfil = new Alfil();
        alfil.casilla = null;
        alfil.colorFicha = false;
        alfil.id = 0;
        return alfil;
    }

    @Override
    public Caballo crearFichaCaballo() {

        Caballo caballo = new Caballo();
        caballo.casilla = null;
        caballo.colorFicha = false;
        caballo.id = 0;
        return caballo;
    }

    @Override
    public Dama crearFichaDama() {

        Dama dama = new Dama();
        dama.casilla = null;
        dama.colorFicha = false;
        dama.id = 0;
        return dama;
    }

    @Override
    public Rey crearFichaRey() {

        Rey rey = new Rey();
        rey.casilla = null;
        rey.colorFicha = false;
        rey.id = 0;
        return rey;
    }

    @Override
    public Torre crearFichaTorre() {

        Torre torre = new Torre();
        torre.casilla = null;
        torre.colorFicha = false;
        torre.id = 0;
        return torre;
    }
}
