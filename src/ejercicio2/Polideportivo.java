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
