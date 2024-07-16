package sistemafacturacion;

import java.util.ArrayList;

public class SistemaFacturacion {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Mateo", "05122016001427", "Res Alondras", "94381818");
        CategoriaProducto categoria = new CategoriaProducto ("Limpieza", 2);
        CategoriaProducto categoria2 = new CategoriaProducto ("Cocina", 7);
        CategoriaProducto categoria3 = new CategoriaProducto ("Higiene", 10);
                
        ArrayList<Producto> productos = new ArrayList();
        Producto producto1 = new Producto("Jabon", 10.50, categoria, 10);
        Producto producto2 = new Producto("Aceite", 52.65, categoria2, 2);
        Producto producto3 = new Producto("Papel", 180.00, categoria3, 1);
        
        Factura factura = new Factura(22, "2024-07-14", cliente);
        
        
        factura.agregarProductos(producto1);
        factura.agregarProductos(producto2);
        factura.agregarProductos(producto3);
    
        factura.mostrarInfo();
        
        double pagoTotal = pagarFactura(factura);
        System.out.println("El total a pagar es: " + pagoTotal);
        
    }
    
    public static double pagarFactura(Factura factura){
        double total = 0.00;
        int contador = factura.getProductos().size();
        for (int i = 0; i < contador; i++) {
            total += factura.getProductos().get(i).getPrecio() * factura.getProductos().get(i).getCantidad();
        }
        return total;
    }

}
