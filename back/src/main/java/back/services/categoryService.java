package back.services;

import back.domain.dtos.categoryDTO;
import back.domain.entity.Category;
import back.repositories.categoryRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class categoryService {

    @Autowired
    private categoryRepositori repository;

    public List<categoryDTO> findAll() {
        return repository.findAll().stream()
           .map(x -> new categoryDTO(x)).collect(Collectors.toList());
    }
}
