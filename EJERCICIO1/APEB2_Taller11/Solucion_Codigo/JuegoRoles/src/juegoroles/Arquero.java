/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoroles;

/**
 *
 * @author Usuario
 */
public class Arquero extends Personajes{
    
    private int flecha;
    private int arco; 

    public Arquero(int flecha, int arco, int vida, int experiencia) {
        super(vida, experiencia);
        this.flecha = flecha;
        this.arco = arco;
    }

   

    public int getFlecha() {
        return flecha;
    }

    public void setFlecha(int flecha) {
        this.flecha = flecha;
    }

    public int getArco() {
        return arco;
    }

    public void setArco(int arco) {
        this.arco = arco;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void atacar(int vida) {
         vida = (flecha - vida);
    }

    @Override
    public void defender() {
        this. vida= this.vida + arco;
    }
    
    
    
}
