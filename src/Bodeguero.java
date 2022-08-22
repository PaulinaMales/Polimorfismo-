public class Bodeguero extends Principal{

    //CONSTRUCTOR


    public Bodeguero(String nombre, String apellido, String direccion, String email, String cedula) {
        super(nombre, apellido, direccion, email, cedula);
    }

    //ACCIONES PROPIAS
    public void accionBodeguero(){
        System.out.printf("Accion Bodeguero \n"+"Revision de productos");
    }
}
