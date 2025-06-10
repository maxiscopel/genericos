package Kata_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Pedido implements Comparable<Pedido>{

    private int id;
    private List<Producto<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.productos = new ArrayList<>();
        this.fecha = fecha;
    }

    public void agregarProducto(Producto<?> p) {
        productos.add(p);
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Producto<?> p : productos){
            total = total + p.getPrecio();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public List<Producto<?>> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setProductos(List<Producto<?>> productos) {
        this.productos = productos;
    }

    public int compareTo(Pedido otro){ //SI QUIERO NUMERO MAS CHICO PRIMERO , RETORNO UN NUMERO NEGARIVO.
        int retorno = 0;               // SI QUIERO EL MAS GRANDE PRIMERO, RETORNO UN NUMERO POSITVO.
        // SI SON IGUALES RETORNO 0.
        if (this.calcularTotal() > otro.calcularTotal()){
            retorno =  1;
        }else if (this.calcularTotal() < otro.calcularTotal()){
            retorno = -1;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", productos=" + productos +
                ", fecha=" + fecha +
                '}';
    }
}