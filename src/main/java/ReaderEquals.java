import java.lang.String;

public class ReaderEquals extends AbstractReader implements IReadable {

    public ReaderEquals(){ }

    public Token tryTokenize(String string, int count) {

        return TryTokenize(string, count);
    }

    public void addToHashMap() {
        tempCheckReader.put("=", new ReaderEquals());
    }

    public Token toToken(String str, int count) {
        return new Token("=", 1);
    }
}

