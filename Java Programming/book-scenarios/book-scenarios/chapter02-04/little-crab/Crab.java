import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    private int foodEaten;
    
        /**
     * Check whether there are any key pressed and react to them.
     */
    private void checkKeys() 
    {
        if(Greenfoot.isKeyDown("left")) {
            setRotation(getRotation() - 5);
        }        
        if(Greenfoot.isKeyDown("right")) {
            setRotation(getRotation() + 5);
        }
    }
    private void act()
    {
        move();
        checkKeys();
        if (Greenfoot.getRandomNumber(100)<= 10)
        {
            turn(Greenfoot.getRandomNumber(91)-45);
        }
        if (atWorldEdge())
        {
            turn(180);
        }
        if (canSee(Food.class))
        {
            eat(Food.class);
        }
    }
}
