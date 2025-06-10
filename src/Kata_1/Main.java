package Kata_1;

import java.util.ArrayList;
import java.util.List;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Producto<?>> productos = new ArrayList<>();

        productos.add(new Producto<Integer>(1, "Pan", 100));
        productos.add(new Producto<String>("A001","Leche",150));

        //Para mostrar los datos se hace con un bucle for

        for (Producto<?> p : productos){
            System.out.println(p);
        }


    }
}