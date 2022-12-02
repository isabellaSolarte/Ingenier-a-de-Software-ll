package Logica;

public class ClsHilos extends Thread{
    private Tarea atrTarea;
    
    public ClsHilos (Tarea prmTarea){
        atrTarea=prmTarea;
    }

    @Override
    public void run(){
        atrTarea.Ejecutar();
    }
}