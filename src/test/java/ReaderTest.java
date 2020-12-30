import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;

import static org.junit.Assert.*;

public class ReaderTest {

    Lexer lexer = new Lexer();
    @Test
    public void CheckNull() {
        //lexer.register(new ReaderEndOfLineComment());
        //lexer.register(new ReaderEquals());
        //lexer.register(new ReaderFloatDoubleNumber());
        //lexer.register(new ReaderIntegerNumber());
        //lexer.register(new ReaderKeyWord("cat", "Yasha", "my", "is"));
        //lexer.register(new ReaderSemicolon());
        lexer.register(new ReaderTraditionalComment());
        lexer.register(new ReaderString());

        var string = lexer.tokenize("\" assfgdhnfbdsvvb \"");
        Assert.assertEquals("{ [=], [=], [=], [=], [=], [=], [ ] }", Token.ArrayToString(string));
    }
}