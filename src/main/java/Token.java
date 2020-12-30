import java.util.ArrayList;

public class Token {
    private final String string;
    public int length;

    public Token(String sting, int count) {
        string = sting;
        length = count;

    }
    public Token(ArrayList<Character> list, int count){
        length = count;
        var stringBuilder = new StringBuilder();
        for (Character character : list) {
            stringBuilder.append(character);
        }
        string = stringBuilder.toString();
    }
    public static Token[] ToArray(ArrayList<Token> list){
        var tokenArray = new Token[list.size()];
        for (int i = 0; i < list.size(); i++){
            tokenArray[i] = list.get(i);
        }
        return tokenArray;
    }


    @Override
    public String toString() {

        return ("[" + string +"]" );
    }

    public static String ArrayToString (Token[] array){
        if (array == null)
            return null;
        var stringBuilder = new StringBuilder();
        stringBuilder.append("{ ");
        for (Token token : array) {
            stringBuilder.append(token.toString()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
