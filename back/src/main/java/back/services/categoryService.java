package back.services;

import back.repositories.categoryRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categoryService {

    @Autowired
    private categoryRepositori repository;
}
