package Logica;

public class ActividadSecuencial extends Actividad {
    private Actividad atrActividad1;
    private Actividad atrActividad3;
    
    public ActividadSecuencial(Actividad prmActividad1, Actividad prmActividad3){
        atrActividad1=prmActividad1;
        atrActividad3=prmActividad3;
    }

    public void Ejecutar() {
        atrActividad1.Ejecutar();
        atrActividad3.Ejecutar();
    }
}
