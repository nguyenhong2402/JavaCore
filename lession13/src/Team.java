import java.util.ArrayList;

public class Team {
    ArrayList<Player> allPlayers;

    public Team() {
        allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1, "Bùi Tấn Trường", Possition.GK));
        allPlayers.add(new Player(23, "Trần Nguyên Mạnh", Possition.GK));
        allPlayers.add(new Player(12, "Nguyễn Văn Hoàng", Possition.GK));
        allPlayers.add(new Player(13, "Hồ Tấn Tài", Possition.DF));
        allPlayers.add(new Player(16, "Nguyễn Thành Chung", Possition.DF));
        allPlayers.add(new Player(2, "Đỗ Duy Mạnh", Possition.DF));
        allPlayers.add(new Player(7, "Nguyễn Phong Hồng Duy", Possition.DF));
        allPlayers.add(new Player(17, "Vũ Văn Thanh", Possition.DF));
        allPlayers.add(new Player(5, "Phạm Xuân Mạnh", Possition.DF));
        allPlayers.add(new Player(3, "Quế Ngọc Hải", Possition.DF));
        allPlayers.add(new Player(4, "Bùi Tiến Dũng", Possition.DF));
        allPlayers.add(new Player(21, "Bùi Hoàng Việt Anh", Possition.DF));
        allPlayers.add(new Player(19, "Nguyễn Quang Hải", Possition.MF));
        allPlayers.add(new Player(15, "Phạm Đức Huy", Possition.MF));
        allPlayers.add(new Player(6, "Lương Xuân Trường", Possition.MF));
        allPlayers.add(new Player(20, "Phan Văn Đức", Possition.MF));
        allPlayers.add(new Player(14, "Nguyễn Hoàng Đức", Possition.MF));
        allPlayers.add(new Player(8, "Lê Văn Xuân", Possition.MF));
        allPlayers.add(new Player(11, "Nguyễn Tuấn Anh", Possition.MF));
        allPlayers.add(new Player(9, "Nguyễn Văn Toàn", Possition.FW));
        allPlayers.add(new Player(22, "Nguyễn Tiến Linh", Possition.FW));
        allPlayers.add(new Player(10, "Nguyễn Công Phượng", Possition.FW));
        allPlayers.add(new Player(18, "Hà Đức Chinh", Possition.FW));

    }
}
