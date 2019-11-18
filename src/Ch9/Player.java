package Ch9;

public class Player {
    int id;

    public Player(int id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return Integer.toString(id);
    }
}
