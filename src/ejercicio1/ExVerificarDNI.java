package ejercicio1;

public class ExVerificarDNI extends RuntimeException 
{

    public ExVerificarDNI() 
    {
        super("El DNI ingresado no es valido");
    }

    public ExVerificarDNI(String mensaje) 
    {
        super(mensaje);
    }
}