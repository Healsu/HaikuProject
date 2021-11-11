public class HaikuException extends Exception{
    //Simple code to tell my exceptions in the main that if the requirements for a haiku isnt the right amount of syllabels.
    public HaikuException (){
        super("Not a valid haiku");
    }
}
