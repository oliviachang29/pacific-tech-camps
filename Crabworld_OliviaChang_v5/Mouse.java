import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a mouse. mouses don't live on the beach.
 */
public class Mouse extends Animal
{
    //Create variables
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int foodEaten;
    private int animateCounter;
    
    public Mouse()
    {
        foodEaten = 0;
    }

    public void act()
    {
        move();
        checkKeyPress();
        lookForWorm();
    }

    /**
     * Check whether there are any keys pressed and rotate in the direction of the key pressed.
     */
    public void checkKeyPress() 
    {
        if(Greenfoot.isKeyDown("a")) {
            setRotation(getRotation() - 5);
        }        
        if(Greenfoot.isKeyDown("d")) {
            setRotation(getRotation() + 5);
        }
    }

    /**
     * Check whether the mouse can see a worm.
     * If we have, eat it. If not, do nothing.
     */
    public void lookForWorm()
    {
        if (canSee(Food.class))
        {
            eat(Food.class);
            foodEaten++;
            if (foodEaten == 50){
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new Food(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        }
    }
}
