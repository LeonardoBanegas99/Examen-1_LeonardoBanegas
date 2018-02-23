package examen.pkg1_leonardobanegas;

import java.util.ArrayList;
import java.util.Date;

public class Carpeta extends Archivo{

    private ArrayList<Archivo> archivos = new ArrayList();

    public Carpeta() {
    }

    public Carpeta(String nombre, int tamano, Date fechacre, Date fechamod) {
        super(nombre, tamano, fechacre, fechamod);
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "archivos=" + archivos + '}';
    }
    
}
