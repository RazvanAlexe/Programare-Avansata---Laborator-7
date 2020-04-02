package lab7;
import java.util.Scanner;

public class Player implements Runnable {

    private Game game;

    private String name;
    private int turn;

    @Override
    public void run() {
        if (game.getTurn() == turn) {
            // Afisam board
            System.out.println("Tokens valabile:");
            for (int i = 0; i < game.getBoard().getNumber_of_tokens(); i++) {
                System.out.print(game.getBoard().getToken(i) + " ");
            }
            System.out.println();
            // Alegem token
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            game.getBoard().delToken(input);
            
            // Trecem la urmatoarea runda
            game.nextTurn();
        }
    }

    public Player() {
        name = "";
    }

    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getTurn() {
        return turn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
