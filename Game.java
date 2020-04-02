package lab7;

import java.util.*;

public class Game {

    private int M;
    private int N;

    private int turn;
    private int player_number;

    private boolean game_started;

    private List<Player> Players;
    private Board board;

    public Game(int M, int N) {
        Players = new ArrayList<Player>();
        player_number = 0;
        game_started = false;
        this.M = M;
        this.N = N;
        turn = 1;

    }

    public Board getBoard() {
        return board;
    }

    public void addToken(Token t) {
        board.addToken(t);
    }

    public List<Token> getTokens() {
        return board.getTokens();
    }

    public void addPlayer(Player p) {
        if (turn < 2) {
            p.setTurn(turn);
            Players.add(p);
            turn = turn + 1;
            if (turn == 2) {
                game_started = true;
            }
        }

    }

    public void loop() {
        if (game_started == true) {
            Thread t1 = new Thread(Players.get(0));
            Thread t2 = new Thread(Players.get(1));

            t1.start();
            t2.start();
        }
    }

    public void nextTurn() {
        turn = turn + 1;
        if (turn == 2) {
            turn = 0;
        }
    }

    public int getTurn() {
        return turn;
    }

    public int getM() {
        return M;
    }

    public void setM(int M) {
        this.M = M;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

}
