import Logica.Actividad;
import Logica.ActividadCondicional;
import Logica.ActividadParalelo;
import Logica.ActividadRepetitiva;
import Logica.ActividadSecuencial;
import Logica.Tarea;
import Logica.TareaImprimir;

public class App {
    public static void main(String[] args) throws Exception {
        Tarea tarea1=new TareaImprimir("Hola");
        Tarea tarea2=new TareaImprimir("principios");
        Tarea tarea3=new TareaImprimir("solid");
        Tarea tarea4=new TareaImprimir("bien");
        Tarea tarea5=new TareaImprimir("algo ha fallado");

        Actividad actividad1=new ActividadRepetitiva(tarea1, 5);
        ActividadParalelo actividad2=new ActividadParalelo(tarea2,tarea3);
        Actividad actividad3=new ActividadCondicional(tarea4, tarea5,actividad2);
        ActividadSecuencial actividad4=new ActividadSecuencial(actividad1, actividad3);
        actividad4.Ejecutar();
        
    }
}
