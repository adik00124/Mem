package pl.adriandlugosz.Mems.repository;

import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Category;
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
}
