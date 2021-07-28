import java.util.ArrayList;
import java.util.Scanner;
public class Inventario {
    /*ArrayList <String> cosasDeInventario;
    cosasDeInventario = new ArrayList <String>();
    cosasDeInventario.add("0:CV");
    cosasDeInventario.add("1:Sermón");
    cosasDeInventario.add("2:Convencer a tu equipo de que haga algo");
    cosasDeInventario.add("3:Recomendación de Cin");
    */
    String obj1 = "1";
    String obj2 = "2";
    String obj3 = "3";
    String obj4 = "4";
    String salir = "5";
    boolean obj1bol = true;
    boolean obj2bol = true;
    boolean obj3bol = true;
    boolean obj4bol = true;
    String seleccionInventario;
    boolean conciclo = true;
    public void elegirInv(int vida, int ataqueEspecial,boolean conciclo) {
        
        while (conciclo == true){
            Scanner schere = new Scanner(System.in);
            textoInventario1();
            seleccionInventario = schere.nextLine();
            schere.close();
            if (seleccionInventario.equals("1")) {
                if (obj1bol == true){
                    vida += 30;
                    obj1bol = false; 
                } else {
                    textoInventario3();
                    break;
                }
            } else if (seleccionInventario.equals("2")) {
                if (obj2bol == true){
                    ataqueEspecial *= 2;
                    obj2bol = false; 
                } else {
                    textoInventario3();
                    break;
                }
            } else if (seleccionInventario.equals("3")) {
                if (obj3bol == true){
                    vida += 50;
                    obj3bol = false; 
                } else {
                    textoInventario3();
                    break;
                }
            } else if (seleccionInventario.equals("4")) {
                if (obj4bol == true){
                    vida += 80;
                    obj4bol = false; 
                } else {
                    textoInventario3();
                    break;
                } 
                    
                
        } else if (seleccionInventario.equals("5")){
            System.out.println("Saliste del inventario");
            conciclo = false;
        }
        textoInventario2(vida,ataqueEspecial);
        schere.close();
    }
        }
        
    public static void textoInventario1(){
        System.out.println("Selecciona el objeto del inventario que desees con el número correspondiente\n 1:CV\n 2: Sermón\n 3: Convencer a tu equipo de que haga algo\n 4:Recomendación de Cin\n 5: Salir del inventario");
    }
    public static void textoInventario2 (int vida, int ataqueEspecial){
        System.out.println("El objeto seleccionado afecto alguno de tus atributos");
        System.out.println("Tu estado actual es vida: " + vida + " ataqueEspecial: " + ataqueEspecial);
    }
    public static void textoInventario3(){
        System.out.println("Este objeto ya no esta disponible");
    }
    

        /*public void Inventario(){
        ArrayList <String> cosasDeInventario;
        cosasDeInventario = new ArrayList <String>();
        cosasDeInventario.add("CV");
        cosasDeInventario.add("Sermón");
        cosasDeInventario.add("Convencer a tu equipo de que haga algo");
        cosasDeInventario.add("Recomendación de Cin");
        */
         /*if (schere.equals(0)){
            cosasDeInventario.remove(0);
            vida += 30;

        } else if(schere.equals(1)){
            cosasDeInventario.remove(1);
            ataqueEspecial *=2;
        } else if(schere.equals(2)){
            cosasDeInventario.remove(2);
            vida += 80; */
    
}
