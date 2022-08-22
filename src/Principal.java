public class Principal {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private String cedula;


    //Constructor


    public Principal(String nombre, String apellido, String direccion, String email, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.cedula = cedula;
    }

    //ACCESORES


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    //CREACION DE OBJETOS
    public static void main(String[] args) {
        Cajero cajero = new Cajero("Juan","Gomez","Quito","juan@gmail.com","1050324928");
        System.out.println("Nombre: "+cajero.getNombre()+"\nApellido: "+cajero.getApellido()+"\nDireccion: "+cajero.getDireccion()+"\nEmail: "+cajero.getEmail()+"\nCedula: "+cajero.getCedula());
        cajero.accionCajero();
        System.out.printf("\n");

        Bodeguero bodeguero = new Bodeguero("Marcos","Moreira","Guasmo","marcos@gmail.com","1708354053");
        System.out.println("\nNombre :"+bodeguero.getNombre()+"\nApellido: "+bodeguero.getApellido()+"\nDireccion: "+bodeguero.getDireccion()+"\nEmail: "+bodeguero.getEmail()+"\nCedula: "+bodeguero.getCedula());
        bodeguero.accionBodeguero();
        System.out.printf("\n");

        Administrador administrador = new Administrador("Paulina","Males","Quito Norte","paulina@gmail.com","123456789");
        System.out.println("\nNombre: "+administrador.getNombre()+"\nApellido: "+administrador.getApellido()+"\nDireccion: "+administrador.getDireccion()+"\nEmail: "+administrador.getEmail()+"\nCedula: "+administrador.getCedula());
        administrador.accionAdministrador();
        System.out.printf("\n");



    }
}
