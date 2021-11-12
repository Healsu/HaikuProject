import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class haikuSaver {
    private int haikucounter = 1;

    public static void saveHaiku(HaikuInput haiku){
        //Kode der gemmer til harddisk
        haiku.toCsv();

        try{
            File newHaiku = new File("C:\\Users\\admin\\Pictures\\Programmering\\HaikuProject\\Haikus\\Saver2");
            if (newHaiku.createNewFile()){
                System.out.println("Haiku file created: "+ newHaiku.getName());
                FileWriter writer = new FileWriter(newHaiku);
                writer.write(haiku.toCsv());
                writer.close();
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
