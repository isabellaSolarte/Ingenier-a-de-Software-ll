package Logica;

public class TareaImprimir implements Tarea {
    String atrTexto;
    public TareaImprimir(String prmTexto){
        this.atrTexto=prmTexto;
    }
    public void Imprimir(){
        System.out.println(atrTexto);
    }

    @Override
    public void Ejecutar() {
        Imprimir();
    }
}
