import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * CatWorld has cats.
 */
public class CatWorld extends World
{
    private Score theScore;
    /**
     * Constructor for objects of class CatWorld.
     * 
     */
    public CatWorld()
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        populateWorld();
    }

    /**
     * Act
     */
    public void act()
    {
        //2% of the time add a pizza at a random location
        if (Greenfoot.getRandomNumber(100)<2)
        {
            addObject(new Pizza(), Greenfoot.getRandomNumber(700), 0);
        }
    }

    /**
     * Populate the cat world
     */
    public void populateWorld()
    {    
        //for(int i=1; i<11; i++){
        addObject(new Cat(), 350, 430 );
        theScore = new Score();
        addObject(theScore, 50, 15);
        //}
    }
    /**
     * Allow other classes to access the score.
     */
    public Score getScore()
    {    
        return theScore;
    }
}
