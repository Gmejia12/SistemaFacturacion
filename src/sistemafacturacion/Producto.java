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
    
    // ************* Getters y Setters
    
    String getNombre(){
        return this.nombre;
    }
    
    void setNombre(String nombre) throws Exception{
        if (nombre == null || nombre.isBlank()) {
            throw new Exception ("Ingrese un nombre valido.");
        }
        this.nombre = nombre;
    }
    
    double getPrecio(){
        return this.precio;
    }
    
    void setPrecio(double precio) throws Exception{
        if (precio <= 0) {
            throw new Exception ("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    
    
    CategoriaProducto getCategoria(){
        return this.categoria;
    }
    
    void setCategoria(CategoriaProducto categoria) throws Exception{
        if (categoria == null) {
            throw new Exception ("Categoria no pueder ser vacio.");
        }
        this.categoria = categoria;
    }
    
    
    int getCantidad(){
        return this.cantidad;
    }
    
    void setCantidad(int cantidad) throws Exception{
        if (cantidad <= 1) {
            throw new Exception ("La cantidad debe ser mayor a 0.");
        }
        this.cantidad = cantidad;
    }

}
