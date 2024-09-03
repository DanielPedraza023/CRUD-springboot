package xyzCRUDBACKEND.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyzCRUDBACKEND.aplication.service.PaisService;
import xyzCRUDBACKEND.domain.model.Pais;

import java.util.List;

@RestController
@RequestMapping("/pais")

public class PaisREST {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }
}
