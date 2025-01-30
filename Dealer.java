import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dealer extends Actor
{
    Deck deck = new Deck(81);
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining;
    
    
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck;
        this.triplesRemaining = numCardsInDeck / 3;
        this.deck = new Deck(numCardsInDeck);
        this.cardsSelected = new Card[3];
        this.cardsOnBoard = new ArrayList<>();
        this.selectedCardsIndex = new ArrayList<>();
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    public void dealBoard() 
    {
        Greenfoot.playSound("shuffle.wav");
        int boardWidth = 430;
        int boardHeight = 600;
        int rows = 5;
        int cols = 3;
        int cardWidth = 123;
        int cardHeight = 65;
        int horizontalSpacing = (boardWidth - (cols * cardWidth)) / (cols + 1);
        int verticalSpacing = 20;
        int startX = 77;
        int startY = 40;
        
        
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < cols; col++)
            {
                if(deck.getNumCardsInDeck() == 0)
                {
                    return;
                }
                
                int x = startX + col * (cardWidth + horizontalSpacing);
                int y = startY + row * (cardHeight + verticalSpacing);
                
                Card card = deck.getTopCard();
                cardsOnBoard.add(card);
                World world = getWorld();
                if(world != null)
                {
                    world.addObject(card, x, y);
                }
            }
        }
    }

    public void setUI() 
    {
        if(getWorld() == null)
        {
            return;
        }
        
        GreenfootImage cardsImage = new GreenfootImage(String.valueOf(deck.getNumCardsInDeck()), 24, Color.BLACK, new Color(255, 255, 255, 0));
        Actor cardsRemainingActor = new Actor()
        {
            {
                setImage(cardsImage);
            }
        };
        getWorld().addObject(cardsRemainingActor, 315, 470);
        
        GreenfootImage scoreImage = new GreenfootImage(String.valueOf(Scorekeeper.getScore()),24, Color.BLACK, new Color(255, 255, 255, 0));
        Actor scoreActor = new Actor()
        {
            {
                setImage(scoreImage);
            }
        };
        getWorld().addObject(scoreActor, 315, 505);
    }

    public void endGame() 
    {
        
    }

    public void checkIfTriple() 
    {
        
    }

    public void actionIfTriple() 
    {
        
    }

    public void setCardsSelected(ArrayList<Card> cardList, ArrayList<Integer> indexList, Card[] cardArray) 
    {
        
    }
    
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
