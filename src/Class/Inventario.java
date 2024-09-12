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
    private List<Producto> productos;

    // constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
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
        return productos;
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
