import java.io.File;
import java.io.IOException;

public class haikuSaver {

    public static void saveHaiku(HaikuInput haiku){
        //Kode der gemmer til harddisk
        haiku.toCsv();

        try{
            File newHaiku = new File("C:\\Users\\admin\\Pictures\\Programmering\\HaikuProject\\Haikus\\Saver");
            if (newHaiku.createNewFile()){
                System.out.println("Haiku file created: "+ newHaiku.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
