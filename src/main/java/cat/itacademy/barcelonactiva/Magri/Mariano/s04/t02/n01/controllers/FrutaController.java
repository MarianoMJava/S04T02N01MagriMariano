package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.domain.Fruta;
import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.model.repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruta")
public class FrutaController {

    @Autowired
    private FrutaRepository frutaRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addFruta(@RequestBody Fruta fruta){
        frutaRepository.save(fruta);
        return ResponseEntity.ok("Fruta agregada correctamente");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruta(@RequestBody Fruta fruta) {
        // Lógica para actualizar una fruta en la base de datos
        frutaRepository.save(fruta);
        return ResponseEntity.ok("Fruta actualizada correctamente");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruta(@PathVariable int id) {
        // Lógica para eliminar una fruta de la base de datos
        frutaRepository.deleteById(id);
        return ResponseEntity.ok("Fruta eliminada correctamente");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFrutaById(@PathVariable int id) {
        // Lógica para obtener una fruta por su ID de la base de datos
        Optional<Fruta> frutaOptional = frutaRepository.findById(id);
        if (frutaOptional.isPresent()) {
            return ResponseEntity.ok(frutaOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruta>> getAllFrutas() {
        // Lógica para obtener todas las frutas de la base de datos
        List<Fruta> frutas = frutaRepository.findAll();
        return ResponseEntity.ok(frutas);
    }

}
