package ejercicio2;

public class EdificioDeOficinas {

    private int numeroOficinas;

    public EdificioDeOficinas(int numeroOficinas) 
    {
        this.numeroOficinas = numeroOficinas;
    }

    public int getNumeroOficinas() 
    {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) 
    {
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public String toString() 
    {
        return "EdificioDeOficinas numero de oficinas=" + numeroOficinas;
    }
}
