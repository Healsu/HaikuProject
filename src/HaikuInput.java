public class HaikuInput {
    private String author;
    private int haikuID;
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    private static int haikuCounter = 0;

    public HaikuInput(String author, String firstLine, String secondLine, String thirdLine) {
        this.author = author;
        haikuCounter++;
        haikuID = haikuCounter;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

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

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
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
