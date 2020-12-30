import java.lang.String;
import java.util.ArrayList;

public class ReaderFloatDoubleNumber extends AbstractReader implements IReadable {


    public boolean TryToFloatOrDouble(char i){

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
        else if (i == '.')
            return true;
        else if (i == 'e')
            return true;
        else if (i == 'f')
            return true;
        else if (i == 'd')
            return true;
        else return i == '0';
    }

    public Token toToken(String string, int count) {
        var c = count;
        var charArray = string.toCharArray();
        var result = new ArrayList<Character>();
        while (c != charArray.length) {
            if (!TryToFloatOrDouble(charArray[c]))
                break;
            result.add(charArray[c]);
            c++;
        }
        return new Token(result, c - count);
    }

    @Override
    public Token tryTokenize(String string, int count) {
        return TryTokenize(string, count);
    }

    @Override
    public void addToHashMap() {
        tempCheckReader.put("1", new ReaderFloatDoubleNumber());
        tempCheckReader.put("2", new ReaderFloatDoubleNumber());
        tempCheckReader.put("3", new ReaderFloatDoubleNumber());
        tempCheckReader.put("4", new ReaderFloatDoubleNumber());
        tempCheckReader.put("5", new ReaderFloatDoubleNumber());
        tempCheckReader.put("6", new ReaderFloatDoubleNumber());
        tempCheckReader.put("7", new ReaderFloatDoubleNumber());
        tempCheckReader.put("8", new ReaderFloatDoubleNumber());
        tempCheckReader.put("9", new ReaderFloatDoubleNumber());
        tempCheckReader.put("0", new ReaderFloatDoubleNumber());
        tempCheckReader.put("-", new ReaderFloatDoubleNumber());
        tempCheckReader.put(".", new ReaderFloatDoubleNumber());
    }
}

