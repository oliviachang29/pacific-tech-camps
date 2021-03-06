import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A rocket that can be controlled by the arrowkeys: up, left, right.
 * The gun is fired by hitting the 'space' key. 'z' releases a proton wave.
 * 
 * @author Poul Henriksen
 * @author Michael Kolling
 * 
 * @version 1.0
 */
public class Rocket extends SmoothMover
{
    private static final int gunReloadTime = 5;         // The minimum delay between firing the gun.

    private int reloadDelayCount;               // How long ago we fired the gun the last time.
    
    private GreenfootImage rocket = new GreenfootImage("rocket.png");    
    private GreenfootImage rocketWithThrust = new GreenfootImage("rocketWithThrust.png");

    /**
     * Initilise this rocket.
     */
    public Rocket()
    {
        reloadDelayCount = 5;
        addForce(new Vector(13, 0.3));      // initially slowly drifting
    }

    /**
     * Do what a rocket's gotta do. (Which is: mostly flying about, and turning,
     * accelerating and shooting when the right keys are pressed.)
     */
    public void act()
    {
        move();
        checkKeys();
        reloadDelayCount++;
    }
    
    /**
     * Check whether there are any key pressed and react to them.
     */
    private void checkKeys() 
    {
        ignite(Greenfoot.isKeyDown("up"));

        if (Greenfoot.isKeyDown("left")) 
        {
            setRotation(getRotation() - 5);
        }
        if (Greenfoot.isKeyDown("right")) 
        {
            setRotation(getRotation() + 5);
        }
        if (Greenfoot.isKeyDown("space")) 
        {
            fire();
        }
    }
    
    /**
     * Should the rocket be ignited?
     */
    private void ignite(boolean boosterOn) 
    {
        if (boosterOn) 
        {
            setImage (rocketWithThrust);
            addForce (new Vector(getRotation(), 0.3));
        }
        else 
        {
            setImage(rocket);        
        }
    }
    
    /**
     * Fire a bullet if the gun is ready.
     */
    private void fire() 
    {
        if(reloadDelayCount >= gunReloadTime) 
        {
            Bullet bullet = new Bullet (getMovement().copy(), getRotation());
            getWorld().addObject (bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
        }
    }
    
}