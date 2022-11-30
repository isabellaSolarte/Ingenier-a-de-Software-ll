package Logica;

public class ActividadCondicional extends Actividad{
    private Tarea atrTarea;
    private Tarea atrTarea2;
    private ActividadParalelo atrActividad;

    public ActividadCondicional(Tarea prmTarea,Tarea prmTarea2,ActividadParalelo prmActividad ){
        atrActividad=prmActividad;
        atrTarea=prmTarea;
        atrTarea2=prmTarea2;
    }
    
    public void Ejecutar() {
        atrActividad.Ejecutar();
        if(atrActividad.getAtrSalida()==0)
            atrTarea.Ejecutar();
        else
            atrTarea2.Ejecutar();
    }
}