
package grupo2_tp5_c2;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        DirectorioTelefonico dtele = new DirectorioTelefonico();
        TreeMap<Long, Cliente> lista = dtele.getLista();
        
        Cliente c1 = new Cliente("46273982","Mariano","Lopez","San Luis","mz 1, casa 14");
        Cliente c2 = new Cliente("45267364","Maria","Alvares","San Luis","mz 3, casa 10");
        Cliente c3 = new Cliente("44654455","Camila","Martinez","Mendoza","mz 2, casa 12");
        Cliente c4 = new Cliente("45635382","Luis","Ruiz","Mendoza","mz 4, casa 33");
        Cliente c5 = new Cliente("46253774","Marta","Lopez","La Plata","mz 3, casa 6");
        
        dtele.agregarContacto((long) 1, c1);
        dtele.agregarContacto((long) 2, c2);
        dtele.agregarContacto((long) 3, c3);
        dtele.agregarContacto((long) 4, c4);
        dtele.agregarContacto((long) 5, c5);
        
        System.out.println("Lista de contactos del directorio: ");
        for (Long l: lista.keySet()) {
            System.out.println("> "+lista.get(l));
        }
        System.out.println("\nEl numero 2, le pertenece a "+dtele.buscarContacto((long) 2));
        System.out.println("\nEl apellido Lopez se relaciona con los siguientes números teléfonicos:");
        
        for (Long l: lista.keySet()) {
            if (lista.get(l).getApellido().equalsIgnoreCase("Lopez"))
            System.out.println("> "+lista.get(l));
        }
        System.out.println("\nLa ciudad de Mendoza se relaciona con los siguientes números teléfonicos:");
        for (Long l: lista.keySet()) {
            if (lista.get(l).getCiudad().equalsIgnoreCase("Mendoza"))
            System.out.println("> "+lista.get(l));
        }
        
        dtele.borrarContacto((long) 5);
        System.out.println("\nSe borro el número 5 de la lista de contactos, perteneciente a "+c5);
        
        System.out.println("Lista actualizada de contactos del directorio: ");
        for (Long l: lista.keySet()) {
            System.out.println("> "+lista.get(l));
        }
        
        Ventana ventana = new Ventana(dtele.getLista());
        ventana.setVisible(true);
    }
    
}
