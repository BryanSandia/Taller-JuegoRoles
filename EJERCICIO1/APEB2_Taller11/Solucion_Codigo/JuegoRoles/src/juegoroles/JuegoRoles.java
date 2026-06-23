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
        
        Arma espada = new Arma("cuerpo a cuerpo", 25, 1, "Espada de acero", "común", 50, 1, 100);
        Arma varita = new Arma("magia", 50, 3, "Varita de roble", "rara", 30, 1, 200);
        Arma arco = new Arma("distancia", 20, 5, "Arco largo", "común", 40, 1, 150);

        Armadura escudo = new Armadura("pesada", 15, 10, "Escudo de hierro", "común", 60, 1, 120);
        Armadura tunica = new Armadura("ligera", 10, 5, "Túnica de mago", "rara", 30, 1, 180);
        Armadura capa = new Armadura("elastica",8,3,"Capa de arquero","especial",20,1,50);

        // Equipar a cada personaje
        g.agregarObjeto(espada);
        g.agregarObjeto(escudo);
        g.equipar(espada);

        m.agregarObjeto(varita);
        m.agregarObjeto(tunica);
        m.equipar(varita);

        a.agregarObjeto(arco);
        a.agregarObjeto(capa);
        a.equipar(arco);
        
        g.setEspada(g.getEspada()); 
        g.setEscudo(g.getEscudo());

        m.setVarita(m.getVarita());
        m.setHechizo(m.getHechizo());

        a.setFlecha(a.getFlecha());
        a.setArco(a.getArco());
        //Caso base solo el mago puede ganar
        
        pelear(g, m);
        
    }
    
    public static Personajes pelear(Personajes obj1, Personajes obj2){
        
       
        while(obj1.vida > 0 && obj2.vida > 0){
            obj1.atacar(obj2.vida);
            obj2.defender();
            if (obj2.getVida() <= 0) break;
            obj2.atacar(obj1.vida); 
            obj1.defender();
            if (obj1.getVida() <= 0) break;
        }
        if(obj1.vida <= 0){
            System.out.println("El personaje 2 ganó la batalla vida = " + obj2.getVida() );
            obj2.experiencia ++; 
            return obj2;
            
        }else if(obj2.vida <= 0){
             System.out.println("El personaje 1 ganó la batalla vida = " + obj1.getVida() );
            obj1.setExperiencia(obj1.getExperiencia()+ 1);
            return obj1;
            
        }else{
            System.out.println("Los dos personajes quedaron empates");
            return null;    
        }
    }
    
}
