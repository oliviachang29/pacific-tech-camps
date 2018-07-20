import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrenchFries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrenchFries extends Mover
{
    /**
     * Act - do whatever the FrenchFries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        falling();
    }    
    /**
     * Make FrenchFries fall.
     */
    public void falling() 
    {
        setLocation(getX(), getY()+ Greenfoot.getRandomNumber(2)+1);
        if (getY() >= getWorld().getHeight()- 25)
        {
            RainBurgerWorld world = (RainBurgerWorld)getWorld();
            world.getLives().changeLife(-1);
            getWorld().removeObject(this);
        }
    } 
}
