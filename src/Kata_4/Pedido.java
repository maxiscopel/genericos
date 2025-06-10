package Kata_4;

public class Pedido implements Identificable<Integer>{

    private Integer id;
    private String descripcion;

    public Pedido(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id.equals(id);
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", descripcion=" + descripcion + "]";
    }
}


