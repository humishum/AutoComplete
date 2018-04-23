/*CSE 205: 17566 / M W 4:35-5:50
Assignment: Assignment #6
Author(s): Humdaan Mustafa & 10042025
Description: This file contains The Selector java file which takes the user input and outputs the sentence with the input taken into account
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Selector{
    private String Sentence;
    private ArrayList<String> options;
    private String finalSentence;
    public Selector(String Sentence, ArrayList<String> options){
        this.Sentence = Sentence;
        this.options = options;
    }
    //getter and setter methods
    public void setSentence(String Sentence){
        this.Sentence = Sentence;
    }
    public String getSentence(){
        return this.Sentence;
    }
    public void setOptions(ArrayList<String> options){
        this.options = options;
    }
    public ArrayList<String> getOptions(){
        return options;
    }
    public void getInput(){
        Scanner console = new Scanner(System.in);
        int input=console.nextInt();
        if(input<=this.getOptions().size() && input > 0 ){
            //if input is valid call the replace method
            replace(this.getSentence(),input);
        }else{
            //restart method
            System.out.println("Please input a valid option.");
            getInput();
        }
    }
    public void setfinalSentence(String finalSentence){
        this.finalSentence=finalSentence;
    }
    public String getfinalSentence(){

        return this.finalSentence;
    }
    //replaces unfiished word with chosen input
    public void replace(String Sentence, int input){
        //if only 1 word inputted then output requested, otherwise replace unfinished in Sentence with request
        String finalSentence;
        if(Sentence.contains(" ")){
            String firstPart = Sentence.substring(0, Sentence.lastIndexOf(" "));
            finalSentence = firstPart+" "+this.getOptions().get(input-1);
        }
        else{
             finalSentence= options.get(input-1);
        }
        this.setfinalSentence(finalSentence);
    }
}
