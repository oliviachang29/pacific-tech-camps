import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Mover
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        eat();
    }    
    /**
     * Check which keys have been pressed and react accordingly.
     */
    private void checkKeyPress() 
    {
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 10);
        }
        if (Greenfoot.isKeyDown("w") == false && Greenfoot.isKeyDown("up") == false)
        {
            setLocation(150, 300);
        }
    }    
    /**
     * Try to eat an object of class 'Fly'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat()
    {
        Actor flytoeat = getOneObjectAtOffset(10, 10, Fly.class);
        if(flytoeat != null) {
            getWorld().removeObject(flytoeat);
            
        }
    }
}
