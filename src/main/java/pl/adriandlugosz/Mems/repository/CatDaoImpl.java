package pl.adriandlugosz.Mems.repository;

import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Category;
import java.util.ArrayList;
import java.util.List;

@Component
public class CatDaoImpl implements CatDao {

    private List<Category> findAll = new ArrayList<>();

    @Override
    public List<Category> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category("Android"));
        list.add(new Category("Funny"));
        list.add(new Category("Programming"));
        return list;
    }
}
