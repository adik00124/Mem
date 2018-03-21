package pl.adriandlugosz.Mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.adriandlugosz.Mems.model.Category;
import pl.adriandlugosz.Mems.repository.CatDao;

@RestController
public class ApiCategoryController {

    @Autowired
    CatDao catDao;


    @GetMapping("/api/categories/{id}")
    public Category categories(@PathVariable Long id){
        Category category = catDao.findById(id);
        return category;
    }
}
