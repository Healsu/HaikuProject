public class HaikuChecker {
    private char[] vowels = {'a','e','i','o','u'};
    private char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private int haikuID;

    public boolean haikuSyllabesCheck(String sentence) throws HaikuException {

        char[] lineAsArray = sentence.toCharArray();
        int syllabelCounter = 0;
        for (int i = 0; i < lineAsArray.length; i++) {
            char c = lineAsArray[i];

            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]){

                    for (int k = 0; k < consonant.length; k++) {
                        if(c+1 == consonant[k]){
                            syllabelCounter ++;
                    }
                }}}}
        if (syllabelCounter == 5){
            return true;
        } else {
            throw new HaikuException();
        }
    }
    public boolean haikuSyllabesCheck2(String sentence) throws HaikuException {

        char[] lineAsArray = sentence.toCharArray();
        int syllabelCounter = 0;
        for (int i = 0; i < lineAsArray.length; i++) {
            char c = lineAsArray[i];

            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]){

                    for (int k = 0; k < consonant.length; k++) {
                        if(c+1 == consonant[k]){
                            syllabelCounter ++;
                        }
                    }}}}
        if (syllabelCounter == 7){
            return true;
        } else {
            throw new HaikuException();
        }
    }


}

