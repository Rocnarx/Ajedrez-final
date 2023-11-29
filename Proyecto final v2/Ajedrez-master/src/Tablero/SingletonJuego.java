package Tablero;
public class SingletonJuego {
    
    private static SingletonJuego instance;
    public Partida juego;
    
    private SingletonJuego(Partida juego){
        
        try 
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.juego = juego;
    }

    public Partida getJuego() {
        return juego;
    }
    
    
    
    
    public static SingletonJuego getInstance(Partida juego) {
        if (instance == null) {
            instance = new SingletonJuego(juego);
        }
        return instance;
    }
}
