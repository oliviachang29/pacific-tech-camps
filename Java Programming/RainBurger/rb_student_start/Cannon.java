import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{
    /**
     * This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
    }    

    /**
     * Check if keys are pressed. If they are, react accordingly.
     */
    private void checkKeyPress() 
    {
        if (Greenfoot.isKeyDown("left")){
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("right")){
            setRotation(getRotation() + 5);
        }
    }    
}
