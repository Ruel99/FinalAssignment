import jdk.swing.interop.SwingInterOpUtils;
import java.io.*;
import java.nio.Buffer;
import java.io.File;
import java.util.Scanner;

public class Note {
    private String author;
    private String date;
    private String description;

    //Constructor
    Note( String author, String date, String description){
        this.author = author;
        this.date = date;
        this.description = description;
    }//end of the note constructor

    //accessors and mutators
    public String getAuthor(){return author;}
    public String getDate(){return date;}
    public String getDescription(){return description;}

    public void setAuthor(String author){this.author = author;}
    public void setDate(String date){this.date = date;}
    public void setDescription(String description){this.description = description;}

Scanner sc = new Scanner(System.in);

    File file = new File("NotePad"); // creates a file named NotePad
    void addNotes(Note arr[]){


        for(int i = 0; i < arr.length; i++){
            System.out.println("Please enter the name of the author of this note");
            String author = sc.nextLine();
            arr[i].setAuthor(author);

            System.out.println("Please enter the date of this note");
            String date = sc.nextLine();
            arr[i].setDate(date);

            System.out.println("You can now enter your note");
            String description = sc.nextLine();
            arr[i].setDescription(description);

            //checks to see if a file exists
            try {
                if(!file.exists()){
                    file.createNewFile();
                }

                BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true));
                buffer.write(author);
                buffer.write(date);
                buffer.write(description);

                buffer.close();
                System.out.println("Successfully written to file");

            }catch (Exception ex){
                System.out.println(ex);
            }// end of try catch
        }//end of for loop
    }//end of add notes


    void displayNotes(Note arr[]){
        for(int i = 0; i < arr.length; i++){
            try{
                if(!file.exists()){
                    file.createNewFile();
                }//end of if

                BufferedReader br = new BufferedReader(new FileReader(file));
                int j;
                while((j = br.read()) != -1){
                    System.out.print((char)j);
                }//end of while loop
                br.close();

            }catch (Exception ex){
                System.out.println(ex);
            }//end of try catch
        }//end of for loop
    }//end of display notes


    void removeNotes(Note arr[]){
        Note temp;
        System.out.println("Are you sure you want to remove a note, if yes enter 'y' if no enter 'n'.");
        char delete = sc.next().charAt(0);

        if(delete == 'Y' || delete == 'y'){
            System.out.println("Please enter the number of the note, whether if it is the first, second etc..");
            int noteNum = sc.nextInt();

            for(int i = noteNum; i < arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            System.out.println("The note was successfully removed");
        }else if(delete == 'n' || delete == 'N'){
            System.out.println("Ok");
        }//end of if else statement
    }//end of remove notes

    void searchNotes(Note arr[]){

    }//end of search notes

    void updateNotes(Note arr[]){

    }//end of update notes


}//end of note class
