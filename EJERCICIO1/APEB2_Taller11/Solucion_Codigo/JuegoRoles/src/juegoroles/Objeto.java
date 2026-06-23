package juegoroles;

public abstract class Objeto {
   
    protected String nombreEquipo;
    protected String rareza;
    protected int durabilidad;
    protected int nivelEquipo;
    protected int valor;

    public Objeto(String nombreEquipo, String rareza, int durabilidad, int nivelEquipo, int valor) {
        this.nombreEquipo = nombreEquipo;
        this.rareza = rareza;
        this.durabilidad = durabilidad;
        this.nivelEquipo = nivelEquipo;
        this.valor = valor;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getNivelEquipo() {
        return nivelEquipo;
    }

    public void setNivelEquipo(int nivelEquipo) {
        this.nivelEquipo = nivelEquipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
