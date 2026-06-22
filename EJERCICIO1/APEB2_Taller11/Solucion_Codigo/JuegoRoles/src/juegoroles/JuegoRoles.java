/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoroles;


public class JuegoRoles {

    
    public static void main(String[] args) {
       
        Guerrero g = new Guerrero(20, 20, 100, 0);
        Mago m = new Mago(40, 20, 100, 0);
        Arquero a = new Arquero(20, 20, 100, 0);
        
        //Caso base solo el mago puede ganar
        
        pelear(g, m);
        
    }
    
    public static Personajes pelear(Personajes obj1, Personajes obj2){
        
       
        while(obj1.vida == 0 || obj2.vida == 0){
            obj1.atacar(obj2.vida);
            obj2.defender();
            obj2.atacar(obj1.vida);
            obj1.defender();
        }
        if(obj1.vida == 0){
            System.out.println("El personaje 2 ganó la batalla vida = " + obj2.getVida() );
            obj2.experiencia ++; 
            return obj2;
            
        }else if(obj2.vida == 0){
             System.out.println("El personaje 1 ganó la batalla vida = " + obj1.getVida() );
            obj1.setExperiencia(obj1.getExperiencia()+ 1);
            return obj1;
            
        }else{
            System.out.println("Los dos personajes quedaron empates");
            return null;    
        }
    }
    
}
