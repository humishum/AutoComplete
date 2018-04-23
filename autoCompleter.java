import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;


public class autoCompleter {
    public static void main(String[] args)throws Exception {
        //initial scanner and file objects
        File file =new File("listOfWords.txt");
        Scanner sc = new Scanner(file);
        int numWords=0;
        ArrayList<Word> words = new ArrayList<Word>();
        while (sc.hasNextLine()){
        //System.out.println(sc.nextLine());
        words.add(new Word (numWords,sc.nextLine()));
        numWords++;
        }
        Scanner console =  new Scanner(System.in);
        String sentence = console.nextLine();
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);

        Finder find = new Finder(lastWord,words);
        find.findInstances();
        find.getOptions();
    /*    for(int i=0;i<numWords;i++){
            System.out.println(words.get(i).toString());
        }*/
        /*Word[] words= new Word[numWords];

        for(int i=0;i<numWords;i++){
            String =sc.hasNe
            words[i]= new Word(i,word);
        }*/
    }

}
