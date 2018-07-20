import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    private int speed;

    public Pizza()
    {
        speed = (Greenfoot.getRandomNumber(2)+1);
    }

    public void act() 
    {
        falling();
    }

    /**
     * Make the pizza fall with rotation and unsteady movement.
     * Remove pizza if the pizza at the bottom of the screen.
     */
    public void falling()
    {
        int newX = Greenfoot.getRandomNumber(8)-3;
        setLocation(getX()+ newX, getY()+speed);
        if (Greenfoot.getRandomNumber(1)== 1)
        {
            setRotation(getRotation()-1);
        } 
        else
        {
            setRotation(getRotation()-1);
        }
        if (getY() >= getWorld().getHeight()- 25)
        {
            getWorld().removeObject(this);
            /*
            CatWorld world = (CatWorld)getWorld();
            world.getScore().addScore(-10);
            */
        }
    }

}
