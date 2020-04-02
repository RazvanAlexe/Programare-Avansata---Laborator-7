package lab7;

import java.util.*;

public class Board {

    private List<Token> Tokens;
    private int number_of_tokens;
    
    public Board()
    {
        number_of_tokens = 0;
        Tokens = new ArrayList<Token>();
    }

    public int getNumber_of_tokens() {
        return number_of_tokens;
    }
    
    public void addToken(Token t) {
        Tokens.add(t);
        number_of_tokens = number_of_tokens + 1;
    }

    public Token getToken(int index) {
        return Tokens.get(index);
    }

    public List<Token> getTokens() {
        return Tokens;
    }

    public void delToken(int index) {
        Tokens.remove(index);
        number_of_tokens = number_of_tokens - 1;
    }
}
