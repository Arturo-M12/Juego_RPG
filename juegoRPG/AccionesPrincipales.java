
import java.util.Scanner;
public class AccionesPrincipales{
    public void ataque(String nombreAtaque,int ataque,int vidaObjetivo,boolean confirmaciónAtaque){
        if (confirmaciónAtaque == true){
            int daño = vidaObjetivo - ataque;
            vidaObjetivo = daño; 
            if (vidaObjetivo == 0){
                confirmaciónAtaque = false;
            }
            else if (ataque == 0){
                confirmaciónAtaque = false;
            }
        }         
        }
    public static void infoPersonaje (String nombrePersonaje, String nombreAtaque1, String nombreAtaqueEspecial, String descripciónPersonaje){
        System.out.println("Nombre: " + nombrePersonaje);
        System.out.println("Descripción: " + descripciónPersonaje);
        System.out.println("Sus ataques son los siguientes: \n" + "Ataque básico: " + nombreAtaque1 + "\n Ataque especial: " + nombreAtaqueEspecial);
    }
    public void statusPersonaje(int vida, String nombrePersonaje){
        System.out.println("Tiene " + vida + " HP");
        
    }
    
    
}