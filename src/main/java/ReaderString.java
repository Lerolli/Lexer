import java.util.ArrayList;

public class ReaderString extends AbstractReader implements IReadable {

    @Override
    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    @Override
    public void addToHashMap() {
        tempCheckReader.put("\"", new ReaderString());
    }

    @Override
    public Token toToken(String str, int c) {
        var count = 1 + c;
        var charArray = str.toCharArray();
        var result = new ArrayList<Character>();
        while (count != charArray.length) {
            if (charArray[count] == '\"')
                break;
            result.add(charArray[count]);
            count++;
        }
        return new Token(result, count - c + 1);
    }
}

