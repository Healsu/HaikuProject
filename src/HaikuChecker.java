public class HaikuChecker {
    private char[] vowels = {'a','e','i','o','u'};
    private char[] consonant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
    private int haikuID;

    //The method that will check how many syllabes a haiku verse has.
    public boolean haikuSyllabesCheck(String sentence) throws HaikuException {

        //It is constructed by several for loops that will compare a char array of vowels with every letter in the sentence sent.
        char[] lineAsArray = sentence.toCharArray();
        int syllabelCounter = 0;
        for (int i = 0; i < lineAsArray.length; i++) {
            char c = lineAsArray[i];

            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]){

                    //Here is the way tho to know if its a syllabel, i have made a for loop to check if a vowel is detected, does it have a consonant
                    //afterwards. If yes then add to a counter
                    for (int k = 0; k < consonant.length; k++) {
                        if(c+1 == consonant[k]){
                            syllabelCounter ++;
                    }
                }}}}
        //and finally if the counter is 5 it returns true that the haiku meets the requirements.
        if (syllabelCounter == 5){
            return true;
        } else {
            throw new HaikuException();
        }
    }

    //To check the second verse which has a syllabel requirement of 7.
    //else pretty much the same as the first.
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

