public class Player {
    int number;
    String fullName;
    Possition possition;

    public Player(int number, String fullName, Possition possition) {
        this.number = number;
        this.fullName = fullName;
        this.possition = possition;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Possition getPossition() {
        return possition;
    }

    public void setPossition(Possition possition) {
        this.possition = possition;
    }

    @Override
    public String toString() {
        return number + " - " + fullName + " - " + possition;
    }
}

