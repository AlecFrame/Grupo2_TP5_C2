
package grupo2_tp5_c2;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirectorioTelefonico {
    private TreeMap<Long, Cliente> lista;

    public DirectorioTelefonico() {
        lista = new TreeMap<>();
    }

    public TreeMap<Long, Cliente> getLista() {
        return lista;
    }
    
    public void agregarContacto(Long l,Cliente c) {
        lista.put(l, c);
    }
    
    public Cliente buscarContacto(Long l) {
        return lista.get(l);
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> l = new TreeSet<>();
        for (Long k: lista.keySet()) {
            if (lista.get(k).getApellido().equalsIgnoreCase(apellido)) {
                l.add(k);
            }
        }
        return l;
    }
    
    public ArrayList<Cliente> buscarContactos(String ciudad) {
        ArrayList<Cliente> l = new ArrayList<>();
        for (Long k: lista.keySet()) {
            if (lista.get(k).getApellido().equalsIgnoreCase(ciudad)) {
                l.add(lista.get(k));
            }
        }
        return l;
    }
    
    public void borrarContacto(Long l) {
        lista.remove(l);
    }
}
