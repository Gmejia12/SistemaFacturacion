package sistemafacturacion;

import java.util.ArrayList;

public class Factura {

    private int numero = 0;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList();

    Factura(int numero, String fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    
    void agregarProductos(Producto producto) {
        productos.add(producto);
    }
    
    void mostrarInfo() {
        System.out.println("Numero--: " + this.numero);
        System.out.println("Fecha---: " + this.fecha);
        cliente.mostrarInfo();
        System.out.println("===== DETALLE =====");
        for (int i = 0; i < productos.size(); i++) {
            Producto info = productos.get(i);
            info.mostrarInfo();
            System.out.println();
        }
    }

    // ************* Getters y Setters
    ArrayList<Producto> getProductos() {
        return productos;
    }

    void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    int getNumero() {
        return this.numero;
    }

    void setNumero(int numero) throws Exception {
        if (numero <= 0) {
            throw new Exception("El numero de recibo no puede ser vacío.");
        }
        this.numero = numero;
    }

    String getFecha() {
        return this.fecha;
    }

    void setFecha(String fecha) throws Exception {
        if (fecha == null || fecha.isBlank()) {
            throw new Exception("La fecha ingresada no es valida");
        }
        this.fecha = fecha;
    }

    Cliente getCliente() {
        return this.cliente;
    }

}
