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
public class Mago extends Personajes{
    
    private int varita;
    private int hechizo;
    

    public Mago(int varita, int hechizo, int vida, int experiencia) {
        super(vida, experiencia);
        this.varita = varita;
        this.hechizo = hechizo;
    }

    public int getVarita() {
        return varita;
    }

    public void setVarita(int varita) {
        this.varita = varita + getAtaqueTotal();
    }

    public int getHechizo() {
        return hechizo;
    }

    public void setHechizo(int hechizo) {
        this.hechizo = hechizo + getDefensaTotal();
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
          vida = (varita - vida);
    }

    @Override
    public void defender() {
        this. vida= this.vida + hechizo;
    }
    
    
    
}
