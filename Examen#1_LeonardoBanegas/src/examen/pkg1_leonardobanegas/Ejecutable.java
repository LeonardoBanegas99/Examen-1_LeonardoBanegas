package examen.pkg1_leonardobanegas;

import java.util.Date;

public class Ejecutable extends Archivo {

    private String texto;
    private SistemaOperativo so;

    public Ejecutable() {
    }

    public Ejecutable(String texto, SistemaOperativo so, String nombre, int tamano, Date fechacre, Date fechamod) {
        super(nombre, tamano, fechacre, fechamod);
        this.texto = texto;
        this.so = so;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public SistemaOperativo getSo() {
        return so;
    }

    public void setSo(SistemaOperativo so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "Ejecutable{" + "texto=" + texto + ", so=" + so + '}';
    }

    @Override
    public void Ejecutar() {

    }

    @Override
    public void mod(String linea) {
    }

}
