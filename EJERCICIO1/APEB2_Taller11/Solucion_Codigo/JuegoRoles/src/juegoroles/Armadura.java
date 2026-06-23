package juegoroles;

public class Armadura extends Objeto {
    
   private String tipo;
   private int defensa;
   private int peso;

    public Armadura(String tipo, int defensa, int peso, String nombreEquipo, String rareza, int durabilidad, int nivelEquipo, int valor) {
        super(nombreEquipo, rareza, durabilidad, nivelEquipo, valor);
        this.tipo = tipo;
        this.defensa = defensa;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
   
   
}
