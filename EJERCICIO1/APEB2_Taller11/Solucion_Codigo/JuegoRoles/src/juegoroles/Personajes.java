/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoroles;
import java.util.ArrayList;

public abstract class Personajes {
    
    protected int vida;
    protected int experiencia;
    protected String estado;
    protected int energia;
    protected int cooldown;
    protected int cooldownMax;
    
    
    protected ArrayList<Objeto> inventario;
    protected Objeto objetoEquipado;
    
    public abstract void atacar(int vida);
    
    public abstract void defender();

    public Personajes(int vida, int experiencia) {
        this.vida = vida;
        this.experiencia = experiencia;
        this.estado = "";
        this.energia = 100;
        this.cooldown = 0;
        this.cooldownMax = 3;

        this.inventario = new ArrayList<>();
        this.objetoEquipado = null;
    }
    
    public void agregarObjeto(Objeto obj) {
        inventario.add(obj);
    }
    
    public boolean removerObjeto(Objeto obj) {
        return inventario.remove(obj);
    }
    public void usarHabilidadEspecial() {
        
        if (energia < 20) {
            System.out.println("No hay suficiente energía ");
            return;
        }
        
        if (cooldown > 0) {
            System.out.println("Habilidad en cooldown: " + cooldown);
            return;
        }

        System.out.println("Usa habilidad especial ");

        energia = energia - 20;
        cooldown = cooldownMax;
    }
     
      public void reducirCooldown() {
        if (cooldown > 0) {
            cooldown--;
        }
    }


    public ArrayList<Objeto> getInventario() {
        return inventario;
    }

    public Objeto getObjetoEquipado() {
        return objetoEquipado;
    }
    
    public boolean equipar(Objeto obj) {
        if (inventario.contains(obj)) {
            desequipar();
            objetoEquipado = obj;
            return true;
        }
        return false;
    }

    public void desequipar() {
        objetoEquipado = null;
    }
    
    public int getAtaqueTotal() {
        int total = 0;
        if (objetoEquipado != null && objetoEquipado instanceof Arma) {
            Arma a = (Arma) objetoEquipado;
            total += a.getDanio();
        }
        return total;
    }
    
    public int getDefensaTotal() {
        int total = 0;
        if (objetoEquipado != null && objetoEquipado instanceof Armadura) {
            Armadura a = (Armadura) objetoEquipado;
            total += a.getDefensa();
        }
        return total;
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

    public void alterarEstado(int estado) {
        String estado1 = "envenenado";
        String estado2 = "congelado";
        String estado3 = "boost fuerza";
        switch (estado) {
            case 1:
                this.estado = estado1;
                break;
            case 2:
                this.estado = estado2;
                break;
            case 3:
                this.estado = estado3;
                break;
            default:
                System.out.println("ERROR: Selecciona estados entre 1 y 3...");
                break;
        }
    }
    
    public String getEstado() {
        return estado;
    }

    
}