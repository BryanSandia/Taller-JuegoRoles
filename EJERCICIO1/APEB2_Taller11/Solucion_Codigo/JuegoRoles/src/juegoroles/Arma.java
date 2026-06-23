package juegoroles;

public class Arma extends Objeto {
    
    private String tipo;
    private int danio;
    private int alcance;

    public Arma(String tipo, int danio, int alcance, String nombreEquipo, String rareza, int durabilidad, int nivelEquipo, int valor) {
        super(nombreEquipo, rareza, durabilidad, nivelEquipo, valor);
        this.tipo = tipo;
        this.danio = danio;
        this.alcance = alcance;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

}
