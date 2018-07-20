import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Mover
{
    private int speed;

    public Fly()
    {
        speed = (Greenfoot.getRandomNumber(4)+1);
    }

    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveLeft();
    }    

    private void moveLeft()
    {
        setLocation(getX()- speed, getY());
        if (getX() <= 25)
        {
            getWorld().removeObject(this);
        }
    }

}
