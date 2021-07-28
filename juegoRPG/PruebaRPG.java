import java.util.Scanner;

public class PruebaRPG {

    public static void main(String[] args) {
        int vida = 100;
        int atckEspFal = 2;
        int vidaPrimer = 75;
        int vidaSegundo = 150;
        int vidaTercero = 300;
        int ataqueEspecial = 50;
        int ataqueBasico = 30;
        String eleccionDeAtaque;
        Inventario inv;
        inv = new Inventario();
        
        

    
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola heroe, cual es tu nombre?");
        String nombrePrincipal = sc.nextLine();
        

        System.out.println("Bienvenido " + nombrePrincipal + ". Hoy ha sido tu primer dia en la prepaTEC y has descubierto los cientos de grupos estudiantiles que existen y la magia que estos tienen." + " Decidiste entrar a entrevistas a Nautilus 4010 y encontraste a un nuevo enemigo.");
        System.out.println("Te encontraste con tu primer reto, LA ENTREVISTA");

        do{
            if(Rand.enemyAtack()){
                System.out.println("El enemigo entrevista te ha golpeado.");
                System.out.println("El enemigo ha usado ¿Que vas a aportar al equipo?");
                vida -= 30;

            }else{
                System.out.println("El enemigo entrevista te ha golpeado.");
                System.out.println("El enemigo ha usado pregunta capciosa");
                vida -=  15;
            }

            System.out.println(nombrePrincipal + ": Que vas a hacer?");
            System.out.println("Tu vida es: " + vida);
            System.out.println("Te quedan " + atckEspFal + "  ataques especiales disponibles.");
            System.out.println("A) Ataque basico");
            System.out.println("B) Ataque especial");
            System.out.println("C) Inventario");

            eleccionDeAtaque = sc.next().toUpperCase();
                if (eleccionDeAtaque.equals("A")) {
                    System.out.println("Has utilizado el ataque se me trabo el zoom");
                    vidaPrimer = vidaPrimer - ataqueBasico;
                    System.out.println("A Entrevista le queda " + vidaPrimer + " de vida.");
                    eleccionDeAtaque = eleccionDeAtaque.replace("A"," ");
                        
                } else {
                    if (eleccionDeAtaque.equals("B")){
                        
                    
                    if (atckEspFal <= 0) {
                        System.out.println("No tienes ataque especiales disponibles");
                        eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                    } else {
                        System.out.println("Has utilizado el ataque disparo de Balderas");
                        vidaPrimer = vidaPrimer - ataqueEspecial;
                        System.out.println("A Entrevista le queda " + vidaPrimer + " de vida.");
                        atckEspFal = atckEspFal -1;
                        eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                    }
                    
                } if (eleccionDeAtaque.equals("C")){
                    inv.elegirInv(vida,ataqueEspecial,true);
                }
            }


        }while((vidaPrimer >= 0) && (vida >= 1));

        System.out.println("Felicidades! Has derrotado a Entrevista");
        vida = 100;
        atckEspFal = 2;
    
        System.out.println("Te has encontrado con el enemigo ENTREGA DE PROYECTOS");
            
            do{
                if(Rand.enemyAtack()){
                    System.out.println("El enemigo entrega de proyectos te ha golpeado.");
                    System.out.println("El enemigo ha usado eres el unico que trabaja en el equipo");
                    vida -= 30;

                }else{
                    System.out.println("El enemigo entrega de proyectos te ha golpeado.");
                    System.out.println("El enemigo ha usado ensayo de 25 cuartillas en formato Apa");
                    vida -= 20;
                }

                if (vida >= 21){
                System.out.println(nombrePrincipal + ": Que vas a hacer?");
                System.out.println("Tu vida es: " + vida);
                System.out.println("Te quedan " + atckEspFal + "  ataques especiales disponibles.");
                System.out.println("A) Ataque basico");
                System.out.println("B) Ataque especial");
                System.out.println("C) Inventario");

                eleccionDeAtaque = sc.next().toUpperCase();
                    if (eleccionDeAtaque.equals("A")) {
                        System.out.println("Has utilizado el ataque se me trabo el zoom");
                        vidaSegundo = vidaSegundo - ataqueBasico;
                        System.out.println("A Entrevista le queda " + vidaSegundo + " de vida.");
                        eleccionDeAtaque = eleccionDeAtaque.replace("A"," ");
                            
                    } else {
                        if (atckEspFal <= 0) {
                            System.out.println("No tienes ataque especiales disponibles");
                            eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                        } else {
                            System.out.println("Has utilizado el ataque disparo de Balderas");
                            vidaSegundo = vidaSegundo - ataqueEspecial;
                            System.out.println("A Entrevista le queda " + vidaSegundo + " de vida.");
                            atckEspFal = atckEspFal -1;
                            eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                        } if (eleccionDeAtaque.equals("C")){
                            inv.elegirInv(vida,ataqueEspecial,true);
                        }
                    }
                }

            } while((vidaSegundo >= 0) && (vida >= 21));

            if (vida <= 21){
                System.out.println("Has perdido");
            }else{
            System.out.println("Felicidades! Has derrotado a Entrega de Proyectos");
            vida = 100;
            atckEspFal = 2; 
            
            System.out.println("Te has encontrado con PLATICA CON VIC");
            
            do{
                
                        if(Rand.enemyAtack()){
                            System.out.println("El enemigo entrega de proyectos te ha golpeado.");
                            System.out.println("El enemigo ha usado: ¿Por que te tengo que dejar entrar en el equipo?");
                            vida -= 45;

                        }else{
                            System.out.println("El enemigo entrega de proyectos te ha golpeado.");
                            System.out.println("El enemigo ha usado pregunta basica");
                            vida -= 30;
                        }

                        if (vida >= 21){
                        System.out.println(nombrePrincipal + ": Que vas a hacer?");
                        System.out.println("Tu vida es: " + vida);
                        System.out.println("Te quedan " + atckEspFal + "  ataques especiales disponibles.");
                        System.out.println("A) Ataque basico");
                        System.out.println("B) Ataque especial");
                        System.out.println("C) Inventario");

                        eleccionDeAtaque = sc.next().toUpperCase();
                            if (eleccionDeAtaque.equals("A")) {
                                System.out.println("Has utilizado el ataque se me trabo el zoom");
                                vidaTercero = vidaTercero - ataqueBasico;
                                System.out.println("A Entrevista le queda " + vidaTercero + " de vida.");
                                eleccionDeAtaque = eleccionDeAtaque.replace("A"," ");
                                    
                            } else {
                                if (atckEspFal <= 0) {
                                    System.out.println("No tienes ataque especiales disponibles");
                                    eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                                } else {
                                    System.out.println("Has utilizado el ataque disparo de Balderas");
                                    vidaTercero = vidaTercero - ataqueEspecial;
                                    System.out.println("A Entrevista le queda " + vidaTercero + " de vida.");
                                    atckEspFal = atckEspFal -1;
                                    eleccionDeAtaque = eleccionDeAtaque.replace("B"," ");
                                } if (eleccionDeAtaque.equals("C")){
                                    inv.elegirInv(vida,ataqueEspecial,true);
                                }
                            }
                        }

            }while((vidaTercero >= 0) && (vida >= 21));
            

        sc.close();
      
        }
 }
    
        
}
