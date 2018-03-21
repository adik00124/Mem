package pl.adriandlugosz.Mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.adriandlugosz.Mems.model.Category;
import pl.adriandlugosz.Mems.model.Gif;
import pl.adriandlugosz.Mems.repository.CatDao;
import pl.adriandlugosz.Mems.repository.GifDao;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiCategoryController {

    @Autowired
    CatDao catDao;

    @Autowired
    GifDao gifDao;

    @GetMapping("/api/categories/{id}")
    public Category categories(@PathVariable int id) {
        Category category = catDao.findById(id);
        return category;
    }

    @GetMapping("/api/categories")
    public List<Category> allCategories() {
        List<Category> categoryList = new ArrayList<>();
        categoryList = catDao.findAll();
        return categoryList;
    }

    @GetMapping("/api/gifs")
    public List<Gif> allGifs() {
        List<Gif> gifList = new ArrayList<>();
        gifList = gifDao.findAll();
        return gifList;
    }

}
