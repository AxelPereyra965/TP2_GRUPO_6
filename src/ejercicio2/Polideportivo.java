package ejercicio2;

public class Polideportivo implements interfazEdificio, InterfazInstalacionDeportiva {

    // Atributos
    private String nombre;
    private double superficie;
    private int tipoInstalacion;

    // Constructor
    public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.tipoInstalacion = tipoInstalacion;
    }

    // interfaces
    @Override
    public int getTipoDeInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
        
    }
    

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setTipoInstalacion(int tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    // Mostrar la información
    @Override
    public String toString() {
        return "Polideportivo nombre=" + nombre + ", superficie=" + superficie + ", tipoInstalacion=" + tipoInstalacion ;
    }
}
