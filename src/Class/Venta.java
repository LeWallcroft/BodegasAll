/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author wallc
 */
public class Venta {
     private String codigoVenta;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> listaProductos = new ArrayList<>();
    private double total;

    
    public Venta(String codigoVenta, Date fecha, Cliente cliente) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    // método sobrecargado para agregar un producto con cantidad
    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            listaProductos.add(producto);
        }
        calcularTotal();
    }

    // sobrecarga del método para agregar solo un producto
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        calcularTotal();
    }

    public double calcularTotal() {
        total = 0;
        for (Producto p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }

    
}
