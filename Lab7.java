package lab7;

public class Lab7 {

    public static void main(String[] args) {
        Game game = new Game(7,5);
        Player p1 = new Player("Player 1",game);
        Player p2 = new Player("Player 2",game);
        game.addPlayer(p1);
        game.addPlayer(p2);
        
        game.loop();
    }
    
}
