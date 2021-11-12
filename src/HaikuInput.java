//This class is for all the information that we want from the haiku maker from author to the haiku itself.

public class HaikuInput {
    private String author;
    private int haikuID;
    private String firstLine;
    private String secondLine;
    private String thirdLine;
    private static int haikuCounter = 0;

    public HaikuInput(String author, String firstLine, String secondLine, String thirdLine) {
        this.author = author;
        //We want the haikuCounter to count up for every new object made (aka every new haiku made)
        haikuCounter++;
        haikuID = haikuCounter;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    //Setters to change the object we make in the main with the user input we get.
    public void setAuthor(String author){
        this.author = author;
    }
    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }
    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }
    public void setThirdLine(String thirdLine) {
        this.thirdLine = thirdLine;
    }
    public void setHaikuCounter(int currentCountFromHarddisk){
        this.haikuCounter = currentCountFromHarddisk+1;
        this.haikuID = this.haikuCounter;
    }

    //tbh we never really use these, but we have them just in case we should need them
    public String getFirstLine() {
        return firstLine;
    }
    public String getSecondLine() {
        return secondLine;
    }
    public String getThirdLine() {
        return thirdLine;
    }

    public String toCsv(){
        //We want the entire haiku returned set up this way, so we can use it in the method saveHaiku
        return this.haikuID + " ; " + this.author + " ; " + this.firstLine + " ; " + this.secondLine + " ; " + this.thirdLine + ";";
    }

    @Override
    public String toString() {
        return "haikuInput{" +
                "author='" + author + '\'' +
                ", haikuID=" + haikuID +
                ", firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", thirdLine='" + thirdLine + '\'' +
                '}';
    }
}
