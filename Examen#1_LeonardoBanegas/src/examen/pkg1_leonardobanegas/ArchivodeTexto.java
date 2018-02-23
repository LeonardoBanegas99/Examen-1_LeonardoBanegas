package examen.pkg1_leonardobanegas;

import java.util.Date;

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

}
