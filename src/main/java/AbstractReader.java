import java.util.HashMap;

public abstract class AbstractReader {

    protected static HashMap<String, IReadable> tempCheckReader = new HashMap<>();

    protected Token TryTokenize(String string, int count){
        var tempStr = "";
        var c = count;
        while (count != string.length()){
            tempStr += String.valueOf(string.charAt(count));
            if (tempCheckReader.containsKey(tempStr)){
                var result = tempCheckReader.get(tempStr).toToken(string, c);
                if (result != null)
                    return result;
            }
            count++;
        }
        return null;
    }
}