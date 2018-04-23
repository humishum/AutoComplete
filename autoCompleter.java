/*CSE 205: 17566 / M W 4:35-5:50
Assignment: Assignment #6
Author(s): Humdaan Mustafa & 10042025
Description: This file contains The Autocompleter java file which is the backbone of the program.
*/
import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class autoCompleter {
    public static void main(String[] args)throws Exception {
        //initial scanner and file objects
        File file =new File("listOfWords.txt");
        Scanner sc = new Scanner(file);
        int numWords = 0;
        ArrayList<Word> words = new ArrayList<Word>();
        while (sc.hasNextLine()){
        //System.out.println(sc.nextLine());
        words.add(new Word (numWords,sc.nextLine()));
        numWords++;
        }
        Scanner consoleInput =  new Scanner(System.in);
        String sentence = "";
        starter(consoleInput,words,sentence);

    }
    //Recursively runs starter , which starts the process of taking in input. Takes in sentence, checks if autocomplete is
    //necessary, and then takes user request for autocomplete, and then outputs everything the user has inputted so far
    public static void starter(Scanner consoleInput,ArrayList<Word> words,String sentence){
        consoleInput =  new Scanner(System.in);
        sentence = sentence + consoleInput.nextLine();
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") + 1);

        Finder find = new Finder(lastWord,words);
        find.findInstances();
        find.getOptions();
        if(find.getOptionsArrayList().size()!= 0){
        Selector select = new Selector(sentence,find.getOptionsArrayList());
        select.getInput();
        sentence=select.getfinalSentence() + " ";
        System.out.println(sentence);
        }
        starter(consoleInput,words,sentence);
    }

}
