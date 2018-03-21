package pl.adriandlugosz.Mems.repository;

import pl.adriandlugosz.Mems.model.Category;

import java.util.List;

public interface CatDao {

    List<Category> findAll();
    Category findByName(String name);
    Category findById(int id);

}
