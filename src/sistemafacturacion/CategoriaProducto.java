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

}
