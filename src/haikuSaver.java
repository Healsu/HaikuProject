import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class haikuSaver {


    public static void saveHaiku(HaikuInput haiku) {
        //Kode der gemmer til harddisk
        int haikucounter = 0;
        haiku.toCsv();

        try {
            for (int i = 0; i < 10; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write in your file name: ");
                String userInput = scanner.nextLine();
                File newHaiku = new File("C:\\Users\\admin\\Pictures\\Programmering\\HaikuProject\\Haikus\\"+userInput);
                if (newHaiku.createNewFile()) {
                    System.out.println("Haiku file created: " + newHaiku.getName());
                    FileWriter writer = new FileWriter(newHaiku);
                    writer.write(haiku.toCsv());
                    writer.close();
                    i = 10;

                } else {
                    System.out.println("File already exists");
                    haikucounter += 1;
                    File replacementHaiku = new File("C:\\Users\\admin\\Pictures\\Programmering\\HaikuProject\\Haikus\\"+userInput + haikucounter);
                    if(replacementHaiku.createNewFile()){
                        FileWriter writer = new FileWriter(replacementHaiku);
                        writer.write(haiku.toCsv());
                        writer.close();
                        System.out.println("Changed file name, and created new file");
                        i = 10;
                    }
                }
            }
            } catch(IOException e){
                System.out.println("An error occurred");
                e.printStackTrace();
            }

        }
    }


