public class Netflix {
    private int id;
    private String name;
    private String author;
    private Genre genre;
    private Category category;
    private int views;
    private int time;

    public Netflix(int id, String name, String author, Genre genre, Category category, int views, int time) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.category = category;
        this.views = views;
        this.time = time;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return id +
                " - " + name +
                " - " + author +
                " - " + genre +
                " - " + category.getValue() +
                " - " + views +
                " - " + time;
    }
}