public class Personaje3 {
    String nameEntregaDeProyectos;
    int vidaProyectos = 150, ataqueBasicoProyectos = 20, ataqueEspecialProyectos = 30;
    public void entregaDeProyectos(String nameEntregaDeProyectos, int vidaProyectos, int ataqueBasicoProyectos, int ataqueEspecialProyectos) {
        this.nameEntregaDeProyectos = nameEntregaDeProyectos;
        this.vidaProyectos = vidaProyectos;
        this.ataqueBasicoProyectos = ataqueBasicoProyectos;
        this.ataqueEspecialProyectos = ataqueEspecialProyectos;
    }
}