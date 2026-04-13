package ejercicio1;

public class MainEjercicio1_a {

    public static void main(String[] args) {

        try {
            Persona p = new Persona("20202020", "Juan", "Perez", null, "", "", "", "");
            Persona.verificarDNI(p.getDni());
            System.out.println("Persona agregada correctamente");

        } catch (ExVerificarDNI e) {
            //Logica DNI invalido
        }

    }
}