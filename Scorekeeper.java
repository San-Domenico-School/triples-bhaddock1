/**
 * Write a description of class Scorekeeper here.
 * 
 * @author (Bryce) 
 * @version (1/9/2025)
 */
public class Scorekeeper  
{
    private static int deckSize, score;
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int deckSize)
    {
        deckSize = deckSize;
    }
    
    public static void setUpdateScore()
    {
        long timeTaken = System.currentTimeMillis() - startTime;
        if(timeTaken <= 10000)
        {
            score += 1000;
        }
        else if(timeTaken <= 15000)
        {
            score += 800;
        }
        else if(timeTaken <= 20000)
        {
            score += 500;
        }
        else
        {
            score += 100;
        }
        
    }
    
    public static int getScore()
    {
        return score;
    }
}
