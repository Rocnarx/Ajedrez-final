package Fichas;

public class ConcreteCreatorBlanco extends Creator {

    @Override
    public Peon crearFichaPeon() {

        Peon peon = new Peon();
        peon.casilla = null;
        peon.colorFicha = true;
        peon.id = 0;
        return peon;
    }

    @Override
    public Alfil crearFichaAlfil() {

        Alfil alfil = new Alfil();
        alfil.casilla = null;
        alfil.colorFicha = true;
        alfil.id = 0;
        return alfil;
    }

    @Override
    public Caballo crearFichaCaballo() {

        Caballo caballo = new Caballo();
        caballo.casilla = null;
        caballo.colorFicha = true;
        caballo.id = 0;
        return caballo;
    }

    @Override
    public Dama crearFichaDama() {

        Dama dama = new Dama();
        dama.casilla = null;
        dama.colorFicha = true;
        dama.id = 0;
        return dama;
    }

    @Override
    public Rey crearFichaRey() {

        Rey rey = new Rey();
        rey.casilla = null;
        rey.colorFicha = true;
        rey.id = 0;
        return rey;
    }

    @Override
    public Torre crearFichaTorre() {

        Torre torre = new Torre();
        torre.casilla = null;
        torre.colorFicha = true;
        torre.id = 0;
        return torre;
    }

}
