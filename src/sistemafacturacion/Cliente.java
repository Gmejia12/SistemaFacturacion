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

    String getNombre() {
        return this.nombre;
    }

    void setNombre(String nombre) throws Exception {
        if (nombre == null || nombre.isBlank()) {
            throw new Exception("El nombre no puede ser vacio.");
        }
        this.nombre = nombre;
    }

    String getRtn() {
        return this.rtn;
    }

    void setRtn(String rtn) throws Exception {
        if (rtn == null || rtn.isBlank()) {
            throw new Exception("El RTN no puede ser vacio.");
        }
        this.rtn = rtn;
    }

    String getDireccion() {
        return this.direccion;
    }

    void setDireccion(String direccion) throws Exception {
        if (direccion == null || direccion.isBlank()) {
            throw new Exception("La direccion no puede ser vacio.");
        }
        this.direccion = direccion;
    }

    String getTelefono() {
        return this.telefono;
    }

    void setTelefono(String telefono) throws Exception {
        if (telefono == null || telefono.isBlank()) {
            throw new Exception("El telefono no puede ser vacio.");
        }
        this.telefono = telefono;
    }

}
