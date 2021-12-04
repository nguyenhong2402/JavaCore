import java.util.stream.Stream;

public class NetflixService {
    NetflixRepo netflixRepo = new NetflixRepo();

    public void getData(){
        Stream<Netflix> netflixStream = netflixRepo.netflixes.stream();
        netflixStream.forEach(s-> System.out.println(s));
    }
    public void getmaxMovieviews(){
        Stream<Netflix> netflixStream = netflixRepo.netflixes.stream();
        netflixStream.sorted((o1, o2) -> o2.getViews()-o1.getViews()).limit(3).forEach(s-> System.out.println(s));
    }
    public void listMovieCategory(){
        netflixRepo.netflixes.stream().sorted((o1, o2) -> o1.getCategory().compareTo(o2.getCategory())).forEach(s-> System.out.println(s));
    }
    public void listMovieGenre(){
        netflixRepo.netflixes.stream().sorted((o1, o2) -> o1.getGenre().compareTo(o2.getGenre())).forEach(s-> System.out.println(s));
    }
}
