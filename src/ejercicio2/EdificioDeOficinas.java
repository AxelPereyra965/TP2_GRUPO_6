package ejercicio2;

public class EdificioDeOficinas implements interfazEdificio {

    private double superficie;
    private int numeroOficinas;

    public EdificioDeOficinas(double superficie, int numeroOficinas) {
        this.superficie = superficie;
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas superficie=" + superficie + ", numeroOficinas=" + numeroOficinas;
    }
}

