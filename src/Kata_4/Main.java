package Kata_4;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Pedido de libros"));
        pedidos.add(new Pedido(2, "Pedido de comida"));
        pedidos.add(new Pedido(3, "Pedido de ropa"));

        Buscador<Pedido, Integer> buscador = new Buscador<>();
        Pedido resultado = buscador.buscar(pedidos, 2);

        if (resultado != null) {
            System.out.println("Pedido encontrado: " + resultado);
        } else {
            System.out.println("Pedido no encontrado");
        }
    }
}