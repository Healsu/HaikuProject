import java.io.File;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        int amountHaikus = new File("Haikus").list().length;
        HaikuInput firstHaiku = new HaikuInput("", "", "", "");
        firstHaiku.setHaikuCounter(amountHaikus);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Haiku maker!" + "Your Haikus syllabels should look like this: 5,7,5");
        System.out.println("Keep every sentence to small letters, since the creator is lazy.");
        System.out.println("Let us begin with the authors name: ");
        String haikuAuthor = scanner.nextLine();
        firstHaiku.setAuthor(haikuAuthor);
//////////////////////////////////////////////////
        //I did the lazy solution and just made a for loop for a 100 times if the user doesnt meet the requirement, same with second and third haiku verse
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Write in your first sentence: ");
                String firstLine = scanner.nextLine();
                HaikuChecker info = new HaikuChecker();
                info.haikuSyllabesCheck(firstLine);
                if (info.haikuSyllabesCheck(firstLine) == true) {
                    firstHaiku.setFirstLine(firstLine);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Not a valid haiku poem");
            }
        }
//////////////////////////////////////////////////
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Write in your second sentence: ");
                String secondLine = scanner.nextLine();
                HaikuChecker info = new HaikuChecker();
                info.haikuSyllabesCheck2(secondLine);
                if (info.haikuSyllabesCheck2(secondLine) == true) {
                    firstHaiku.setSecondLine(secondLine);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Not a valid haiku poem");
            }
        }
//////////////////////////////////////////////////
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Write in your third sentence: ");
                String thirdLine = scanner.nextLine();
                HaikuChecker info = new HaikuChecker();
                info.haikuSyllabesCheck(thirdLine);
                if (info.haikuSyllabesCheck(thirdLine) == true) {
                    firstHaiku.setThirdLine(thirdLine);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Not a valid haiku poem");
            }
        }
        System.out.println(firstHaiku);
        haikuSaver.saveHaiku(firstHaiku);
    }

}
