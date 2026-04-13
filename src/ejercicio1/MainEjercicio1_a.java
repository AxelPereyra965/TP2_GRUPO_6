package ejercicio1;

public class MainEjercicio1_a {

    public static void main(String[] args) {

        try {
            Persona p = new Persona("AA202020", "Juan", "Perez", null, "", "", "", "");
            Persona.verificarDNI(p.getDni());
            System.out.println("Persona agregada correctamente");

        } catch (ExVerificarDNI e) {
        	//Logica DNI invalido
        }

        try {
            Persona p2 = new Persona("20202020", "Alexis", "Fernandez", null, "", "", "", "");
            Persona.verificarDNI(p2.getDni());
            System.out.println("Persona agregada correctamente");

        } catch (ExVerificarDNI e) {
            //Logica DNI invalido
        }

    }
}