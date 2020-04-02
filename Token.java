package lab7;

import java.util.Random;

public class Token {

    private int M;
    private int value;
    private boolean blank;

    public Token(int M) {
        this.value = 0;
        this.blank = true;
        this.M = M;
    }

    public Token(int value, int M) {
        this.value = value;
        this.blank = false;
        this.M = M;
    }

    public int getValue() {

        if (blank == false) {
            return value;
        }
        Random rand = new Random();
        return rand.nextInt(M);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBlank() {
        return blank;
    }

    public void setBlank(boolean blank) {
        this.blank = blank;
    }

}
