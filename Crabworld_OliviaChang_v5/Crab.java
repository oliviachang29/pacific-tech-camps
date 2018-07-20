import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
    //Create variables
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int foodEaten;
    private int animateCounter;
    
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        foodEaten = 0;
        setImage(image1);
    }

    public void act()
    {
        move();
        checkKeyPress();
        lookForWorm();
        animate();
    }

    /**
     * Check whether there are any keys pressed and rotate in the direction of the key pressed.
     */
    public void checkKeyPress() 
    {
        if(Greenfoot.isKeyDown("left")) {
            setRotation(getRotation() - 5);
        }        
        if(Greenfoot.isKeyDown("right")) {
            setRotation(getRotation() + 5);
        }
    }

    /**
     * Check whether the crab can see a worm.
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
    /**
     * Animate the crab.
     */
    public void animate()
    {
        if (animateCounter == 5){
            if (getImage()== image1){
                setImage(image2);
            } else {
                setImage(image1);
            }
            animateCounter = 0;
        } else {
            animateCounter++;
        }
    }
}
