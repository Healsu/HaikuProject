import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class haikuSaver {

    //Our method that saves haiku made by the user into a new file, in a direct folder.
    public static void saveHaiku(HaikuInput haiku) {
        int haikucounter = 0;
        haiku.toCsv();

        //The main code is made of a try commando and for loop that will repeat if the name they will give the file is already taken.
        try {
            for (int i = 0; i < 10; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Write in your file name: ");
                String userInput = scanner.nextLine();

                //We create a new File.
                File newHaiku = new File("Haikus\\"+userInput);

                //And give it a if requirement if the file could be created
                if (newHaiku.createNewFile()) {
                    System.out.println("Haiku file created: " + newHaiku.getName());

                    //We will describe that file with the FileWriter which purpose is to write in the newly created file
                    //Where it will then "write" to enter the haiku, and then "close" to tell it to stop after the haiku has been inserted
                    FileWriter writer = new FileWriter(newHaiku);
                    writer.write(haiku.toCsv());
                    writer.close();
                    i = 10;

                    //We also have a else command if the file name has been taken.
                } else {
                    System.out.println("File already exists");
                    haikucounter += 1;
                    //We will create a new file and give it the same requirement, but "slightly" change the name of the file.
                    File replacementHaiku = new File("Haikus\\"+userInput + haikucounter);
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


