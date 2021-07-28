public class PersonajePrincipal {
    public void atributos (String nombrePrincipal){
        int vida = 100;
        int ataqueBásico = 30; 
        int ataqueEspecial = 50;      
    }
    public void ataqueBasico(String nombreAtaque,int dañoAtaque){
        String nA = nombreAtaque;
        int dA = dañoAtaque;
    }
    public void ataqueEspecial(String nombreAtaqueEspecial, int dañoAtaqueEspecial){
        String nAS = nombreAtaqueEspecial;
        int dAS = dañoAtaqueEspecial;
        int numUsos = 2;
        if (numUsos > 0){
            System.out.println("Puedes ocupar " + nAS);
            System.out.println("Te quedan " + numUsos + " usos de este ataque");
        }else if (numUsos == 0){
          dAS = 0;
          System.out.println("No puedes volver a ocupar este ataque");  
        }   
        

    }
}