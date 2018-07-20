import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Splat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splat extends Actor
{
    private int splatLife = 0;
    /**
     * Act - do whatever the Splat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (splatLife == 10)
        {
            getWorld().removeObject(this);
        }
        if (splatLife >= 0 ){
            splatLife++;
        }
    }    
}
