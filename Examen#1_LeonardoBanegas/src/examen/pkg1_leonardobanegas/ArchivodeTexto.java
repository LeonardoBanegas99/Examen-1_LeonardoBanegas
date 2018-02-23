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

}
