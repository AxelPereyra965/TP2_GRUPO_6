package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

    public static void main(String[] args) {

    	
        Persona p1 = new Persona(
            "30111111", "Carlos", "Sánchez",
            LocalDate.of(1985, 5, 20),
            "Masculino", "Calle Falsa 123", "1111111111", "carlos@mail.com"
        );

        Persona p2 = new Persona(
            "30222222", "María", "Gómez",
            LocalDate.of(1990, 8, 14),
            "Femenino", "Avenida Siempre Viva 456", "2222222222", "maria@mail.com"
        );

        Persona p3 = new Persona(
            "30333333", "Luis", "Fernández",
            LocalDate.of(1978, 11, 3),
            "Masculino", "Boulevard Central 789", "3333333333", "luis@mail.com"
        );

        Persona p4 = new Persona(
            "30444444", "Ana", "Martínez",
            LocalDate.of(1995, 2, 28),
            "Femenino", "Pasaje Los Olivos 101", "4444444444", "ana@mail.com"
        );

        Persona p5 = new Persona(
                "3099944", "Analis", "Perez",
                LocalDate.of(1995, 2, 28),
                "Femenino", "Pasaje 440", "5555555555", "analia@mail.com"
            ); 
        
        HashSet<Persona> conjuntoPersonas = new HashSet<>();
        conjuntoPersonas.add(p1);
        conjuntoPersonas.add(p2);
        conjuntoPersonas.add(p3);
        conjuntoPersonas.add(p4);
        conjuntoPersonas.add(p5);

        System.out.println("=== Listado de personas ===");
        Iterator<Persona> it = conjuntoPersonas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
