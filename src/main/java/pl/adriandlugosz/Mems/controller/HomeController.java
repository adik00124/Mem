package pl.adriandlugosz.Mems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import pl.adriandlugosz.Mems.model.Gif;
import pl.adriandlugosz.Mems.repository.GifDao;
import pl.adriandlugosz.Mems.repository.GifNotFoundException;

import javax.jws.WebParam;

@Controller
public class HomeController {

    @Autowired
    private GifDao gifDao;

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/gif/{name}")
    public String home(@PathVariable String name, ModelMap modelMap) {
        modelMap.addAttribute("names", gifDao.findByName(name));
        return "gif-details";
    }
}

