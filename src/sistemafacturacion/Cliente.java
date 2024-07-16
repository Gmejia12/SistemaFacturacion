package sistemafacturacion;

public class Cliente {

    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;

    Cliente(String nombre, String rtn, String direccion, String telefono) {
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    void mostrarInfo() {
        System.out.println("Cliente--: " + this.nombre);
        System.out.println("RTN------: " + this.rtn);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono-: " + this.telefono);
    }

}
