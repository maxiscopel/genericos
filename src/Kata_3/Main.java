package Kata_3;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Producto<Integer> prod1 = new Producto<>(1, "Yerba", 1200);
        Producto<Integer> prod2 = new Producto<>(2,"Pan", 500);
        Producto<Integer> prod3 = new Producto<>(3, "Leche", 800);

        Pedido pedido1 = new Pedido(101, LocalDate.of(2024, 9, 15));
        Pedido pedido2 = new Pedido(102, LocalDate.of(2024, 10, 1));
        Pedido pedido3 = new Pedido(103, LocalDate.of(2024, 8, 25));

        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);

        pedido2.agregarProducto(prod3);

        pedido3.agregarProducto(prod2);
        pedido3.agregarProducto(prod3);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        System.out.println(" ==== PEDIDOS ORDENADOS ==== ");
        Collections.sort(pedidos);
        for (Pedido p : pedidos){
            System.out.println(p);
        }

        System.out.println();

        System.out.println(" ==== ORDENAR POR FECHA ====");
        pedidos.sort(new ComparadorPedidosPorFecha());
        for (Pedido p: pedidos){
            System.out.println(p);
        }

    }
}