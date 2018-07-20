import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterWorld extends World
{
    private Score theScore;
    public int flyRate = 20;
    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        populateWorld();
    }
    
    public void act()
    {
        //flyRate% of the time add a Fly at a random location
        if (Greenfoot.getRandomNumber(1000)< flyRate)
        {
            addObject(new Fly(), getWidth(), Greenfoot.getRandomNumber(300));
            //flyRate++;
        }
    }
    
    private void populateWorld()
    {
        addObject(new Lilypad(), 150, 325);
        addObject(new Frog(), 150, 300);
    }
    
    /**
     * Allow other classes to access the score.
     */
    public Score getScore()
    {    
        return theScore;
    }
}
