import java.util.Scanner;
import java.util.ArrayList;
public class Combate {
    public static void combate(boolean permisoCombate, ArrayList <String> enemigo, int [] enemigoNumDatos, String pInteraccion){
        /**Esta clase funciona para agilizar el codigo y poder ejecutar todos los combates de el juego
        utiliza las clases "AccionesPrincipales y personajePrincipal" para ser ejecutado en caso de que se quiera cambiar esto se puede hacer quitando todos los parámetros que tengan que ver con la clase "PersonajePrincipal".
        Es necesario hacer un ArrayList de cada personaje para poder ejecutar este código, van a ser 2, uno para los datos Strings y otro para datos importantes int del enemigo; entre cada espacio del ArrayList de Strings va a ir lo siguiente:
        1: nombre del enemigo
        2: nombre del ataque basico (ilimitado)
        3: nombre del ataque especial
        4: una breve descripcion del personaje
        En el otro ArrayList tipo int va haber lo siguiente:
        1: vida del enemigo
        2: puntos del ataque básico del enemigo
        3: puntos del ataque especial del enemigo
        Las limitantes de cada ataque del enemigo estoy planeando que sea en otra clase llamada "inteligencia artificial del enemigo" para poder acceder a cada acción del enemigo y a su vez sus limitantes
        Este archivo es la primera versión prototipo de la clase combate, estará sujeta a posibles cambios en el futuro 
        Cambios necesarios: -Capacidad de poder tener una interfaz gráfica.
        -Que pueda interactuar con la inteligencia artificial del personaje.
        -Modificacion de errores o bugs. */

        enemigo = new ArrayList <String>();// Aquí estan los todos datos tipo String del enemigo
        enemigoNumDatos = new int [4]; // Para tener los datos numericos de sus atributos 
        AccionesPrincipales a = new AccionesPrincipales();
        PersonajePrincipal pPrincipal = new PersonajePrincipal();
        final String nameABasico = "Se me trabó zoom";
        int ataqueBasico = 30;
        final String nameAEspecial = "Disparo de Balderas";
        pPrincipal.ataqueBasico(nameABasico,ataqueBasico);
        int ataqueEspecial = 50;
        
        while (permisoCombate = true){
            Scanner sq = new Scanner(System.in);
            System.out.println("¿Qué acción harás?");
            System.out.println("1: Atacar\n 2: Ver información enemigo\n 3: Ver inventario\n 4: Ver mi estado\n 5: pausa");
            String preguntaAc = sq.nextLine();
            sq.close();
            
            if (preguntaAc == "1"){
                System.out.println("Elige tu ataque:");
                Scanner sqataque = new Scanner(System.in);
                System.out.println("1: Se me trabó zoom \n 2: Disparo de Balderas");
                String attack = sqataque.nextLine();
            
                
                if (attack == "1"){
                    a.ataque(nameABasico , ataqueBasico , enemigoNumDatos[0], true); 
                    System.out.println("El ataque " + ataqueBasico + " daño al objetivo");
                    break;
                } 
                else if (attack == "2"){
                    a.ataque(nameAEspecial , ataqueEspecial , enemigoNumDatos[0], true); 
                    pPrincipal.ataqueEspecial(nameAEspecial, ataqueEspecial);
                    System.out.println("El ataque " + ataqueEspecial + " daño al objetivo");
                    break; 
                }
            }
            else if (preguntaAc == "2"){
                a.infoPersonaje(enemigo.get(1), enemigo.get(2) , enemigo.get(3) , enemigo.get(4));
            }
            else if (preguntaAc == "3"){
                //Aquí se pone la instancia inventario
            } 
        }
    }
}
    