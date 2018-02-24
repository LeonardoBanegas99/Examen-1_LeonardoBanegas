package examen.pkg1_leonardobanegas;

import java.util.Date;
import javax.swing.JTextArea;

public class ArchivodeTexto extends Archivo {

    private String texto;

    public ArchivodeTexto() {
    }

    public ArchivodeTexto(String texto, String nombre, int tamano, Date fechacre, Date fechamod) {
        super(nombre, tamano, fechacre, fechamod);
        this.texto = texto;
    }

    @Override
    public void Ejecutar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carpeta mod(String linea) {
        return null;
    }

    @Override
    public String mod(String linea, int x) {
       return "Ingrese texto: \n";
    }

}
