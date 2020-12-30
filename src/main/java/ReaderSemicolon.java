public class ReaderSemicolon extends AbstractReader implements IReadable{


    @Override
    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    @Override
    public void addToHashMap() {
        tempCheckReader.put(";", new ReaderSemicolon());
    }

    public Token toToken(String str, int c) {
        return new Token(";", 1);
    }
}

