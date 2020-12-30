public class ReaderSpace extends AbstractReader implements IReadable {

    public ReaderSpace(){ }

    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    public void addToHashMap() {
        tempCheckReader.put(" ", new ReaderSpace());
    }

    public Token toToken(String str, int c) {
        return new Token(" ", 1);
    }
}

