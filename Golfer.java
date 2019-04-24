import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Creates a Golfer object.
 * @author Sam
 */
public class Golfer {

    private int golferNum = 0;
    private  String name = ""; 
    private int[] holeScore = new int[18];
    private int totalScore = 0;
    
   
    /**
     * Adds the scores in the Golfer's hole score array. returns the total score.
     * @param holeScores
     * @return
     */
    public int CalculateScore(Golfer g)
    {
        int totalScore = 0;
        // loop to calculate score
        
        return totalScore;
    }
    
    /**
     * Add score at each hole.  Takes the score input by user and adds it to that
     * Golfer's (holeScore) score array.
     * @param g
     * @param holeNumber 
     */
    public void addHoleScore(Golfer g, int holeNumber)
    {
        int userInput = 0; //userInput should be defined as input from suer.
        g.holeScore[holeNumber -1] = userInput;
    }    
    
    /**
     * Sets the name of a given golfer.  Use to correct a golfer's name if needed.
     * @param g
     * @param providedName 
     */
    public void setName(Golfer g, String providedName)
    {
        g.name = providedName;
    }
}
