package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain.Fruta;
import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FrutaService implements FrutaServiceInterface{

    @Autowired
    FrutaRepository repo;

    public Fruta save(Fruta fruta) {
        return repo.save(fruta);
    }

    public Optional<Fruta> findById(int id) {
        return repo.findById(id);
    }

    public ResponseEntity<?> update(int id, Fruta fruta) {
        Optional<Fruta> frutaOp = findById(id);
        if (frutaOp.isPresent()) {
            Fruta frutaToUpdate = frutaOp.get();
            frutaToUpdate.setNombre(fruta.getNombre());
            frutaToUpdate.setQuantitatQuilos(fruta.getQuantitatQuilos());
            return new ResponseEntity<>(repo.save(frutaToUpdate), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("The fruta with id " + id + " was not found.", HttpStatus.OK);
        }
    }

    public ResponseEntity<?> delete(int id) {
        Optional<Fruta> frutaOp = findById(id);
        if (frutaOp.isPresent()) {
            repo.deleteById(id);
            return new ResponseEntity<>("The fruta was deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("The fruta with id " + id + " was not found.", HttpStatus.OK);
        }
    }

    public ResponseEntity<?> findAll() {
        if (repo.findAll().isEmpty()) {
            return new ResponseEntity<>("The list is empty.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> getOne(int id) {
        Optional<Fruta> fruta = repo.findById(id);
        if (fruta.isPresent()) {
            return new ResponseEntity<>(fruta, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>("The fruta with id " + id + " was not found.",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
