package examen.pkg1_leonardobanegas;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextArea;

public class Carpeta extends Archivo {

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

    @Override
    public void Ejecutar() {

    }

    @Override
    public Carpeta mod(String linea) {
        String[] sepa;
        Carpeta carpactual;
        sepa = linea.split(" ");
        String s = sepa[2];
        for (int i = 0; i < this.getArchivos().size(); i++) {
            if (this.getArchivos().get(i).getNombre().equals(s)) {
                if (this.getArchivos().get(i) instanceof Carpeta) {
                    carpactual = ((Carpeta) this.getArchivos().get(i));
                    return carpactual;
                }
            }
        }
        return this;
    }

    @Override
    public String mod(String linea, int x) {
        String[] sepa;
        Carpeta carpactual;
        sepa = linea.split(" ");
        String s = sepa[2];
        for (int i = 0; i < this.getArchivos().size(); i++) {
            if (this.getArchivos().get(i).getNombre().equals(s)) {
                this.getArchivos().get(i).mod(linea);
            }
        }
        return "";
    }
}
