import java.util.Scanner;
public class NoteApplication {
    public static void main (String ards[]){
        Note arr[];// this is an array of type Note
        int userInput;
        char repeat = 'y';

        Scanner sc = new Scanner(System.in);

        System.out.println("*****************************************************************************");
        System.out.println("*                  Welcome to Sticky Notes  program                         * ");
        System.out.println("*                                                                           * ");
        System.out.println("*             In this application you are able to Add notes                 * ");
        System.out.println("*                                                                           * ");
        System.out.println("*            Update an existing note, Remove a completed note               * ");
        System.out.println("*                                                                           * ");
        System.out.println("*             Search for a note and Display all the notes                   * ");
        System.out.println("***************************************************************************** ");

        while (repeat == 'y' || repeat == 'y'){
            System.out.println("Please choose one of the following options to begin");
            System.out.println("***************************************************");
            System.out.println("|                1 - Add a Note                   |");
            System.out.println("|                2 - Update Note                  |");
            System.out.println("|                3 - Remove Note                  |");
            System.out.println("|                4 - Search for Note              |");
            System.out.println("|                5 - Print all Notes              |");
            System.out.println("***************************************************");

            userInput=sc.nextInt();

            for (int counter = 0; counter < 1; counter++){
                switch (userInput){
                    case 1:
                        // call to the addNote function
                      break;

                    case 2:
                        //call to updateNote function
                        break;

                    case 3:
                        //call to removeNote function
                        break;

                    case 4:
                        //call to searchNote function
                        break;

                    case 5:
                        //call to displayNote function
                        break;

                    default:
                        System.out.println("Choose a number between 1 and 5");
                        break;
                }//end of switch
            }//end of for loop

            System.out.println("If you want to continue this application press y else press n");
                repeat = sc.next().charAt(0);
        }//end of while loop
    }//end of main
}//end of NoteApplication class
