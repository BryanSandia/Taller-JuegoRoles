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
public class Guerrero extends Personajes{
    
    private int espada;
    private int escudo;

    public Guerrero(int espada, int escudo, int vida, int experiencia) {
        super(vida, experiencia);
        this.espada = espada;
        this.escudo = escudo;
    }

   
   

    public int getEspada() {
        return espada;
    }

    public void setEspada(int espada) {
        this.espada = espada;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
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
       vida = (espada - vida);
       
    }

    @Override
    public void defender() {
      this. vida= this.vida + escudo;
    }

    
    
    
}
