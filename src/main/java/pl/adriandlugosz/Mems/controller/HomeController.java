package pl.adriandlugosz.Mems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.adriandlugosz.Mems.model.Category;
import org.springframework.web.bind.annotation.PathVariable;
import pl.adriandlugosz.Mems.model.Gif;
import pl.adriandlugosz.Mems.repository.CatDao;
import pl.adriandlugosz.Mems.repository.GifDao;
import pl.adriandlugosz.Mems.repository.GifDaoImp;

import javax.jws.WebParam;

@Controller
public class HomeController {

//    default
    @Autowired
    private CatDao catDao;
    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("gifs",gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String gif(@PathVariable String name,ModelMap modelMap){
        modelMap.addAttribute("gif",gifDao.findByName(name));
        return "gif-details";
    }

    @GetMapping("/categories")
    public String categories(ModelMap modelMap) {
        modelMap.put("categories", catDao.findAll());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String category(@PathVariable Long id, ModelMap modelMap){
        modelMap.put("category", catDao.findById(id));
        modelMap.put("gifs", gifDao.findAllByCategory(catDao.findById(id).getName()));
        return "category";
    }

}
