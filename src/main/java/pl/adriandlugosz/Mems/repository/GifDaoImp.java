package pl.adriandlugosz.Mems.repository;

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

    static{
        gifs.add(new Gif(1L, "android-explosion.gif","Adiczek",false));
        gifs.add(new Gif(2L, "ben-and-mike.gif","Dark Lord",true));
        gifs.add(new Gif(3L, "book-dominos.gif","Darth Vader",false));
        gifs.add(new Gif(4L, "compiler-bot.gif","Minionki",true));
        gifs.add(new Gif(5L, "cowboy-coder.gif","Kamil",false));
        gifs.add(new Gif(6L, "infinite-andrew.gif","Marcin_12",true));
    }

    @Override
    public List<Gif> findAll() {
        return gifs;
    }

    @Override
    public String findUserNameByGifName (String memName) {
        for (Gif g:gifs) {
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

}
