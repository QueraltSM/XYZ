import java.util.*;
public class PersonalSalarioFijo extends Personal {
    private String dni, nombre;
    private int añoIngreso;

    public PersonalSalarioFijo() {}

    public PersonalSalarioFijo(String dni, String nombre, int añoIngreso){
        super(dni, nombre, añoIngreso);
        this.dni = dni;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public double obtenerSalario(){
        Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.YEAR) - getAñoIngreso()>=2 && cal.get(Calendar.YEAR) - getAñoIngreso()<=3) {
            return super.getSalario()*0.05;
        } else if (cal.get(Calendar.YEAR) - getAñoIngreso()>=4 && cal.get(Calendar.YEAR) - getAñoIngreso()<=7) {
            return super.getSalario()*0.1;
        } else if (cal.get(Calendar.YEAR) - getAñoIngreso()>=8 && cal.get(Calendar.YEAR) - getAñoIngreso()<=15) {
            return super.getSalario()*0.15;
        }
        return super.getSalario()*0.2;
    }
}