package examen.pkg1_leonardobanegas;

public class SistemaOperativo {

    private String nombre;
    private String usuario;
    private int capacidad;
    private Carpeta carpetaraiz;

    public SistemaOperativo(String nombre, String usuario, int capacidad, Carpeta carpetaraiz) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.capacidad = capacidad;
        this.carpetaraiz = carpetaraiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Carpeta getCarpetaraiz() {
        return carpetaraiz;
    }

    public void setCarpetaraiz(Carpeta carpetaraiz) {
        this.carpetaraiz = carpetaraiz;
    }

    @Override
    public String toString() {
        return "SistemaOperativo{" + "nombre=" + nombre + ", usuario=" + usuario + ", capacidad=" + capacidad + ", carpetaraiz=" + carpetaraiz + '}';
    }

}
