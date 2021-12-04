import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        NetflixService net = new NetflixService();
        net.getData();
        System.out.println("---------------------------------------------------------------");
        net.getmaxMovieviews();
        System.out.println("---------------------------------------------------------------");
        net.listMovieCategory();
        System.out.println("---------------------------------------------------------------");
        net.listMovieGenre();
    }
}
