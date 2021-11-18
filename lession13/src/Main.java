import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TeamService ts = new TeamService();
        ts.printAllplayer();
        System.out.println("--------------------------------------------------------------");
        Random rd = new Random();
        int n = rd.nextInt(3);
        switch (n){
            case 0:
                ts.selectTeam1();
                break;
            case 1:
                ts.selectTeam2();
                break;
            case 2:
                ts.selectTeam3();
        }
    }
}
