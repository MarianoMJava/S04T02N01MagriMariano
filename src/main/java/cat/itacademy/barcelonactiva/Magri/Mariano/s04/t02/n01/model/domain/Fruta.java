package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain;

public class Fruta {
    private int id;
    private String nombre;
    private int cantidadQuilos;

    // Constructor
    public Fruta(int id, String nombre, int cantidadQuilos) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadQuilos = cantidadQuilos;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadQuilos() {
        return cantidadQuilos;
    }

    public void setCantidadQuilos(int cantidadQuilos) {
        this.cantidadQuilos = cantidadQuilos;
    }
}
