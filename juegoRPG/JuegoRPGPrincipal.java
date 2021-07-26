import java.util.Scanner;
public class JuegoRPGPrincipal {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Acabas de entrar a tu primer semestre de PrepaTec y te enteras del grupo estudiantil de robótica Nautilus 4010 y te gustaría entrar.\n¿Cuál es tu nombre?");  
        String nombre = sc.nextLine();
        sc.close();
        System.out.println(nombre);
        PersonajePrincipal personaje1 = new PersonajePrincipal();
        personaje1.atributos(nombre);
        if (personajePrincipal.vida = 0 ){
            System.out.println("Lo sentimos, pero no fuiste seleccionado para entrar a Nautilus");
            break;
        } else {
            break;
        }
        //Jefe o Personaje 2
        entregaDeProyectos();
        System.out.println("¡Oh no! Te has topado con " + entregaDeProyectos + " .");
        //Espacio para que se desarrolle la pelea
        System.out.println("Felicidades, lograste derrotar a la" + entregaDeProyectos + " .");
    }
}
