package sistemafacturacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaFacturacion {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mateo", "05122016001427", "Res Alondras", "94381818");

        CategoriaProducto categoria = new CategoriaProducto("Limpieza", 2);

        ArrayList<Producto> productos = new ArrayList();
        Producto producto01 = new Producto("Jabon", 10.50, categoria, 10);

        Factura factura = new Factura(22, "2024-07-14", cliente);

        factura.agregarProductos(producto01);

        // ********************************** Datos de la factura
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de factura"));
            factura.setNumero(numero);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
            factura.setFecha(fecha);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        // ********************************** Datos del cliente
        try {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
            factura.getCliente().setNombre(nombre);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            String rtn = JOptionPane.showInputDialog("Ingrese el RTN del cliente");
            factura.getCliente().setRtn(rtn);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del cliente");
            factura.getCliente().setDireccion(direccion);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
            factura.getCliente().setTelefono(telefono);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        // ********************************** Productos

        try {
            String nombreP = JOptionPane.showInputDialog("Ingrese el nombre del producto");
            factura.getProductos().get(0).setNombre(nombreP);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
            factura.getProductos().get(0).setPrecio(precio);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            factura.getProductos().get(0).setCantidad(cantidad);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            String nombreCat = JOptionPane.showInputDialog("Ingrese la categoria");
            factura.getProductos().get(0).getCategoria().setNombre(nombreCat);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        try {
            int pasillo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pasillo"));
            factura.getProductos().get(0).getCategoria().setPasillo(pasillo);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }

        factura.mostrarInfo();

        double pagoTotal = pagarFactura(factura);
        System.out.println("El total a pagar es: " + pagoTotal);

    }

    public static double pagarFactura(Factura factura) {
        double total = 0.00;
        int contador = factura.getProductos().size();
        for (int i = 0; i < contador; i++) {
            total += factura.getProductos().get(i).getPrecio() * factura.getProductos().get(i).getCantidad();
        }
        return total;
    }

}
