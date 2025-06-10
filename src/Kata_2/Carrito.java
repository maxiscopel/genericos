package Kata_2;
import java.util.ArrayList;
import java.util.List;

public class Carrito <T extends Producto<?>> { // Aca T extiende de Producto, si estuviera alado seria una herencia en la cual la clase
    //Carrito extenderia Producto.

    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public void eliminarProducto(T producto){
        productos.remove(producto);
    }

    public double obtenerTotal(){
        double total = 0.0;
        for (T p : productos){
            total = total + p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (T producto : productos) {
            System.out.println(producto);
        }


    }
}