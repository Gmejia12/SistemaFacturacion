package sistemafacturacion;

import java.util.ArrayList;

public class Factura {

    private int numero;
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
    
    void mostrarInfo(){
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
    
    ArrayList<Producto> getProductos (){
        return productos;
    }

}
