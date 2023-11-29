/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichas;

/**
 *
 * @author Rocnar
 */
public abstract class Creator {

    Peon peon;
    Alfil alfil;
    Caballo caballo;
    Dama dama;
    Rey rey;
    Torre torre;

    public void crearFichas() {

        peon = crearFichaPeon();
        alfil = crearFichaAlfil();
        caballo = crearFichaCaballo();
        dama = crearFichaDama();
        rey = crearFichaRey();
        torre = crearFichaTorre();

    }

    public Peon getPeon() {
        return peon;
    }

    public Alfil getAlfil() {
        return alfil;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public Dama getDama() {
        return dama;
    }

    public Rey getRey() {
        return rey;
    }

    public Torre getTorre() {
        return torre;
    }

    
    public abstract Peon crearFichaPeon();

    public abstract Alfil crearFichaAlfil();

    public abstract Caballo crearFichaCaballo();

    public abstract Dama crearFichaDama();

    public abstract Rey crearFichaRey();

    public abstract Torre crearFichaTorre();
}
