package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain.Fruta;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface FrutaServiceInterface {
    Fruta save(Fruta fruta);
    Optional<Fruta> findById(int id);
    ResponseEntity<?> update(int id, Fruta fruta);
    ResponseEntity<?> delete(int id);
    ResponseEntity<?> findAll();
    ResponseEntity<?> getOne(int id);

}
