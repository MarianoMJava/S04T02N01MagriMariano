package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "frutas")

public class Fruta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "Kg")
    private int quantitatQuilos;


    public Fruta() {

    }

    public Fruta(String nombre, int quantitatQuilos) {
        this.nombre = nombre;
        this.quantitatQuilos = quantitatQuilos;
    }

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

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public String toString() {
        return "Fruta [id=" + id + ", nombre=" + nombre + ", quantitatQuilos=" + quantitatQuilos + "]";
    }

}
