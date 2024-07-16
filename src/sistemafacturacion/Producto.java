package sistemafacturacion;

public class Producto {

    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private int cantidad;

    Producto(String nombre, double precio, CategoriaProducto categoria, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;

    }
    
    void mostrarInfo(){
        System.out.println("Producto--: " + this.nombre);
        System.out.println("Precio------: " + this.precio);
        System.out.println("Cantidad--: " + this.cantidad);
        categoria.mostrarInfo();
    }
    
    String getNombre(){
        return this.nombre;
    }
    
    double getPrecio(){
        return this.precio;
    }
    
    int getCantidad(){
        return this.cantidad;
    }

}
