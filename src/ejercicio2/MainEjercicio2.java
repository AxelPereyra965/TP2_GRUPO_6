package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {

    public static void main(String[] args) {

        ArrayList<Object> lista = new ArrayList<>();

        // Polideportivos
        Polideportivo p1 = new Polideportivo("Polideportivo Escobar", 1500.0, 1);
        Polideportivo p2 = new Polideportivo("Polideportivo Tigre", 1800.5, 2);
        Polideportivo p3 = new Polideportivo("Polideportivo Pacheco", 2100.75, 3);

        // Edificios de oficinas
        EdificioDeOficinas e1 = new EdificioDeOficinas(10);
        EdificioDeOficinas e2 = new EdificioDeOficinas(20);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(e1);
        lista.add(e2);
        
        Iterator<Object> it = lista.iterator();
        
        System.out.println("Lista de Instalaciones y Edificios");
        
        while (it.hasNext()) { 
            Object item = it.next();
            System.out.println(item.toString());
        }
        

      
    }
}