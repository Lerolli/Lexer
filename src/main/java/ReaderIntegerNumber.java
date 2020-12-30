import java.util.ArrayList;

public class ReaderIntegerNumber extends AbstractReader implements IReadable  {

    public boolean TryToInt(char i){
        if (i == '1')
            return true;
        else if (i == '2')
            return true;
        else if (i == '3')
            return true;
        else if (i == '4')
            return true;
        else if (i == '5')
            return true;
        else if (i == '6')
            return true;
        else if (i == '7')
            return true;
        else if (i == '8')
            return true;
        else if (i == '9')
            return true;
        else return i == '0';
    }

    @Override
    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    @Override
    public void addToHashMap() {
        tempCheckReader.put("1", new ReaderIntegerNumber());
        tempCheckReader.put("2", new ReaderIntegerNumber());
        tempCheckReader.put("3", new ReaderIntegerNumber());
        tempCheckReader.put("4", new ReaderIntegerNumber());
        tempCheckReader.put("5", new ReaderIntegerNumber());
        tempCheckReader.put("6", new ReaderIntegerNumber());
        tempCheckReader.put("7", new ReaderIntegerNumber());
        tempCheckReader.put("8", new ReaderIntegerNumber());
        tempCheckReader.put("9", new ReaderIntegerNumber());
        tempCheckReader.put("0", new ReaderIntegerNumber());
        tempCheckReader.put("-", new ReaderIntegerNumber());
    }

    @Override
    public Token toToken(String str, int count) {
        var c = count;
        var charArray = str.toCharArray();
        var result = new ArrayList<Character>();
        while (c != charArray.length) {
            if (!TryToInt(charArray[c]))
                break;
            result.add(charArray[c]);
            c++;
        }
        return new Token(result, c - count);
    }
}

