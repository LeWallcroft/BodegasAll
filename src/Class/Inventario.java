/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package Class;

/**
 *
 * @author wallc
 */

import java.util.ArrayList;
import java.util.List;


public class Inventario {
   /* private List<Producto> productos;

    // constructor
    public Inventario() {
        productos = new ArrayList<>();
    }
    
     
    //Las salidas en consola son solo significativas y de ayuda para la logica del codigo,
    //posteriormente se hara la relacion entre clases, main y interface
    // Relación con la clase Producto: agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario: " + producto.getNombre());
    }    

    
    // Buscar producto por código
    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;  // retorna null si no se encuentra el producto
    }

    // Mostrar todos los productos en el inventario
    public List<Producto> mostrarInventario() {
        
         System.out.println("Lista de productos en inventario:");
        for (Producto producto : productos) {
            System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.getNombre());        
        
    }

    // Eliminar producto del inventario
    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
    }     
    
    /*
    usamos una colección como List<Producto> en el atributo productos
    Los metodos como agregarProducto, buscarProducto, y eliminarProducto usan la colección para gestionar el `inventario`
    */
}
