import java.util.ArrayList;

public class Finder{
    //initial private variables used in this class
    private String unfinished;
    private ArrayList<Word> listOfWords;
    private ArrayList<String> options = new ArrayList<String>();
    //class initializer
    public Finder(String unfinished, ArrayList<Word> listOfWords ){
        this.unfinished=unfinished;
        this.listOfWords=listOfWords;
    }
    //setter and getter methods for all variables
    public void setUnfinished(String unfinished){
        this.unfinished=unfinished;
    }
    public String getUnfinished(){
        return this.unfinished;
    }
    public void setListOfWords(ArrayList<Word> listOfWords){
        this.listOfWords=listOfWords;
    }
    public ArrayList<Word> getlistOfWords(){
        return this.listOfWords;
    }
    public void setOptions(ArrayList<String> options){
        this.options = options;
    }
    public void getOptions(){
        for(int i =0;i<options.size();i++){
            System.out.println(options.get(i));
        }
    }
    // finds instances of unfinished word in the whole list and adds them into options
    public void findInstances(){
        int k=0;
        //goes through list of words and compares each word to see if there is a match, then adds to options
        for(int i=0;i<listOfWords.size();i++){
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

    public void sortOptions(Word[] options){
        // could sort them alphabetically?
    }


}
