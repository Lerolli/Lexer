import java.util.ArrayList;

public class ReaderEndOfLineComment extends AbstractReader implements IReadable {

    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    public void addToHashMap() {
        tempCheckReader.put("//", new ReaderEndOfLineComment());
    }

    public Token toToken(String str, int c) {
        var count = 2 + c;
        var result = new ArrayList<Character>();
        while (count != str.length()){
            var ch = str.charAt(count);
            if (ch == '\n')
                break;
            result.add(ch);
            count++;
        }
        return new Token(result, count - c);
    }
}

