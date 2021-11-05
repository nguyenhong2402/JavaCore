import com.google.gson.annotations.SerializedName;

public class Movie {
    int id;
    String movieName;
    String category;
    int length;
    String producer;
    String premiereYear;

    public Movie(int id, String movieName, String category, int length, String producer, String premiereYear) {
        this.id = id;
        this.movieName = movieName;
        this.category = category;
        this.length = length;
        this.producer = producer;
        this.premiereYear = premiereYear;
    }

    @Override
    public String toString() {
        return id +
                "  -  " + movieName+
                "  -  " + category+
                "  -  " + length +
                "  -  " + producer +
                "  -  " + premiereYear;
    }
}
