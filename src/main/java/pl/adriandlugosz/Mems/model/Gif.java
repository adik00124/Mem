package pl.adriandlugosz.Mems.model;

public class Gif {
    private Long id;
    private String name;
    private String userName;
    private Category category;
    private boolean favourite;

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }
    public Gif(){}

    @Override
    public String toString() {
        return getGifPath();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gif(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gif(Long id, String name,String userName, boolean favourite) {
        this.id = id;
        this.name = name;
        this.userName=userName;
        this.favourite=favourite;
    }

    public Gif(Long id, String name, String userName, Category category) {
        this.name = name;
        this.userName = userName;
        this.category = category;
    }

    public String getGifPath (){
        return "gifs/"+name;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
