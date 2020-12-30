import java.util.ArrayList;
import java.util.HashMap;

public interface IReadable{

    Token tryTokenize(String string, int count);

    void addToHashMap();

    Token toToken(String str, int count);
}
