public class PersonalComision extends Personal {
    private String dni, nombre;
    private int añoIngreso, nClientes;
    private double dineroCliente;

    public PersonalComision() {}

    public PersonalComision(String dni, String nombre, int añoIngreso){
        super(dni, nombre, añoIngreso);
        this.dni = dni;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public void setClientes(int nClientes) {
        this.nClientes = nClientes;
    }

    public int getClientes(){
        return nClientes;
    }

    public double getMontoCliente(){
        return dineroCliente;
    }

    public void setMontoCliente(double dineroCliente) {
        this.dineroCliente = dineroCliente;
    }

    public double obtenerSalario(){
        if ( (getClientes() * getMontoCliente()) < 750.00) {
            return getClientes() * getMontoCliente();
        }
        return 750.00; // saldo base
    }
}
