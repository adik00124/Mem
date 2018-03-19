package pl.adriandlugosz.Mems.repository;

import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Gif;

import java.util.List;


public interface GifDao {
    List<Gif> findAll();

}
