import java.util.*;
public class Gestora {
    private static int orden;
    private ArrayList<Personal> personal = new ArrayList<Personal>();

    public List<String> sueldoMayor() {
        setOrden(1);
        Collections.sort(personal);

        List<String> res = new LinkedList<String>();
        for (Personal i : personal) {
            res.add(i.getNombre() + " -> salario : " + i.obtenerSalario());
        }
        return res;
    }

    public static int getOrden(){
        return orden;
    }

    public void setOrden(int o){
        orden = o;
    }

    public List<String> mostrasTodos() {
        setOrden(0);
        Collections.sort(personal);

        List<String> res = new LinkedList<String>();
        for (Personal i : personal) {
            res.add(i.imprimir());
        }
        return res;
    }

    public boolean despidePersonal(String dni) {
        for (Personal i : personal) {
            if (i.getDni().equals(dni)) {
                personal.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean contrataPersonal(Personal p){
        if (personal.contains(p)) return false;
        personal.add(p);
        return true;
    }
}