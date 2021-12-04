import java.util.ArrayList;

public class NetflixRepo {
    ArrayList<Netflix> netflixes;
    public NetflixRepo() {
        netflixes = new ArrayList<>();
        netflixes.add(new Netflix(1,"Ác Thần","Scott Stewart",Genre.HORROR,Category.MOVIE,15000,120));
        netflixes.add(new Netflix(2,"Đội quân người chết","Zack Snyder",Genre.HORROR,Category.MOVIE,105000,132));
        netflixes.add(new Netflix(3,"Tokyo Ghoul","Hanae Natsuki",Genre.HORROR,Category.TVSHOW,354000,200));
        netflixes.add(new Netflix(4,"Trùm Ma Tuý","Chris Brancato",Genre.ACTION,Category.MOVIE,453457,102));
        netflixes.add(new Netflix(5,"Thợ săn quái vật","Lauren Schmidt Hissrich",Genre.ACTION,Category.TVSHOW,137534123,111));
        netflixes.add(new Netflix(6,"Cách mạng tình yêu","Song Hyun Wook",Genre.COMEDY,Category.TVSHOW,787278,110));
        netflixes.add(new Netflix(7,"Jumanji","Jake Kasdan",Genre.COMEDY,Category.MOVIE,785278,98));
        netflixes.add(new Netflix(8,"Năm mươi sắc thái","Sam Taylor",Genre.ROMANTIC,Category.MOVIE,7852,150));
        netflixes.add(new Netflix(9,"Em chưa mười tám","Lê Thanh Sơn",Genre.ROMANTIC,Category.MOVIE,1786578,180));

    }
}