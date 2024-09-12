/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author wallc
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    

    public void actualizarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock actualizado correctamente.");
        } else if (cantidad == 0) {
            System.out.println("No se ha realizado ningún cambio en el stock.");
        } else {
            System.out.println("Cantidad no válida. No se puede restar stock negativo.");
        }
    }
}
