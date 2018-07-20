import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
/**
 * Lobsters eat crabs.
 */
public class Lobster  extends Animal
{
    private int CrabEaten;
    
    public void act()
    {
        //Greenfoot.turnTowards(crabX, crabY);
        move();
        randomTurn();
        turnAtEdge();
        lookForCrab();
        
    }

    /**
     * Check whether the lobster can see a crab.
     * If it can, eat it. If not, do nothing.
     */
    public void lookForCrab()
    {
        if (canSee(Crab.class))
        {
            eat(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }

    /**
     * If the lobster is at the world edge, rotate lobster 180 degrees.
     */
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(180);
        }
    }

    /**
     * Adds some unsteady movement to the lobster.
     */
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100)<= 10)
        {
            turn(Greenfoot.getRandomNumber(91)-45);
        }
    }
}
