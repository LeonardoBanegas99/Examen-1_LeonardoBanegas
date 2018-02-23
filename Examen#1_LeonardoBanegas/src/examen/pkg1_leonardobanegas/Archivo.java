package examen.pkg1_leonardobanegas;

import java.util.Date;

public abstract class Archivo {

    private String nombre;
    private int tamano;
    private Date fechacre;
    private Date fechamod;

    public Archivo(String nombre, int tamano, Date fechacre, Date fechamod) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.fechacre = fechacre;
        this.fechamod = fechamod;
    }

    public Archivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Date getFechacre() {
        return fechacre;
    }

    public void setFechacre(Date fechacre) {
        this.fechacre = fechacre;
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", tamano=" + tamano + ", fechacre=" + fechacre + ", fechamod=" + fechamod + '}';
    }
    
    public abstract void Ejecutar();
}
