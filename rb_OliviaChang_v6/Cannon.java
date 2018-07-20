import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Actor
{   
    //Variable declaration
    private int intervalCounter = 0;
    private int intervalLimit = 15;
    
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
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setRotation(getRotation() + 5);
        }
        if (Greenfoot.isKeyDown("space") && intervalCounter == 0)
        {
            fire();
            intervalCounter = 1;
        }
        if (intervalCounter >=1){
            intervalCounter++;
        }
        if (intervalCounter == intervalLimit){
            intervalCounter = 0;
        }
    }
    
    /**
     * Create blob to fire.
     */
    private void fire() 
    {
        Blob blob = new Blob();
        getWorld().addObject(blob, getX(), getY());
        blob.setRotation(getRotation());
        blob.move(40.0);
    } 
}
