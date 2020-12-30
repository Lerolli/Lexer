public class ReaderKeyWord extends AbstractReader implements IReadable{
    static String[] keyWords;

    public ReaderKeyWord(String ... str) {
        keyWords = str;
    }


    @Override
    public Token tryTokenize(String string, int count) {
       return TryTokenize(string, count);
    }

    public void addToHashMap(){
        for (String keyWord : keyWords) {
            tempCheckReader.put(keyWord, new ReaderKeyWord(keyWords));
        }
    }


    @Override
    public Token toToken(String string, int count) {
        var stringBuilder = new StringBuilder();
        var charArray = string.toCharArray();
        var c = count;
        while (count != string.length() + 1){
            var tempString = stringBuilder.toString();
            for (String keyword : keyWords)
                if (tempString.equals(keyword)){
                    return new Token(keyword, count - c);
                }
            stringBuilder.append(charArray[count]);
            count++;
        }
        return null;
    }
}
