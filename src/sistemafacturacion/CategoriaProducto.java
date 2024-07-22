package sistemafacturacion;

public class CategoriaProducto {

    private String nombre;
    private int pasillo;

    CategoriaProducto(String nombre, int pasillo) {
        this.nombre = nombre;
        this.pasillo = pasillo;
    }

    void mostrarInfo() {
        System.out.println("Categoria-: " + this.nombre);
        System.out.println("Pasillo-----: " + this.pasillo);
    }
    
    // ************* Getters y Setters
    
    String getNombre(){
        return this.nombre;
    }
    
    void setNombre(String nombre) throws Exception{
        if (nombre.isBlank()) {
            throw new Exception ("EL nombre no puede ser vacio.");
        }
        this.nombre = nombre;
    }
    
    int getPasillo(){
        return this.pasillo;
    }
    
    void setPasillo(int pasillo) throws Exception{
        if (pasillo < 1) {
            throw new Exception ("El pasillo debe ser mayor a 0.");
        }
        this.pasillo = pasillo;
    }

}
