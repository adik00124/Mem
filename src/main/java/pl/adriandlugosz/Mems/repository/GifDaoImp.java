package pl.adriandlugosz.Mems.repository;

import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Gif;

import java.util.ArrayList;
import java.util.List;

@Component
public class GifDaoImp implements GifDao {

    private static List<Gif> gifs = new ArrayList<>();

    static{
        gifs.add(new Gif(1L, "android-explosion.gif","Adiczek"));
        gifs.add(new Gif(2L, "ben-and-mike.gif","Dark Lord"));
        gifs.add(new Gif(3L, "book-dominos.gif","Darth Vader"));
        gifs.add(new Gif(4L, "compiler-bot.gif","Minionki"));
        gifs.add(new Gif(5L, "cowboy-coder.gif","Kamil"));
        gifs.add(new Gif(6L, "infinite-andrew.gif","Marcin_12"));
    }

    @Override
    public List<Gif> findAll() {
        return gifs;
    }

    @Override
    public String findByName(String memName) {
        for (Gif g:gifs) {
            if (g.getName().equals(memName)) {
                return g.getUserName();
            }
        }
        return "null";
    }

}
