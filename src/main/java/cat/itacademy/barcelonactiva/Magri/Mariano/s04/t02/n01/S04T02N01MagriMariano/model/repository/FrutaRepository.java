package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.S04T02N01MagriMariano.model.repository;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.S04T02N01MagriMariano.model.domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Integer> {

    Iterable<Fruta> findByNombre(String title);

}