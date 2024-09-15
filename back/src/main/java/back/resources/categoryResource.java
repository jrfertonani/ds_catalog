package back.resources;


import back.domain.dtos.categoryDTO;
import back.services.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class categoryResource {

    @Autowired
    private categoryService service;


    @GetMapping
    public ResponseEntity<List<categoryDTO>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
