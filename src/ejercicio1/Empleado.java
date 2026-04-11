package ejercicio1;

public class Empleado extends Persona  {
	
	// Atributos
	
	private final int legajo;
	private String puesto;
	private static int contador=999;
	
	
	// constructores
	
	public Empleado()
	{
		super();
		
		contador++;
		
		this.legajo = contador;

	}
	
	public Empleado(String dni, String nombre, String apellido, java.time.LocalDate fechaNacimiento,
            String genero, String direccion, String telefono, String email,
            String puesto)
    {
     super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);

     this.puesto = puesto;

     contador++;

     this.legajo = contador;


     }
	
	// Getters y setters
	
	public int getLegajo() 
	{
		return legajo;
	}
	
	/* Eliminado

    public void setLegajo(int legajo) 
    {
        this.legajo = legajo;
    }
	*/
	
	public String getPuesto() 
	{
		return puesto;
	}
	
	public void setPuesto(String puesto) 
	{
		this.puesto = puesto;
	}
	
	
    // Método toString
    @Override
    public String toString() 
    {
        return "Empleado [legajo=" + legajo + ", puesto=" + puesto + ", " + super.toString() + "]";
    }
    
    // método estático devolver proximo legajo
    public static int devuelveProximoLegajo() 
    {
        return contador + 1;
    }

}


