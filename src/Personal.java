public abstract class Personal implements Comparable<Personal> {
    private String dni, nombre;
    private int añoIngreso;
    private double salario;

    public Personal(String dni, String nombre, int añoIngreso){
        this.dni = dni;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public Personal() {}

    public abstract double obtenerSalario();

    public void setSalario(double dinero){
        salario = dinero;
    }

    public int getAñoIngreso(){
        return añoIngreso;
    }

    public String getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAñoIngreso(int año){
        añoIngreso = año;
    }

    public int compareTo(Personal p){
        if (Gestora.getOrden() == 0) {
            if (p.getNombre().compareTo(getNombre())<0) {
                return 1;
            } else if (p.getNombre().compareTo(getNombre())==0) {
                return 0;
            }
            return -1;
        } else if (Gestora.getOrden()== 1) {
            if (p.obtenerSalario() < obtenerSalario()) {
                return -1;
            } else if (p.obtenerSalario() == obtenerSalario()) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public String imprimir(){
        return getDni() + " | " + getNombre() + " | " + getAñoIngreso();
    }

    public double getSalario(){
        return salario;
    }

    public boolean equals(Personal p){
        return p.getDni().equals(getDni());
    }

}
