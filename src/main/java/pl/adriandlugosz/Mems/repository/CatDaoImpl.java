package pl.adriandlugosz.Mems.repository;

import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Category;
import pl.adriandlugosz.Mems.model.Gif;

import java.util.ArrayList;
import java.util.List;


@Component
public class CatDaoImpl implements CatDao {

    private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category("Android"));
        categories.add(new Category("Funny"));
        categories.add(new Category("Programming"));
    }

    @Override
    public List<Category> findAll(){
        return categories;
    }

    public Category findByName(String name){
        for(Category cat : categories){
            if(cat.getName().toLowerCase().equals(name.toLowerCase())){
                return cat;
            }
        }
        return null;
    }

    public Category findById(int id){
        return categories.stream().filter(g->g.getId() == id).findFirst().get();
    }
}
