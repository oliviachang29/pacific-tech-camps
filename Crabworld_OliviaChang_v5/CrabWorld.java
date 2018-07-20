import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {  
        super(560, 560, 1);   
        populateWorld();
        Greenfoot.playSound("doctormusic.wav");
    }
    /**
     * Populate the crab world.
     */
    public void populateWorld() 
    {  
        for(int i=0; i<50; i++){
            addObject(new Food(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        }
        for(int i=0; i<3; i++){
            addObject(new Lobster(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        }
        addObject(new Crab(), 280, 260);
        addObject(new Mouse(), 280, 360);
    }
}