import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Mover
{
    private int randomNumber = Greenfoot.getRandomNumber(2)+1;
    
    /**
     * Act - do whatever the Blob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        atEdge();
    }    
    /**
     * If blob is atWorldEdge then getWorld.removeObject(this)
     * 
     */
    private void atEdge() 
    {
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else 
        {
            Actor burger = getOneIntersectingObject(Hamburger.class);
            Actor hotdog = getOneIntersectingObject(HotDog.class);
            Actor frenchfries = getOneIntersectingObject(FrenchFries.class);
            if (burger != null)
            {
                RainBurgerWorld world = (RainBurgerWorld)getWorld();
                
                world.addObject(new Splat(), burger.getX(), burger.getY());
                world.removeObject(burger);
                
                world.getScore().addScore(10);
                world.removeObject(this);
            }
            else if (hotdog != null)
            {
                RainBurgerWorld world = (RainBurgerWorld)getWorld();
                
                world.addObject(new Splat(), hotdog.getX(), hotdog.getY());
                world.removeObject(hotdog);
                              
                world.getLives().changeLife(-randomNumber);
                world.removeObject(this);
            }
            else if (frenchfries != null)
            {
                RainBurgerWorld world = (RainBurgerWorld)getWorld();
                
                world.addObject(new Splat(), frenchfries.getX(), frenchfries.getY());
                world.removeObject(frenchfries);
                
                world.getScore().addScore(-30);
                world.removeObject(this);
            }
        }
    }   
}
