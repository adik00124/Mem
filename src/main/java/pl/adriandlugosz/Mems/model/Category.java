package pl.adriandlugosz.Mems.model;

public class Category {

    private String name;
    private int id;

    private static int currentId = 1;

    public Category() {}

    public Category(String name) {
        this.name = name;
        id = currentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return id + ". " + name;
    }

}

