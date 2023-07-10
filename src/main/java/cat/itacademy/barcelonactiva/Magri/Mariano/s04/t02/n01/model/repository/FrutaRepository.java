package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain.Fruta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FrutaRepository extends JpaRepository <Fruta, Integer> {

    // Método para buscar frutas por nombre
    List<Fruta> findByNombre(String nombre);

    // Método para buscar frutas por cantidad de kilos mayor que un valor dado
    List<Fruta> findByCantidadQuilosGreaterThan(int cantidadQuilos);

    // Método para buscar frutas por nombre y cantidad de kilos
    List<Fruta> findByNombreAndCantidadQuilos(String nombre, int cantidadQuilos);

    // Método para contar la cantidad total de frutas en la base de datos
    long count();

    // Método para calcular el total de kilos de todas las frutas en la base de datos
    @Query("SELECT SUM(f.cantidadQuilos) FROM Fruta f")
    int calcularTotalKilos();
}