package pl.adriandlugosz.Mems.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.adriandlugosz.Mems.model.Gif;

import java.util.ArrayList;
import java.util.List;


//    @Scope("singleton")  - only one bean object
//    @Scope("session") - in every seassion bean is createt

@Component
public class GifDaoImp implements GifDao {

    // this block is crated before class

    private static List<Gif> gifs = new ArrayList<>();
    private static CatDao catDao = new CatDaoImpl();


    static{
        gifs.add(new Gif(1L, "android-explosion.gif","Adiczek", catDao.findByName("Android")));
        gifs.add(new Gif(2L, "ben-and-mike.gif","Dark Lord", catDao.findByName("Funny")));
        gifs.add(new Gif(3L, "book-dominos.gif","Darth Vader",catDao.findByName("Funny")));
        gifs.add(new Gif(4L, "compiler-bot.gif","Minionki", catDao.findByName("Funny")));
        gifs.add(new Gif(5L, "cowboy-coder.gif","Kamil", catDao.findByName("Programming")));
        gifs.add(new Gif(6L, "infinite-andrew.gif","Marcin_12", catDao.findByName("Programming")));


    }

    @Override
    public List<Gif> findAll() {
        return gifs;
    }

    @Override
    public String findUserNameByGifName(String memName) {
        for (Gif g : gifs) {
            if (g.getName().equals(memName)) {
                return g.getUserName();
            }
        }
        return "null";
    }


    @Override
    public List<Gif> favorites() {
        List<Gif> favouriteGifs=new ArrayList<>();

        for (Gif g:gifs){
            if(g.isFavourite()){
                favouriteGifs.add(g);
            }
        }
        return favouriteGifs;
    }



    @Override
    public Gif findByName(String name) {
        return gifs.stream().filter(g->g.getName().equals(name)).findFirst().get();
    }



}




