package Kata_2;

public class Main {
    public static void main(String[] args) {

        //Creo producto

        Producto<Integer> p1 = new Producto<>(1,"Arroz",120.5);
        Producto<String> p2 = new Producto<>("X02", "Fideos", 98.0);
        Producto<Long> p3 = new Producto<>(123456789L, "Azúcar", 75.3);

        //Crear carrito, con el ? , para que en el carrito se puedan Asignar todos los productos aunque su tipo de dato sea diferente.
        Carrito <Producto<?>> carrito = new Carrito<>();

        //Agrego objetos al carrito.

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        //Mostrar Producto

        System.out.println(" ==== PRODUCTOS EN EL CARRITO ====");
        carrito.mostrarProductos();

        System.out.println();

        //Muestro el total que hay en el carrito.

        System.out.println("Total: " + carrito.obtenerTotal());



    }
}
