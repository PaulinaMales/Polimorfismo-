public class Cajero extends Principal{



    //Constructor
    public Cajero(String nombre, String apellido, String direccion, String email, String cedula) {
        super(nombre, apellido, direccion, email, cedula);
    }

    //ACCIONES PROPIAS
    public void accionCajero(){
        System.out.printf("Accion Cajero \n"+"Realizacioón de Facturas");

    }
}
