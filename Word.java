public class Word{
    //initial private variables used in this class
    private int rank;
    private String word;
    //setter and getter methods for class
    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return this.rank;
    }
    public void setWord(String word){
        this.word=word;
    }
    public String getWord(){
            return this.word;
    }

    // Initializes a term with the given query string and weight.
    public Word(int rank, String word){
        this.rank=rank;
        this.word=word;
    }
    //toString method
    public String toString(){
        int ranko = this.getRank();
        String wordo = this.getWord();
        return ranko +" " +wordo;
    }
}
