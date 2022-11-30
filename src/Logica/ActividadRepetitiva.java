package Logica;

public class ActividadRepetitiva extends Actividad {
    private Tarea atrTarea;
    private int atrNumRepeticiones;

    public ActividadRepetitiva(Tarea prmTarea,int prmNumRepeticiones){
        atrTarea=prmTarea;
        atrNumRepeticiones=prmNumRepeticiones;
    }

    public void Ejecutar() {
        for(int i=0;i<atrNumRepeticiones;i++){
            atrTarea.Ejecutar();
        }
    }
}
