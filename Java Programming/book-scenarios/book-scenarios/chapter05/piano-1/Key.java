import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor //(Class declaration)
{
    private boolean isDown;

    /**
     * Create a new key. (Constructor)
     */
    public Key()
    {
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        whiteCheckKeyDown();
    }

    /**
     * Change image if the key is down.
     */
    public void whiteCheckKeyDown()
    {
        if (!isDown && Greenfoot.isKeyDown("g"))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
        } 
        else if (isDown && !Greenfoot.isKeyDown("g"))
        {
            setImage("white-key.png");
            isDown = false;
        } 
    }

    /**
     * 
     **/
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }
}