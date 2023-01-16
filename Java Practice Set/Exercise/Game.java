package Exercise;

public class Game {
    private int Counter = 0;
    private int myNum;
    private int compNum;

    public Game() {
        compNum = (int) (Math.random() * 100);
    }

    public void setNumber(int n) {
        myNum = n;
    }
}
