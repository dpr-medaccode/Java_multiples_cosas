public class App {
    public static void main(String[] args) throws Exception {

        Contrato c1 = new Contrato(0, false, "");
        
        Empleado e1 = new Empleado("Manolo", "Lopez", "+34658745896", c1);

        System.out.println(e1);

        Contrato c2 = new Contrato(-1345, false, "");
        
        Empleado e2 = new Empleado("Manolo", "Lopez", "+34658745896", c2);

        System.out.println(e2);

        e1.setNombre("123123123123123123123");

        System.out.println(e1);

        e1.setNombre("1231231231231231231244444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443");

        System.out.println(e1);

        e1.setApellido("Manolo");

        c1.setSalario(100);

        System.out.println(e1);

    }
}
