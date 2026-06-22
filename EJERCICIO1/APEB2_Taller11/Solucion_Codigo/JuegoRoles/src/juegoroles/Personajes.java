/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoroles;


public abstract class Personajes {
    
    protected int vida;
    protected int experiencia;
    
    public abstract void atacar(int vida);
    
    public abstract void defender();

    public Personajes(int vida, int experiencia) {
        this.vida = vida;
        this.experiencia = experiencia;
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
    
    
    
}
