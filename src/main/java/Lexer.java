import java.util.*;

public class Lexer {

    ArrayList<IReadable> readers = new ArrayList<>();

    public void register(IReadable reader){
        readers.add(reader);
        reader.addToHashMap();
    }

    public Token[] tokenize(String string){
        var counter = 0;
        var listToken = new ArrayList<Token>();
        while (counter < string.length()){
            for (IReadable reader : readers) {
                var token = reader.tryTokenize(string,counter);
                if (token == null)
                    return null;
                listToken.add(token);
                counter += token.length;
            }
        }
        return Token.ToArray(listToken);
    }
}
