package Logica;

public class ActividadParalelo extends Actividad{
    private Tarea atrTarea;
    private Tarea atrTarea2;
    private int atrSalida=0;
  
    public ActividadParalelo(Tarea prmTarea, Tarea prmTarea1){
        atrTarea=prmTarea;
        atrTarea2=prmTarea1;
    }
  
    public int getAtrSalida() {
        return atrSalida;
    }

    public void setAtrSalida(int atrSalida) {
        this.atrSalida = atrSalida;
    }

    public void Ejecutar(){
        ClsHilos actividad1 = new ClsHilos(atrTarea);
        ClsHilos actividad2 = new ClsHilos(atrTarea2);
        try {
            actividad1.start();
            actividad2.start();
        } catch (Exception e) {
            atrSalida=1;
        }
    }
}