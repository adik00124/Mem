package pl.adriandlugosz.Mems.model;

public class Gif {
    private int id;
    private String name;
    private String userName;
    private Category category;
    private boolean favorite;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public Gif(){}

    @Override
    public String toString() {
        return getGifPath();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gif(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gif(int id, String name, String userName, Category category,boolean favorite) {
        this.name = name;
        this.userName = userName;
        this.category = category;
        this.favorite=favorite;
        this.id=id;
    }

    public String getGifPath (){
        return "/gifs/"+name;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
