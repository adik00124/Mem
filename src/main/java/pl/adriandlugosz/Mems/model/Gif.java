package pl.adriandlugosz.Mems.model;

public class Gif {
    private Long id;
    private String name;
    private String userName;

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

    public Gif(Long id, String name,String userName) {
        this.id = id;
        this.name = name;
        this.userName=userName;
    }

    public String getGifPath (){
        return "gifs/"+name+".gif";
    }
}
