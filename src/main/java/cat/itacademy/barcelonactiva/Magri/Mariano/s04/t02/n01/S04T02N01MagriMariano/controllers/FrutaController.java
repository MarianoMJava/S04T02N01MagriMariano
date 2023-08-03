package cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.S04T02N01MagriMariano.controllers;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.S04T02N01MagriMariano.model.services.FrutaServiceInterface;

import cat.itacademy.barcelonactiva.Magri.Mariano.s04.t02.n01.S04T02N01MagriMariano.model.domain.Fruta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruta")

public class FrutaController {
    private final FrutaServiceInterface frutaService;
    public FrutaController (FrutaServiceInterface frutaService){
        this.frutaService=frutaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruta> add(@RequestBody Fruta fruta) {
       return new ResponseEntity<Fruta>(frutaService.save(fruta), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody Fruta fruta) {
        return frutaService.update(id, fruta);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return frutaService.delete(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return frutaService.findAll();
    }

    @GetMapping("getOne/{id}")
    public ResponseEntity<?> getOne(@PathVariable int id) {
        return frutaService.getOne(id);
    }

}
