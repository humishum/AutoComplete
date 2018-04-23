/*CSE 205: 17566 / M W 4:35-5:50
Assignment: Assignment #6
Author(s): Humdaan Mustafa & 10042025
Description: This file contains The finder class which handles the actual autocompleting functions
*/
import java.util.ArrayList;

public class Finder{
    //initial private variables used in this class
    private String unfinished;
    private ArrayList<Word> listOfWords;
    private ArrayList<String> options = new ArrayList<String>();
    //class initializer
    public Finder(String unfinished, ArrayList<Word> listOfWords ){
        this.unfinished = unfinished;
        this.listOfWords = listOfWords;
    }
    //setter and getter methods for all variables
    public void setUnfinished(String unfinished){
        this.unfinished = unfinished;
    }
    public String getUnfinished(){
        return this.unfinished;
    }
    public void setListOfWords(ArrayList<Word> listOfWords){
        this.listOfWords = listOfWords;
    }
    public ArrayList<Word> getlistOfWords(){
        return this.listOfWords;
    }
    public void setOptions(ArrayList<String> options){
        this.options = options;
    }
    public ArrayList<String> getOptionsArrayList(){
        int size = options.size();
        this.sortOptions(options,size);
        return this.options;
    }
    public void getOptions(){
        int size = options.size();
        this.sortOptions(options,size);
        int numOptionsDisplay = 5;
        int count = 0;
        if(size < numOptionsDisplay){
            numOptionsDisplay=size;
        }
        //displays options with number of option
        while(count!= numOptionsDisplay){
            int num = count + 1;
            System.out.println(num + ". " + options.get(count));
            count++;
        }

    }
    // finds instances of unfinished word in the whole list and adds them into options
    public void findInstances(){
        int k = 0;
        //goes through list of words and compares each word to see if there is a match, then adds to options
        for(int i = 0 ;i < listOfWords.size() ; i++){
            String compare = listOfWords.get(i).getWord();
            if(compare.contains(getUnfinished())){
                //System.out.println(listOfWords.get(i).toString());
                //setOptions(options);
                options.add(compare);
                k++;
            }
        }
        setOptions(options);
    }
    //recursive bubblesort sorting algorithm to sort the options by biggest to smallest length
    public void sortOptions(ArrayList<String> options,int size){
        if( size <= 1){
            return;
        }
        for (int i = 0; i < size-1 ; i++){
            if (options.get(i).length() < options.get(i + 1).length()){
                swap(options, i , i + 1 );
            }
        }
        // Largest element is fixed, recur for remaining array
        sortOptions(options, size-1);

    }
    //helper method for bubble sort of options
    public void swap(ArrayList<String> options,int a, int b){
        String temp = options.get(a);
        String replace = options.get(b);
        options.set(a,replace);
        options.set(b,temp);
    }


}
