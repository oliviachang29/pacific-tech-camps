import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RainBurgerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RainBurgerWorld extends World
{
    private Score theScore;
    private Lives theLives;
    private int hamburgerRate = 20;
    /**
     * Constructor for objects of class RainBurgerWorld.
     * 
     */
    public RainBurgerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        populateWorld();
    }
    public void act()
    {
        //hamburgerRate% of the time add a Hamburger at a random location
        if (Greenfoot.getRandomNumber(1001)< hamburgerRate + theScore.points/50)
        {
            addObject(new Hamburger(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
        if (theScore.points/50 >= 4 && Greenfoot.getRandomNumber(1001)< hamburgerRate + theScore.points/50)
        {
            addObject(new HotDog(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
        if (theScore.points/50 >= 7 && Greenfoot.getRandomNumber(1001)< hamburgerRate + theScore.points/50)
        {
            addObject(new FrenchFries(), Greenfoot.getRandomNumber(getWidth()), 0);
        } 
    }
    
    private void populateWorld()
    {
        addObject(new Cannon(), 300, 200);
        theScore = new Score();
        addObject(theScore, 150, 15);
        theLives = new Lives();
        addObject(theLives, 450, 15);
    }
    
    /**
     * Allow other classes to access the score.
     */
    public Score getScore()
    {    
        return theScore;
    }
    
    /**
     * Allow other classes to access the lives.
     */
    public Lives getLives()
    {    
        return theLives;
    }
}
