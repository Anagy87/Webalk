package hu.me.lev.model;

public class Book {
    private int id;
    private String name;
    private String authorname;
    private int price;

    public Book(int id, String name, String authorname, int price) {
        this.id = id;
        this.name = name;
        this.authorname = authorname;
        this.price = price;
    }

    public int getId() {
        return id;
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

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorname=" + authorname +
                ", price=" + price +
                '}';
    }
}
