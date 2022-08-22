public class Administrador extends Principal{

    //CONSTRUCTOR


    public Administrador(String nombre, String apellido, String direccion, String email, String cedula) {
        super(nombre, apellido, direccion, email, cedula);
    }

    //ACCIONES PROPIAS
    public void accionAdministrador(){
        System.out.printf("Accion Administrador \n"+"Resistro de Usuarios al sistema");
    }
}
