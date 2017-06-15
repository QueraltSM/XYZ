public class Main {
    private static Gestora g = new Gestora();

    public static Gestora getGestora(){
        return g;
    }



    public static void main(String[] args){
        PersonalSalarioFijo p1 = new PersonalSalarioFijo("569587A", "Javier Gómez", 2008);

        PersonalComision p2 = new PersonalComision("695235B", "Eva Nieto",  2010);

        PersonalComision p3 = new PersonalComision();
        p3.setDni("741258C");
        p3.setNombre("José Ruiz");
        p3.setAñoIngreso(2012);

        PersonalSalarioFijo p4 = new PersonalSalarioFijo();
        p4.setDni("896325D");
        p4.setNombre("María Núñez");
        p4.setAñoIngreso(2013);

        g.contrataPersonal(p1);
        p1.setSalario(1225.00);

        g.contrataPersonal(p2);
        p2.setClientes(179);
        p2.setMontoCliente(8.10);

        g.contrataPersonal(p3);
        p3.setClientes(81);
        p3.setMontoCliente(7.90);

        g.contrataPersonal(p4);
        p4.setSalario(1555435.00);

        new GUI();
    }
}