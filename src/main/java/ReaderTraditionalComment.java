import java.util.ArrayList;

public class ReaderTraditionalComment extends AbstractReader implements IReadable {

    @Override
    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    @Override
    public void addToHashMap() {
        tempCheckReader.put("/*", new ReaderTraditionalComment());
    }

    @Override
    public Token toToken(String str, int c) {
        var count = 2 + c;
        var charArray = str.toCharArray();
        var result = new ArrayList<Character>();
        while (count != charArray.length - 1) {
            if (charArray[count] == '*' && charArray[count + 1] == '/')
                break;
            result.add(charArray[count]);
            count++;
        }
        return new Token(result, count - c + 2);
    }
}

