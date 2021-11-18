import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class TeamService {
    Team team = new Team();
    public void printAllplayer(){
        System.out.println("In thông tin đội tuyển: ");
        Collections.sort(team.allPlayers, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });
        print(team.allPlayers);
    }

    public ArrayList<Player> print(ArrayList<Player> list){
        for (Player s: list) {
            System.out.println(s);
        }
        return list;
    }
    public void selectTeam1(){
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random rd = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("Đội hình 1GF - 4DF - 4MF - 2FW: ");
        while (gateKeeperSize<1){
            int rdGateKeeperSize = rd.nextInt(23);
            if (team.allPlayers.get(rdGateKeeperSize).getPossition().equals(Possition.GK)){
                selectedTeam.add(team.allPlayers.get(rdGateKeeperSize));
                gateKeeperSize++;
            }
        }
        while (defenderSize<4){
            int rdDF = rd.nextInt(23);
            if (team.allPlayers.get(rdDF).getPossition().equals(Possition.DF) && !selectedTeam.contains(team.allPlayers.get(rdDF))){
                selectedTeam.add(team.allPlayers.get(rdDF));
                defenderSize++;
            }
        }
        while (midFieldSize<4){
            int rdMF = rd.nextInt(23);
            if (team.allPlayers.get(rdMF).getPossition().equals(Possition.MF) && !selectedTeam.contains(team.allPlayers.get(rdMF))){
                selectedTeam.add(team.allPlayers.get(rdMF));
                midFieldSize++;
            }
        }
        while (forwaderSize<2){
            int rdFW = rd.nextInt(23);
            if (team.allPlayers.get(rdFW).getPossition().equals(Possition.FW) && !selectedTeam.contains(team.allPlayers.get(rdFW))){
                selectedTeam.add(team.allPlayers.get(rdFW));
                forwaderSize++;
            }
        }
        print(selectedTeam);
    }
    public void selectTeam2(){
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random rd = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("Đội hình 1GF - 4DF - 3MF - 3FW: ");
        while (gateKeeperSize<1){
            int rdGateKeeperSize = rd.nextInt(23);
            if (team.allPlayers.get(rdGateKeeperSize).getPossition().equals(Possition.GK)){
                selectedTeam.add(team.allPlayers.get(rdGateKeeperSize));
                gateKeeperSize++;
            }
        }
        while (defenderSize<4){
            int rdDF = rd.nextInt(23);
            if (team.allPlayers.get(rdDF).getPossition().equals(Possition.DF) && !selectedTeam.contains(team.allPlayers.get(rdDF))){
                selectedTeam.add(team.allPlayers.get(rdDF));
                defenderSize++;
            }
        }
        while (midFieldSize<3){
            int rdMF = rd.nextInt(23);
            if (team.allPlayers.get(rdMF).getPossition().equals(Possition.MF) && !selectedTeam.contains(team.allPlayers.get(rdMF))){
                selectedTeam.add(team.allPlayers.get(rdMF));
                midFieldSize++;
            }
        }
        while (forwaderSize<3){
            int rdFW = rd.nextInt(23);
            if (team.allPlayers.get(rdFW).getPossition().equals(Possition.FW) && !selectedTeam.contains(team.allPlayers.get(rdFW))){
                selectedTeam.add(team.allPlayers.get(rdFW));
                forwaderSize++;
            }
        }
        print(selectedTeam);
    }
    public void selectTeam3(){
        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random rd = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("Đội hình 1GF - 3DF - 5MF - 2FW: ");
        while (gateKeeperSize<1){
            int rdGateKeeperSize = rd.nextInt(23);
            if (team.allPlayers.get(rdGateKeeperSize).getPossition().equals(Possition.GK)){
                selectedTeam.add(team.allPlayers.get(rdGateKeeperSize));
                gateKeeperSize++;
            }
        }
        while (defenderSize<3){
            int rdDF = rd.nextInt(23);
            if (team.allPlayers.get(rdDF).getPossition().equals(Possition.DF) && !selectedTeam.contains(team.allPlayers.get(rdDF))){
                selectedTeam.add(team.allPlayers.get(rdDF));
                defenderSize++;
            }
        }
        while (midFieldSize<5){
            int rdMF = rd.nextInt(23);
            if (team.allPlayers.get(rdMF).getPossition().equals(Possition.MF) && !selectedTeam.contains(team.allPlayers.get(rdMF))){
                selectedTeam.add(team.allPlayers.get(rdMF));
                midFieldSize++;
            }
        }
        while (forwaderSize<2){
            int rdFW = rd.nextInt(23);
            if (team.allPlayers.get(rdFW).getPossition().equals(Possition.FW) && !selectedTeam.contains(team.allPlayers.get(rdFW))){
                selectedTeam.add(team.allPlayers.get(rdFW));
                forwaderSize++;
            }
        }
        print(selectedTeam);
    }
}
